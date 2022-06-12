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

package com.mycompany.android.tacotuesday.onboarding

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.annotation.DrawableRes
import androidx.annotation.StringRes
import androidx.fragment.app.FragmentActivity
import androidx.lifecycle.lifecycleScope
import androidx.preference.PreferenceManager
import androidx.recyclerview.widget.RecyclerView
import com.mycompany.android.tacotuesday.MainActivity
import com.mycompany.android.tacotuesday.R
import com.mycompany.android.tacotuesday.databinding.ActivityOnboardingBinding
import com.mycompany.android.tacotuesday.databinding.ItemOnboardingBinding
import kotlinx.coroutines.*

class OnboardingActivity : FragmentActivity() {

  private lateinit var binding: ActivityOnboardingBinding

  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)

    binding = ActivityOnboardingBinding.inflate(layoutInflater)
    setContentView(binding.root)
    val pagerAdapter = OnboardingPagerAdapter()
    binding.onboardingPager.adapter = pagerAdapter

    lifecycleScope.launch(Dispatchers.IO) {
      val options = resources.getStringArray(R.array.pop_up_options)
      while (isActive) {
        delay(5000) // 5 seconds

        withContext(Dispatchers.Main) {
          if (binding.onboardingPager.currentItem == NUM_PAGES - 1) {
            MainActivity.startActivity(this@OnboardingActivity)
            this.cancel()
          } else {
            binding.onboardingPager.currentItem++
          }
        }
      }
    }

    val sharedPref = PreferenceManager.getDefaultSharedPreferences(this)
    with(sharedPref.edit()) {
      putBoolean("onboarding", false)
      apply()
    }
  }

  override fun onBackPressed() {
    if (binding.onboardingPager.currentItem == 0) {
      // If the user is currently looking at the first step, allow the system to handle the
      // Back button. This calls finish() on this activity and pops the back stack.
      super.onBackPressed()
    } else {
      // Otherwise, select the previous step.
      binding.onboardingPager.currentItem--
    }
  }

  private inner class OnboardingPagerAdapter :
      RecyclerView.Adapter<OnboardingPagerAdapter.ViewHolder>() {

    override fun getItemCount(): Int = NUM_PAGES
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
      return ViewHolder(
          ItemOnboardingBinding.inflate(LayoutInflater.from(parent.context), parent, false))
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
      holder.bind(pages[position])
    }

    inner class ViewHolder(val itemBinding: ItemOnboardingBinding) :
        RecyclerView.ViewHolder(itemBinding.root) {

      fun bind(data: OnboardingItem) {
        itemBinding.onboardingImage.contentDescription =
            getString(data.imageDescriptionRes)
        itemBinding.onboardingImage.setImageResource(data.imageRes)
        itemBinding.onbardingText.setText(data.messageRes)
      }
    }
  }

  class OnboardingItem(
      @DrawableRes val imageRes: Int,
      @StringRes val messageRes: Int,
      @StringRes val imageDescriptionRes: Int
  )

  companion object {
    private const val NUM_PAGES = 4

    private val pages = listOf(
        OnboardingItem(
            R.drawable.onboarding_try,
            R.string.onboarding_try_it,
            R.string.onboarding_try_it_description
        ),
        OnboardingItem(
            R.drawable.onboarding_discard,
            R.string.onboarding_discard,
            R.string.onboarding_discard_description
        ),
        OnboardingItem(
            R.drawable.onboarding_list,
            R.string.onboarding_view_list,
            R.string.onboarding_view_list_description
        ),
        OnboardingItem(
            R.drawable.taco_1,
            R.string.onboarding_taco_tuesday,
            R.string.onboarding_taco_tuesday_description
        )
    )

    fun startActivity(context: Context) {
      context.startActivity(Intent(context, OnboardingActivity::class.java))
    }
  }
}