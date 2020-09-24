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

package com.raywenderlich.android.tacotuesday.tryIt

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.core.view.ViewCompat
import androidx.navigation.findNavController
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.google.android.material.dialog.MaterialAlertDialogBuilder
import com.raywenderlich.android.tacotuesday.R
import com.raywenderlich.android.tacotuesday.data.Recipe
import com.raywenderlich.android.tacotuesday.databinding.ItemTryItRecipeBinding

class TryItRecipesRecyclerViewAdapter(
    private val onDiscardRecipe: (Recipe) -> Unit,
    private val toggleHasMade: (Recipe) -> Unit
) : ListAdapter<Recipe, TryItRecipesRecyclerViewAdapter.ViewHolder>(RecipeDiffCallback()) {

  init {
    setHasStableIds(true)
  }

  override fun getItemId(position: Int): Long {
    return getItem(position).id
  }

  override fun onBindViewHolder(holder: ViewHolder, position: Int) {
    holder.bind(getItem(position))
  }

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder = ViewHolder(
      ItemTryItRecipeBinding.inflate(LayoutInflater.from(parent.context), parent, false))

  fun getRecipeAtPosition(position: Int): Recipe = getItem(position)

  inner class ViewHolder(
      private val binding: ItemTryItRecipeBinding
  ) : RecyclerView.ViewHolder(binding.root) {

    val viewForeground = binding.itemRecipeCard

    fun bind(recipe: Recipe) {
      binding.itemRecipeTitle.text = recipe.name
      binding.itemRecipeRating.rating = recipe.nachoRating ?: 0
      binding.itemRecipeMade.isChecked = recipe.hasMade
      binding.itemRecipeMade.setOnCheckedChangeListener { _, isChecked ->
        if (isChecked != recipe.hasMade) toggleHasMade(recipe)
      }
      binding.itemRecipeMade.contentDescription =
          itemView.context.getString(
              R.string.try_it_description_made_recipe, recipe.name)
      binding.itemRecipeDetails.setOnClickListener {
        itemView.findNavController().navigate(
            TryItRecipesFragmentDirections
                .actionTryItRecipesFragmentToRecipeDetailFragment(recipe.id))
      }
      binding.itemRecipeDetails.contentDescription =
          itemView.context.getString(
              R.string.try_it_description_details_recipe, recipe.name)
      binding.itemRecipeDiscard.setOnClickListener {
        onDiscardRecipe(recipe)
      }
      binding.itemRecipeTitle.setOnLongClickListener {
        MaterialAlertDialogBuilder(it.context)
            .setTitle(R.string.try_it_discard_confirm_title)
            .setMessage(it.context.getString(
                R.string.try_it_discard_confirm_message, recipe.name))
            .setPositiveButton(
                R.string.try_it_discard_confirm_discard) { _, _ ->
              onDiscardRecipe(recipe)
            }
            .setNegativeButton(
                R.string.try_it_discard_confirm_cancel) { _, _ -> }
            .show()
        true
      }
      ViewCompat.setAccessibilityDelegate(binding.root,
          DeleteRecipeAccessibilityDelegate(recipe.name))
    }
  }
}

class RecipeDiffCallback : DiffUtil.ItemCallback<Recipe>() {
  override fun areItemsTheSame(oldItem: Recipe, newItem: Recipe) = oldItem.id == newItem.id
  override fun areContentsTheSame(oldItem: Recipe, newItem: Recipe) = oldItem == newItem
}
