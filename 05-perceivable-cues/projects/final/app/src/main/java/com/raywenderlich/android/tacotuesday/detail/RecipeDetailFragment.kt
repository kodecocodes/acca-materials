/*
 * Copyright (c) 2020 Razeware LLC
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * Notwithstanding the foregoing, you may not use, copy, modify, merge, publish,
 * distribute, sublicense, create a derivative work, and/or sell copies of the
 * Software in any work that is designed, intended, or marketed for pedagogical or
 * instructional purposes related to programming, coding, application development,
 * or information technology.  Permission for such use, copying, modification,
 * merger, publication, distribution, sublicensing, creation of derivative works,
 * or sale is expressly withheld.
 *
 * This project and source code may use libraries or frameworks that are
 * released under various Open-Source licenses. Use of those libraries and
 * frameworks are governed by their own individual licenses.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 */

package com.raywenderlich.android.tacotuesday.detail

import android.os.Bundle
import android.text.method.LinkMovementMethod
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.core.content.ContextCompat
import androidx.core.content.res.ResourcesCompat
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.lifecycle.Observer
import androidx.lifecycle.viewModelScope
import com.raywenderlich.android.tacotuesday.R
import com.raywenderlich.android.tacotuesday.data.Recipe
import com.raywenderlich.android.tacotuesday.databinding.FragmentRecipeDetailBinding
import dagger.hilt.android.AndroidEntryPoint
import io.noties.markwon.AbstractMarkwonPlugin
import io.noties.markwon.Markwon
import io.noties.markwon.core.MarkwonTheme

@AndroidEntryPoint
class RecipeDetailFragment : Fragment() {

  private lateinit var binding: FragmentRecipeDetailBinding
  private val viewModel: RecipeDetailViewModel by viewModels()
  private val markwon by getMarkwon()

  private fun getMarkwon(): Lazy<Markwon> {
    return lazy {
      Markwon.builder(requireContext())
          .usePlugin(object : AbstractMarkwonPlugin() {
            override fun configureTheme(builder: MarkwonTheme.Builder) {
              builder.linkColor(ContextCompat.getColor(requireContext(),
                  R.color.colorPrimary))
            }
          })
          .build()
    }
  }

  override fun onCreateView(
      inflater: LayoutInflater,
      container: ViewGroup?,
      savedInstanceState: Bundle?
  ): View? {
    binding = FragmentRecipeDetailBinding.inflate(layoutInflater, container, false)
    viewModel.recipe.observe(viewLifecycleOwner, { recipe ->
      showRecipeDetails(recipe)
      if (recipe.wantsToTry) {
        showEditableFields(recipe)
      } else {
        hideEditableFields(recipe)
      }
    })
    return binding.root
  }

  private fun showRecipeDetails(recipe: Recipe) = with(binding) {
    recipeDetailRecipe.setMarkdown(recipe.recipe.toMarkdownOrDefaultText(
        getString(R.string.recipe_detail_recipe)))
    recipeDetailBaseLayer.setMarkdown(recipe.baseLayer.toMarkdownOrDefaultText(
        getString(R.string.recipe_detail_base_layer)))
    recipeDetailCondiment.setMarkdown(recipe.condiment.toMarkdownOrDefaultText(
        getString(R.string.recipe_detail_condiment)))
    recipeDetailMixin.setMarkdown(recipe.mixin.toMarkdownOrDefaultText(
        getString(R.string.recipe_detail_mixin)))
    recipeDetailSeasoning.setMarkdown(recipe.seasoning.toMarkdownOrDefaultText(
        getString(R.string.recipe_detail_seasoning)))
    recipeDetailShell.setMarkdown(recipe.shell.toMarkdownOrDefaultText(
        getString(R.string.recipe_detail_shell)))
    recipeDetailCreditText.movementMethod = LinkMovementMethod.getInstance()
    recipeDetailComplimentTheChef.setOnClickListener {
      binding.recipeDetailErrorView.visibility = View.VISIBLE
    }
  }

  private fun TextView.setMarkdown(markdown: CharSequence) {
    text = markdown
    movementMethod = LinkMovementMethod.getInstance()
  }

  private fun String?.toMarkdownOrDefaultText(label: String) = if (this != null) {
    markwon.toMarkdown(this)
  } else {
    getString(R.string.recipe_detail_default_text, label)
  }

  private fun showEditableFields(recipe: Recipe) = with(binding) {
    recipeDetailTryDiscardButton.contentDescription =
        getString(R.string.shared_discard)
    recipeDetailTryDiscardButton.text =
        getString(R.string.shared_discard)
    recipeDetailTryDiscardButton.icon =
        ResourcesCompat.getDrawable(resources,
            R.drawable.ic_baseline_thumb_down_24,
            requireContext().theme)
    recipeDetailTryDiscardButton.setOnClickListener {
      viewModel.discardRecipe(recipe, viewModel.viewModelScope)
    }
    recipeNachoRating.rating = recipe.nachoRating ?: 0
    recipeSpiceRating.rating = recipe.spiceRating ?: 0
    recipeDetailNotesEditText.setText(recipe.notes)
    recipeDetailMadeIt.isChecked = recipe.hasMade
    recipeDetailMadeIt.setOnCheckedChangeListener { _, _ -> activity?.onBackPressed() }
    recipeNachoRatingContainer.visibility = View.VISIBLE
    recipeSpiceRatingContainer.visibility = View.VISIBLE
    recipeDetailNotesInputLayout.visibility = View.VISIBLE
    recipeDetailMadeIt.visibility = View.VISIBLE
    recipeDetailMadeItLabel.visibility = View.VISIBLE
  }

  private fun hideEditableFields(recipe: Recipe?) = with(binding) {
    recipeDetailTryDiscardButton.contentDescription =
        getString(R.string.shared_try_it)
    recipeDetailTryDiscardButton.text =
        getString(R.string.shared_try_it)
    recipeDetailTryDiscardButton.icon =
        ResourcesCompat.getDrawable(resources,
            R.drawable.ic_baseline_thumb_up_24,
            requireContext().theme)
    recipeDetailTryDiscardButton.setOnClickListener {
      viewModel.tryRecipe(recipe, viewModel.viewModelScope)
    }
    recipeNachoRatingContainer.visibility = View.GONE
    recipeSpiceRatingContainer.visibility = View.GONE
    recipeDetailNotesInputLayout.visibility = View.GONE
    recipeDetailMadeIt.visibility = View.GONE
    recipeDetailMadeItLabel.visibility = View.GONE
  }

  override fun onPause() {
    val recipe = viewModel.recipe.value
    if (recipe?.wantsToTry == true) {
      viewModel.tryRecipe(recipe.copy(
          nachoRating = binding.recipeNachoRating.rating,
          spiceRating = binding.recipeSpiceRating.rating,
          notes = binding.recipeDetailNotesEditText.text.toString(),
          hasMade = binding.recipeDetailMadeIt.isChecked
      ), viewModel.viewModelScope)
    }
    super.onPause()
  }
}
