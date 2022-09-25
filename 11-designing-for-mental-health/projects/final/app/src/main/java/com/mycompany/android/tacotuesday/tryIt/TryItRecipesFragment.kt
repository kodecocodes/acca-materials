/*
 * Copyright (c) 2022 Razeware LLC
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

package com.mycompany.android.tacotuesday.tryIt

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.lifecycle.Observer
import androidx.lifecycle.viewModelScope
import androidx.recyclerview.widget.ItemTouchHelper
import androidx.recyclerview.widget.LinearLayoutManager
import com.google.android.material.snackbar.Snackbar
import com.mycompany.android.tacotuesday.data.Recipe
import com.mycompany.android.tacotuesday.databinding.FragmentTryItRecipesListBinding
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class TryItRecipesFragment : Fragment() {

  private lateinit var binding: FragmentTryItRecipesListBinding
  private val viewModel: TryItRecipesViewModel by viewModels()

  override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
      savedInstanceState: Bundle?): View? {
    binding = FragmentTryItRecipesListBinding.inflate(
        layoutInflater, container, false)

    val recipeRecyclerViewAdapter = TryItRecipesRecyclerViewAdapter(::discard, ::toggleHasMade)
    with(binding.root) {
      layoutManager = LinearLayoutManager(context)
      adapter = recipeRecyclerViewAdapter
      itemAnimator = null
    }

    ItemTouchHelper(SwipeToDiscardCallback(recipeRecyclerViewAdapter, ::discard))
        .attachToRecyclerView(binding.root)

    with(viewModel) {
      savedRecipes.observe(viewLifecycleOwner, {
        (binding.root.adapter as TryItRecipesRecyclerViewAdapter).submitList(it)
      })
    }
    return binding.root
  }

  private fun discard(recipe: Recipe) {
    viewModel.discardRecipe(recipe, viewModel.viewModelScope)
    Snackbar.make(binding.root,
        "Note deleted",
        Snackbar.LENGTH_LONG)
        .setAction("Undo") { viewModel.tryRecipe(recipe, viewModel.viewModelScope) }
        .show()
  }

  private fun toggleHasMade(recipe: Recipe) {
    viewModel.tryRecipe(recipe.copy(hasMade = !recipe.hasMade), viewModel.viewModelScope)
  }
}