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

package com.raywenderlich.android.tacotuesday.discover

import android.os.Bundle
import android.util.TypedValue
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.constraintlayout.motion.widget.MotionLayout
import androidx.constraintlayout.motion.widget.TransitionAdapter
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.lifecycle.Observer
import androidx.navigation.fragment.findNavController
import com.raywenderlich.android.tacotuesday.R
import com.raywenderlich.android.tacotuesday.data.Recipe
import com.raywenderlich.android.tacotuesday.databinding.FragmentDiscoverBinding
import dagger.hilt.android.AndroidEntryPoint
import io.noties.markwon.AbstractMarkwonPlugin
import io.noties.markwon.Markwon
import io.noties.markwon.core.MarkwonTheme

@AndroidEntryPoint
class DiscoverFragment : Fragment() {

  private val viewModel: DiscoverViewModel by viewModels()
  private lateinit var binding: FragmentDiscoverBinding
  private val markwon by getMarkwon()

  override fun onCreateView(
      inflater: LayoutInflater,
      container: ViewGroup?,
      savedInstanceState: Bundle?
  ): View? {

    binding = FragmentDiscoverBinding.inflate(layoutInflater, container, false)

    binding.discoverMotionLayout.setTransitionListener(object : TransitionAdapter() {
      override fun onTransitionCompleted(motionLayout: MotionLayout, currentId: Int) {
        when (currentId) {
          R.id.discard -> {
            recipeLoading()
            motionLayout.progress = 0f
            motionLayout.transitionToState(R.id.start)
            viewModel.discard(viewModel.nextRecipe.value)
          }
          R.id.try_it -> {
            recipeLoading()
            motionLayout.progress = 0f
            motionLayout.transitionToState(R.id.start)
            viewModel.tryIt(viewModel.nextRecipe.value)
          }
        }
      }
    })

    binding.discoverButtonTry.setOnClickListener {
      binding.discoverMotionLayout.transitionToState(R.id.try_it)
    }
    binding.discoverButtonDiscard.setOnClickListener {
      binding.discoverMotionLayout.transitionToState(R.id.discard)
    }

    binding.discoveryCardDetailButton.setOnClickListener {
      binding.discoveryCardDetailButton.isEnabled = false // prevent double clicking
      viewModel.nextRecipe.value?.let {
        findNavController().navigate(
            DiscoverFragmentDirections.actionDiscoverFragmentToRecipeDetailFragment(it.id))
      }
    }
    with(viewModel) {
      nextRecipe.observe(viewLifecycleOwner, Observer { showRecipe(it) })
      viewModel.fetchRandomTaco()
    }
    return binding.root
  }

  private fun showRecipe(recipe: Recipe) {
    binding.discoverRecipeImage.setImageResource(recipe.photoRes)
    binding.discoveryCardRecipeDescription.text = markwon.toMarkdown(recipe.recipe)
  }

  private fun recipeLoading() {
    binding.discoverRecipeImage.setImageDrawable(null)
    binding.discoveryCardRecipeDescription.text = null
  }

  private fun getMarkwon(): Lazy<Markwon> {
    return lazy {
      Markwon.builder(requireContext())
          .usePlugin(object : AbstractMarkwonPlugin() {
            override fun configureTheme(builder: MarkwonTheme.Builder) {
              val typedValue = TypedValue()
              requireContext().theme.resolveAttribute(R.attr.colorOnPrimary, typedValue, true)
              builder.linkColor(typedValue.data)
            }
          })
          .build()
    }
  }
}
