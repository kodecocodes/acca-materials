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

package com.mycompany.android.tacotuesday

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.lifecycleScope
import androidx.navigation.findNavController
import androidx.preference.PreferenceManager
import com.mycompany.android.tacotuesday.databinding.ActivityMainBinding
import com.mycompany.android.tacotuesday.onboarding.OnboardingActivity
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.coroutines.*
import kotlin.random.Random

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {

  override fun onCreate(savedInstanceState: Bundle?) {
    // Switch to AppTheme for displaying the activity
    setTheme(R.style.AppTheme)

    super.onCreate(savedInstanceState)
    val sharedPref = PreferenceManager.getDefaultSharedPreferences(this)
    val showOnboarding = sharedPref.getBoolean("onboarding", true)
    if (showOnboarding) {
      OnboardingActivity.startActivity(this)
      finish()
    }

    val binding = ActivityMainBinding.inflate(layoutInflater)
    setContentView(binding.root)

    binding.bottomNavigationView.setOnNavigationItemSelectedListener { item ->
      when (item.itemId) {
        R.id.item_discover -> {
          findNavController(R.id.nav_host_fragment).navigate(R.id.discoverFragment)
          true
        }
        R.id.item_try_it -> {
          findNavController(R.id.nav_host_fragment).navigate(R.id.tryItRecipesFragment)
          true
        }
        R.id.item_settings -> {
          findNavController(R.id.nav_host_fragment).navigate(R.id.settingsFragment)
          true
        }
        else -> false
      }
    }

    lifecycleScope.launch(Dispatchers.IO) {
      val options = resources.getStringArray(R.array.pop_up_options)
      while (isActive) {
        withContext(Dispatchers.Main) {
          val randomIndex = Random.nextInt(options.size - 1)
          val randomMessage = options[randomIndex]
          binding.mainBanner.text = randomMessage
          binding.mainBanner.setOnClickListener {
            AlertDialog.Builder(this@MainActivity)
                .setMessage(resources
                    .getStringArray(R.array.pop_up_alternates)[randomIndex])
                .setPositiveButton(R.string.shared_dismiss, null)
                .show()
          }
        }

        delay(60000) // 60 seconds
      }
    }
  }

  companion object {

    fun startActivity(context: Context) {
      context.startActivity(Intent(context, MainActivity::class.java))
    }
  }
}
