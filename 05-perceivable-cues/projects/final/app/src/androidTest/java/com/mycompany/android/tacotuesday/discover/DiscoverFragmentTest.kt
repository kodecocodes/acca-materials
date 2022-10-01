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

package com.mycompany.android.tacotuesday.discover

import androidx.test.core.app.ActivityScenario
import androidx.test.espresso.Espresso
import androidx.test.espresso.accessibility.AccessibilityChecks
import androidx.test.espresso.action.ViewActions
import androidx.test.espresso.matcher.ViewMatchers
import androidx.test.espresso.matcher.ViewMatchers.withId
import androidx.test.platform.app.InstrumentationRegistry
import com.google.android.apps.common.testing.accessibility.framework.AccessibilityCheckResultUtils.matchesViews
import com.nhaarman.mockitokotlin2.*
import com.mycompany.android.tacotuesday.MainActivity
import com.mycompany.android.tacotuesday.R
import com.mycompany.android.tacotuesday.data.Recipe
import com.mycompany.android.tacotuesday.data.RecipeRepository
import com.mycompany.android.tacotuesday.data.RepositoryModule
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import dagger.hilt.android.testing.HiltAndroidRule
import dagger.hilt.android.testing.HiltAndroidTest
import dagger.hilt.android.testing.UninstallModules
import kotlinx.coroutines.runBlocking
import org.hamcrest.Matchers.anyOf
import org.junit.Before
import org.junit.Rule
import org.junit.Test
import javax.inject.Inject
import javax.inject.Singleton

@HiltAndroidTest
@UninstallModules(RepositoryModule::class)
class DiscoverFragmentTest {

  @get:Rule
  var hiltRule = HiltAndroidRule(this)

  @Inject
  lateinit var repository: RecipeRepository

  private var testRecipe = Recipe(
      id = 1,
      name = "Slow Cooker Chicken in Chile de Arbol",
      recipe = "This is much like the Slow-Cooked Salsa Verde Chicken, but cooked in the Chile de Arbol sauce.",
      photoRes = R.drawable.taco_1
  )

  @Before
  fun setup() {
    hiltRule.inject()
    runBlocking {
      whenever(repository.randomTacoRecipe()).doReturn(testRecipe)
    }

    AccessibilityChecks.enable()
        .setRunChecksFromRootView(true)
        .setSuppressingResultMatcher(
            anyOf(
                matchesViews(withId(R.id.discover_button_discard)),
                matchesViews(withId(R.id.discover_button_try))
            )
        )
  }

  @Test
  fun testSwipeToTryItFetchesNewRecipe() {
    runBlocking {
      launchFragment()

      Espresso.onView(ViewMatchers.withId(R.id.discover_button_try))
          .perform(ViewActions.click())

      verify(repository, times(2)).randomTacoRecipe()
    }
  }

  @Test
  fun testSwipeToDiscardFetchesNewRecipe() {
    runBlocking {
      launchFragment()

      Espresso.onView(ViewMatchers.withId(R.id.discover_button_discard))
          .perform(ViewActions.click())

      verify(repository, times(2)).randomTacoRecipe()
    }
  }

  private fun launchFragment() {
    ActivityScenario.launch(MainActivity::class.java)

    InstrumentationRegistry.getInstrumentation().waitForIdleSync()

    Espresso.onView(ViewMatchers.withText("Close"))
        .perform(ViewActions.click())
  }

  @Module
  @InstallIn(SingletonComponent::class)
  object TestModule {

    @Provides
    @Singleton
    fun provideMockRecipeRepository(): RecipeRepository = mock()
  }
}
