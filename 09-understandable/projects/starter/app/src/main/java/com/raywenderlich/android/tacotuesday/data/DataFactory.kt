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

package com.raywenderlich.android.tacotuesday.data

import com.raywenderlich.android.tacotuesday.R

/**
 * All recipes are from https://github.com/sinker/tacofancy
 */
object DataFactory {

  fun recipeData(): List<Recipe> {
    val chorizo = "Chorizo\n" +
        "=======\n" +
        "\n" +
        "_Adapted from [Aredridel's Lightly Seasoned Beef](aredridel_lightly_seasoned_beef.md)_\n" +
        "\n" +
        "* 20 oz chorizo\n" +
        "* 20 g black cumin seed, ground\n" +
        "* 2 cloves garlic\n" +
        "* 15 ml white wine\n" +
        "* 4 g salt if wine is unsalted\n" +
        "* 1/2 small white onion, diced\n" +
        "* Oil to coat the pan\n" +
        "\n" +
        "__Directions__\n" +
        "\n" +
        "1. Heat oil in the pan.\n" +
        "2. Add in onions, stirring occasionally until onions become translucent.\n" +
        "3. Toss in the garlic, and the chorizo on top of that.\n" +
        "4. Add the cumin. Brown the chorizo.\n" +
        "5. Use the splash of wine to loosen anything stuck to the pan.\n" +
        "\n" +
        "Perfect, lightly seasoned taco meat."
    val chipotleSauce = "Chipotlé Sauce\n" +
        "==============\n" +
        "\n" +
        "__Ingredients__\n" +
        "\n" +
        "* 1 cup plain Greek yogurt\n" +
        "* Juice from 2 limes\n" +
        "* 2-3 chipotlé peppers, with surrounding adobo sauce from can\n" +
        "\n" +
        "__Directions__\n" +
        "\n" +
        "1. Drop all of this into a food processor, and blend away.\n" +
        "2. Let sit in fridge for 30 minutes or overnight for flavor melding. \n" +
        "3. Add to tacos, and anything else you'd like.\n" +
        "\n" +
        "tags: vegetarian"
    val slowCookedSalsaVerdeChicken = "Slow-Cooked Salsa Verde Chicken\n" +
        "===============================\n" +
        "\n" +
        "Low-effort, delicious shredded chicken based off [this recipe](http://www.skinnytaste.com/2013/04/easiest-crock-pot-salsa-verde-chicken.html). To minimize prep time, just toss in a jar of storebought salsa verde.\n" +
        "\n" +
        "* 2 lbs skinless chicken breasts\n" +
        "* 2 cups salsa verde\n" +
        "* 1 tsp minced garlic or 1/4 tsp garlic powder\n" +
        "* Pinch of Oregano _(Note: I ran out of Oregano, but the recipe still tastes great without it.)_\n" +
        "* Pinch of Cumin\n" +
        "* Salt, to taste\n" +
        "\n" +
        "Add chicken to slow cooker and season with garlic, oregano, cumin and salt. Pour salsa verde over everything, cover and cook for two hours on high.\n" +
        "\n" +
        "Once that's ready, shred chicken. Give it another stir to cover everything in " +
        "sauce, then serve."
    val salsaDeAguacate = "Salsa de Aguacate\n" +
        "==========\n" +
        "\n" +
        "This is the traditional green sauce served from a Mexican taco cart. Very popular with Tacos al Pastór or Tacos de Canasta, it is a creamy, green sauce. It has avacado, but it by no means a guacamole. Usually available with other taco cart staples such as: sliced radishes, spicy salsa roja, fresh cilantro, and fresh limes.\n" +
        "\n" +
        "* 1/2 Kilo of Green Tomatillos (~1lb.)\n" +
        "* 2 green Serrano peppers (optional for heat)\n" +
        "* 1 avocado\n" +
        "* 2 limes\n" +
        "* 1/2 cup crema (Mexican sour cream, thinner and sweeter than standard sour cream)\n" +
        "\n" +
        "Cook the tomatillos and peppers in a pot with water until soft. Drain the water out and let cool.\n" +
        "\n" +
        "Put tomatillos, peppers, salt, lime-juice, crema, and avacado (shelled and pitted) in blender. With lid on, blend until completely mixed and liquid consistency. Salsa should be the consistency of crema, liquid, yet slightly viscous.\n" +
        "\n" +
        "Pour over your tacos liberally. Refrigerate between uses.\n" +
        "\n" +
        "tags: vegetarian"
    val pickedRedOnions = "Pickled Red Onions\n" +
        "==================\n" +
        "\n" +
        "My wife made this recipe up, after eating something similar, but if you are making brisket tacos, it is the most wonderful accessory:\n" +
        "\n" +
        "__Ingredients__\n" +
        "\n" +
        "* Vinegar\n" +
        "* 2 chopped red onions\n" +
        "* 1 tablespoon of sugar\n" +
        "* a dash of chili powder\n" +
        "\n" +
        "Chop the red onions into rings and put them into a container of vinegar. Add the sugar and store the mixture in your refrigerator to marinate and pickle, the longer the better.\n" +
        "\n" +
        "Pick out the rings and place them on your brisket taco. Eat.\n" +
        "\n" +
        "Variations\n" +
        "----------\n" +
        "\n" +
        "Pickled onions are a favorite in the Von Doom house, too. [@littlewhirl](http://twitter.com/littlewhirl) played around with a similar starting point and we use this brine instead:\n" +
        "\n" +
        "* 1/2 cup apple cider vinegar\n" +
        "* 1 T Sugar (I usually use coconut palm sugar because I'm a hippie I guess)\n" +
        "* Water\n" +
        "* 1 1/2 tsp salt\n" +
        "* 1 sprig fresh oregano and/or cilantro (optional)\n" +
        "\n" +
        "Slice 1 red onion on a mandolin (WORTH IT). In a bowl melt the sugar and salt with some warm/hot water. Add vinegar and 1c of filtered water.\n" +
        "Add in onion, top off w/ water so that the onion is just covered.\n" +
        "VERY IMPORTANT: Let sit at room temp for at least an hour. Trust me.\n" +
        "\n" +
        "The apple cider vinegar is a tangier but also more subtle, keeping more of the onion flavor there. And using a partial salt water brine lets it work nice for quick pickles, but also for slightly longer engagements. Leading to the most important aspect:\n" +
        "\n" +
        "PICKLE ALL THE THINGS\n" +
        "---------------------\n" +
        "\n" +
        "Seriously. All the things. Pickle your fridge. Pickle your waffles. Make. Lots. Of. Pickles.\n" +
        "\n" +
        "* __Cabbage__ — red or green work. You only need an hour or so (like onions)\n" +
        "* __Jalepeños__ — seriously GTFO these are good. Add dill for a twist. Add parboiled carrots if you want to cut the spice\n" +
        "* __Greenbeans__ — because greenbeans are goddam delicious\n" +
        "* __Toy cars — kid with an attitude? Pickle their favorite toy car. Let's see them try to cop a tude when their matchbox cars are soggy and briney\n" +
        "* __Cauliflower__ — personal favorite. Pickles in an hour, super delicious\n" +
        "* __Baby corn__ — baby corn is gross, but if you pickle it you can make jokes about how big all the other things you pickled are\n" +
        "\n" +
        "tags: vegetarian, vegan"
    val salsaVerde = "Simple Salsa Verde\n" +
        "==================\n" +
        "\n" +
        "I got this base recipe from a vegan friend. If you can't find one of these peppers, swap in another one!\n" +
        "\n" +
        "* 6 Average-sized tomatillos\n" +
        "* 1 Poblano pepper\n" +
        "* 1 Serrano pepper\n" +
        "* 1 Jalapeno pepper\n" +
        "* 1 Sweet red pepper\n" +
        "* Juice of 1 or 2 fresh-squeezed limes (to taste)\n" +
        "* Pinch or two kosher salt (to taste)\n" +
        "\n" +
        "You're in charge of the heat here. For a milder salsa, remove all the ribs and seeds inside the peppers. For medium, leave in a few ribs, and for hot, go nuts. Rough chop the peppers and tomatillos, then throw into a blender or food processor with salt and lime juice. Pulse to desired consistency.\n" +
        "\n" +
        "As with most salsas, this will taste better if you let it sit in the fridge for a few hours before eating. It's great on chips or drizzled over steak or pork tacos.\n" +
        "\n" +
        "tags: vegetarian, vegan"
    val choppedSteak = "Chopped Steak\n" +
        "=============\n" +
        "\n" +
        "I like all kinds of steak tacos, but lately have been into cubed up steak tacos that are allowed to marinate a little bit in some salsa verde and other spices. Here's the ones I made tonight:\n" +
        "\n" +
        "* 1lb rib eye steak, cubed into ~1\" cubes\n" +
        "* Salsa verde, your choice, about 2-3 Tbs\n" +
        "* Pinch or two of mexican oregano\n" +
        "* A few healthy sprinkles of chili powder\n" +
        "\n" +
        "Cube up your steak, mix everything together, cover and let sit for a half hour or so.\n" +
        "\n" +
        "When everything else is ready to go, pan-fry (or, skewer and grill if you're feeling ambitious), until cooked to your chosen meat level."
    val sweetPotatoAndAppleHash = "Sweet Potato and Apple Hash\n" +
        "===========================\n" +
        "\n" +
        "Sweet potatoes are my go-to taco punch-up. I was going my normal route of making small (1/4\" or so) cubes of sweet potatoes when I thought: Hey, it's fall, I'm going to add an apple in there. Fuck yes.\n" +
        "\n" +
        "* 2 Small sweet potatoes (you'd be amazed how little sweet potato you need for tacos)\n" +
        "* 1 Small apple\n" +
        "* One can diced green chilis\n" +
        "* A couple pinches of chili powder\n" +
        "* A squeeze of honey\n" +
        "* Pat o' butter\n" +
        "\n" +
        "Mix this all into a pan, with about 1/4 cup of water, and boil it all up until the water goes away, toss in the butter, and continue to pan-fry until things get a little browned. \n" +
        "\n" +
        "tags: vegetarian"
    val swissChard = "Swiss Chard\n" +
        "===========\n" +
        "\n" +
        "This is actually a Rick Bayless recipe from his cookbook _Mexican Everyday_, but we've used it a fair amount on those days we feel like not eating meat but still want to have tacos.\n" +
        "\n" +
        "__Ingredients__\n" +
        "\n" +
        "* 1 bunch swiss or rainbow chard. Could also do spinach I guess. Probably not good with kale.\n" +
        "* 1 onion sliced thin\n" +
        "* 1/2 cup of chicken or vegetable broth\n" +
        "\n" +
        "Slice up the chard into small slices. In a large skillet, heat the oil on medium-high. Cook the onions until soft, plus some garlic and red pepper flakes if you want. Put the chard in the skillet, add the broth. Cover the pan and reduce the heat to medium-low and cook until the greens are wilted and almost tender (about 5 minutes). Uncover, bring heat back to medium high and cook until almost dry. Salt as necessary. Enjoy.\n" +
        "\n" +
        "tags: vegetarian"
    val basicShreddedChicken = "Basic Shredded Chicken\n" +
        "======================\n" +
        "\n" +
        "This recipe creates enough shredded chicken for 2 to 3 meals. It's a savory, universal base; once cooked, you can supplement with any number of spices or treatments to make tacos, taquitos, soups, enchiladas ... even Italian or Indian applications if you like.\n" +
        "\n" +
        "__In the Crockpot__\n" +
        "\n" +
        "* 4-5 lbs. boneless skinless chicken breast\n" +
        "* 1 can chicken broth\n" +
        "* 1 tsp chili powder\n" +
        "* 1/2 tsp cumin\n" +
        "* 1/2 tsp garlic powder\n" +
        "* 1/2 tsp oregano\n" +
        "* kosher salt\n" +
        "* black pepper\n" +
        "\n" +
        "Salt the chicken breasts (be reasonably generous here), then crack some black pepper over each. In your crockpot, mix garlic powder, chili powder, cumin and oregano into the broth. Place chicken in crockpot, then cook on low for 8 hours.\n" +
        "\n" +
        "When the chicken is done, attack each piece with two forks to shred. Do this on a Sunday and you'll have an easy time putting together meals throughout the week.\n" +
        "\n" +
        "I often give this a quick simmer with a bit of water and [universal taco " +
        "seasoning](https://github.com/sinker/tacofancy/blob/master/seasonings/universal_taco_seasoning.md) for taco filling. Or throw it into tortilla soup. Or make some sweet [taquitos](https://github.com/sinker/tacofancy/blob/master/like_tacos/baked_taquitos.md). Or just add some barbecue sauce to a handful of chicken, and toss it onto a soft roll for a quick sandwich. Man *can* live on tacos alone, but one doesn't have to."
    val freshCornTortillas = "Fresh Corn Tortillas\n" +
        "===================\n" +
        "\n" +
        "This is the only way to go. So worth it. Makes roughly 15 tortillas.\n" +
        "\n" +
        "* 1 3/4 cups masa harina\n" +
        "* 1 1/8 cups water\n" +
        "\n" +
        "1. In a medium bowl, mix together masa harina and hot water until thoroughly combined. Turn dough onto a clean surface and knead until pliable and smooth. If dough is too sticky, add more masa harina; if it begins to dry out, sprinkle with water. Cover dough tightly with plastic wrap and allow to stand for 30 minutes.\n" +
        "2. Preheat a cast iron skillet or griddle to medium-high.\n" +
        "3. Divide dough into 15 equal-size balls. Using a tortilla press (or a rolling pin), press each ball of dough flat between two sheets of wax paper (plastic wrap or a freezer bag cut into halves will also work).\n" +
        "4. Place tortilla in preheated pan and allow to cook for approximately 30 seconds, or until browned and slightly puffy. Turn tortilla over to brown on second side for approximately 30 seconds more, then transfer to a plate. Repeat process with each ball of dough. Keep tortillas covered with a towel to stay warm and moist (or a low temp oven) until ready to serve.\n" +
        "\n" +
        "tags: vegetarian, vegan"
    val sourCream = "Sour Cream\n" +
        "==========\n" +
        "\n" +
        "Cool and tart, sour cream is an almost-essential part of the traditional American taco, and many others as well.\n" +
        "\n" +
        "tags: vegetarian"
    val cheese = "Cheese (Traditional; US)\n" +
        "======================\n" +
        "\n" +
        "A major flavor component of a traditional American taco, select a cheese that's firm and sharp.\n" +
        "\n" +
        "* Cheddar (shredded)\n" +
        "* Jack/Pepper Jack (shredded)\n" +
        "\n" +
        "tags: vegetarian"
    val tomatoes = "Tomatoes (Traditional; US)\n" +
        "======================\n" +
        "\n" +
        "Adding a bit of coolness and moisture, tomatoes are a staple ingredient of the American taco. The better the tomato the more flavor they will impart, but even a sub-sandard grocery store tomato has a place in a traditional taco.\n" +
        "\n" +
        "* Tomatoes (diced)\n" +
        "* Cherry Tomatoes (quartered)\n" +
        "* Grape Tomatoes (sliced)\n" +
        "\n" +
        "tags: vegetarian"
    val lettuce = "Lettuce (Traditional; US)\n" +
        "======================\n" +
        "\n" +
        "In a traditional American taco, lettuce serves to add extra crunch and coolness. Favor the bulkier lettuces over leafier fare such as Bibb lettuces or mesclun.\n" +
        "\n" +
        "* Iceberg Lettuce (shredded)\n" +
        "* Romaine Lettuce (shredded; maintain the stalks)\n" +
        "\n" +
        "tags: vegetarian, vegan"
    val groundBeef = "Ground Beef (Traditional; US)\n" +
        "==================\n" +
        "\n" +
        "The tranditional base for an American taco is ground beef, browsed in a skillet and seasoned.\n" +
        "\n" +
        "* 1lb Ground Beef\n" +
        "\n" +
        "1. Heat a skillet on the stovetop.\n" +
        "2. Brown the ground beef for 8-10 minutes, or until it is thoroughly cooked, stirring frequently to avoid sticking or burning. (If you're not using a non-stick pan, which is preferred, use 1T oil to keep things loose.)\n" +
        "3. Stir in seasonings."
    return listOf(
        Recipe(
            name = "Asian Style Tacos",
            recipe = "Asian Style Tacos\n" +
                "=================\n" +
                "\n" +
                "If you like a lighter asian style taco with no cheese, give this one a try. Use tofu to make these vegetarian-friendly!\n" +
                "\n" +
                "1. Using the [asian marinade](../base_layers/asian_marinade.md), prepare some tofu or sliced pork\n" +
                "2. Make some guacamole (add in a teaspoon of sesame oil and toasted sesame seeds to your recipe)\n" +
                "3. Top with [asian pickled veggies](../condiments/pickled_vegetables.md)\n" +
                "4. And [cabbage slaw](../condiments/asian_cabbage.md)\n" +
                "5. __NOM__\n" +
                "\n" +
                "tags: vegetarian, vegan",
            baseLayer = "Asian Style Tofu or Pork Marinade\n" +
                "=================================\n" +
                "\n" +
                "For marinade mix:\n" +
                "\n" +
                "* quarter cup lime juice\n" +
                "* quarter cup soy sauce\n" +
                "* quarter cup toasted sesame oil\n" +
                "* two cloves of garlic, chopped\n" +
                "* 3 teaspoons cumin\n" +
                "* 1 teaspoon paprika\n" +
                "* Some chopped cilantro\n" +
                "\n" +
                "Mix with sliced tofu or pork, marinate for 30 minutes and quickly sauté.\n" +
                "\n" +
                "tags: vegetarian",
            condiment = "Asian Pickled Vegetables\n" +
                "==================\n" +
                "\n" +
                "__Whisk:__\n" +
                "\n" +
                "* 1/4 cup rice vinegar\n" +
                "* 2 teaspoons sugar\n" +
                "* 1 teaspoon soy sauce\n" +
                "* 1 teaspoon fish sauce\n" +
                "* Some red pepper flakes\n" +
                "\n" +
                "__Then toss in some sliced vegetables. Suggestions include:__\n" +
                "\n" +
                "* cucumbers\n" +
                "* carrots\n" +
                "* onions\n" +
                "* radishes\n" +
                "\n" +
                "Mix, cover and chill in fridge for at least 30 minutes before using.",
            mixin = "Asian Cabbage Slaw\n" +
                "==================\n" +
                "\n" +
                "Add this to [Asian Style Tacos](https://github.com/sinker/tacofancy/blob/master/full_tacos/asian_style_tacos.md) for a taste sensation.\n" +
                "\n" +
                "Ingredients\n" +
                "-----------\n" +
                "\n" +
                "For the dressing:\n" +
                "\n" +
                "* 1 lime, juiced\n" +
                "* 2 Tbs Rice vinegar\n" +
                "* 2 tsp sugar\n" +
                "* 1 Tbs toasted sesame oil\n" +
                "* 1 Tbs olive oil\n" +
                "* a squirt or two of sriracha\n" +
                "* pinch of salt\n" +
                "\n" +
                "For the slaw:\n" +
                "\n" +
                "* 1/2 head cabbage, chopped thin (slaw style)\n" +
                "* 2 spring onions (scallions), chopped.\n" +
                "* some cilantro, chopped up, to taste\n" +
                "\n" +
                "Directions\n" +
                "----------\n" +
                "\n" +
                "1. Combine all the dressing ingredients in a big bowl, whirl them together until the sugar dissolves. Adjust the amount of sriracha in there to the heat you want your dressing to be.\n" +
                "\n" +
                "2. Toss the chopped cabbage, onions, and cilantro in with the dressing.\n" +
                "\n" +
                "3. Mix until everything is lightly dressed.\n" +
                "\n" +
                "YAY EVERYTHING.\n" +
                "\n" +
                "tags: vegetarian, vegan",
            photoRes = R.drawable.taco_1
        ),
        Recipe(
            name = "Baja Fish Tacos",
            recipe = "Baja Fish Tacos\n" +
                "===============\n" +
                "\n" +
                "In [Baja, Mexico](http://en.wikipedia.org/wiki/Baja_California_peninsula) you'll find carts by the side of the road serving fresh, delicious fish tacos. There is nothing else like it in the world but this recipe will get you close if you can find fish fresh enough.\n" +
                "\n" +
                "__Ingredients__\n" +
                "\n" +
                "* [Baja white sauce](../condiments/baja_white_sauce.md).\n" +
                "* [Baja beer battered fish](../base_layers/baja_beer_batter.md).\n" +
                "* 2 cups shredded cabbage, chopped fine\n" +
                "* 1/4 cup cilantro, chopped fine\n" +
                "* Lime for squeezing\n" +
                "* 8 Corn tortillas\n" +
                "* 1/2 cup Canola oil\n" +
                "\n" +
                "__Instructions__\n" +
                "\n" +
                "* Steam a tortilla\n" +
                "* Spread white sauce all over it\n" +
                "* Add some fish\n" +
                "* Add cabbage, cilantro, and a squeeze of lime\n" +
                "* Repeat\n" +
                "\n" +
                "Makes 8 tacos",
            condiment = "Baja White Sauce\n" +
                "================\n" +
                "\n" +
                "This is a traditional white sauce for [Baja fish tacos](../full_tacos/baja_fish_tacos.md).\n" +
                "\n" +
                "* 1/4 cup mayo\n" +
                "* 2 tbsp sour cream\n" +
                "* 1 tbsp lime juice\n" +
                "* 1/4 tsp celery salt (or garlic salt, etc)\n" +
                "\n" +
                "Mix, and refrigerate for an hour if possible.",
            baseLayer = "Baja Beer Battered Fish\n" +
                "========================\n" +
                "\n" +
                "This is the beer battered fish for [Baja fish tacos](../full_tacos/baja_fish_tacos.md).\n" +
                "\n" +
                "Batter\n" +
                "-------\n" +
                "\n" +
                "* 1/2 c flour\n" +
                "* 1/4 c baking powder\n" +
                "* 1 egg\n" +
                "* 1/2 c beer (Tecate!)\n" +
                "* 1 tsp salt\n" +
                "* 1 tsp chili powder (paprika, salt, garlic salt)\n" +
                "* 2 tsp parsley\n" +
                "\n" +
                "Beat the eggs and fold all batter ingredients until smooth.\n" +
                "Add flour to make it thicker or add beer to make it thinner.\n" +
                "If you have time let the batter chill for a couple hours.\n" +
                "\n" +
                "Fish\n" +
                "------\n" +
                "\n" +
                "* 1 lb. cod fillet, grouper, or similar white fish, the fresher the better\n" +
                "\n" +
                "* Cut fish into small chunks.\n" +
                "* Fill a pan with oil and heat until approx. 375 F.\n" +
                "* Fill a bowl with about a cup of flour and keep it next to the batter bowl.\n" +
                "* Dip a fish piece into flour then into the batter.\n" +
                "* Fry for 4-5 minutes, turning halfway through. Drain on a paper towel.",
            photoRes = R.drawable.taco_2
        ),
        Recipe(
            name = "Beef soft tacos",
            recipe = "# Beef soft tacos\n" +
                "\n" +
                "## Ingredients\n" +
                "* [seasoned beef](../base_layers/seasoned_beef.md)\n" +
                "* Soft corn tortillas\n" +
                "* salsa\n" +
                "* guacamole\n" +
                "* Shredded Mexican cheese\n" +
                "* Shredded lettuce\n" +
                "* Sour cream\n" +
                "\n" +
                "## Method\n" +
                "\n" +
                "Prepare seasoned beef using recipe at [seasoned beef](../base_layers/seasoned_beef.md), or just reheat remaining beef from previous meal.\n" +
                "\n" +
                "Heating the tortillas: For melted cheese, spread tortillas in single layer and sprinkle cheese on each tortilla. \n" +
                "Heat tortillas for 25 sec in microwave, then cover with foil.\n" +
                "\n" +
                "Assemble tacos using all ingredients. \n" +
                "\n" +
                "Serve with beans and/or rice on side. \n" +
                "\n",
            baseLayer = "# Seasoned Beef\n" +
                "\n" +
                "## Ingredients\n" +
                "* 2 lbs ground beef (or whatever you prefer: chicken, tofu, etc.)\n" +
                "* [Simple beef seasoning](../seasonings/simple_beef_seasoning.md)\n" +
                "* 2 cups Green peppers, diced\n" +
                "* 1 cup of water\n" +
                "\n" +
                "## Method\n" +
                "Heat a large frying pan or wok for 2-3 minutes on high. Add cooking oil.\n" +
                "\n" +
                "Stir fry the beef for 5-7 minutes, or until completely brown. Drain the juices and return to the pan.\n" +
                "\n" +
                "Add water, green peppers, and simple beef seasoning. Simmer and cook until fluid is absorbed into the meat, \n" +
                "about 5 - 7 minutes.\n",
            seasoning = "#Simple beef seasoning\n" +
                "\n" +
                "The amount used is good for 2 pounds of ground beef\n" +
                "\n" +
                "## Ingredients\n" +
                "* 4 teaspoons minced onion\n" +
                "* 1 teaspoon chili powder\n" +
                "* 1 teaspoon of cornstarch\n" +
                "* 2 teaspoons of ground cumin\n" +
                "* 1/2 teaspoon of red pepper flakes\n" +
                "* (Optional) 1/2 teaspoon of cayenne pepper\n" +
                "* 1 teaspoon of minced garlic\n" +
                "* 1/2 teaspoon of dried oregano\n" +
                "\n" +
                "## Method\n" +
                "Mix all ingredients into a bowl. ",
            photoRes = R.drawable.taco_3),
        Recipe(
            name = "Black Bean, Potato, and Onion Tacos",
            recipe = "Black Bean, Potato, and Onion Tacos\n" +
                "===================================\n" +
                "\n" +
                "Vegetarian; vegan if you omit the cheese\n" +
                "-----------------------------------------\n" +
                "\n" +
                "* 1 recipe [Garlic Black Beans](https://github.com/sinker/tacofancy/blob/master/base_layers/garlic_black_beans.md) (broth left slightly soupy)\n" +
                "* Potatoes, peeled and sliced into rounds (best results with baby yellow, red, or purple/blue potatoes if you can get them)\n" +
                "* Large Onion, cut in half and sliced into half-moons\n" +
                "* Vegetable oil of your choice\n" +
                "* Salty cheese of your choice (cotija ftw)\n" +
                "\n" +
                "1. Heat two tablespoons vegetable oil in large skillet over medium heat.\n" +
                "2. Once olive oil begins to shimmer, add onions. \n" +
                "3. When onions start becoming translucent, turn the heat down a tiny bit and saute them until they turn very slightly brown on the edges. \n" +
                "4. Add the peeled and sliced potato rounds and saute them along with the onions until the potatoes are fork-tender.\n" +
                "5. Add the garlic black beans and simmer until any bean broth is incorporated into the potato/onion mix.\n" +
                "6. Let cool a little bit before serving, potatoes retain heat really really well. \n" +
                "\n" +
                "Serve on corn or flour tortillas. Hard or soft shell, doesn't matter. Sprinkle on salty cheese as desired.\n" +
                "\n" +
                "tags: vegetarian, vegan",
            baseLayer = "Garlic Black Beans\n" +
                "==================\n" +
                "\n" +
                "Vegetarian/Vegan\n" +
                "----------------\n" +
                "\n" +
                "* Can of plain black beans\n" +
                "* 3 - 6 cloves of garlic chopped fine\n" +
                "* Vegetable oil of your choice\n" +
                "* Cumin\n" +
                "* Cayenne or Chipotle pepper (optional)\n" +
                "* Lemon juice (optional)\n" +
                "\n" +
                "1. Heat a tablespoon of olive oil in a saucepan over medium heat. \n" +
                "2. When olive oil starts to shimmer, add the garlic and let it simmer for about 10 seconds.\n" +
                "3. Add cumin and pepper (if wanted) and simmer for another 10 seconds.\n" +
                "4. Pour in the entire can of beans, don't drain or rinse them.\n" +
                "5. Simmer for about 15 minutes or until the bean broth has thickened to your liking. If the beans will be the main ingredient of your tacos, cook until the beans are just about totally dry. If you're using them in a mixture (like the [Black Bean, Potato, and Onion Tacos](https://github.com/sinker/tacofancy/blob/master/full_tacos/black_bean_potato_onion_tacos.md) ), let the broth stay a little bit runny.\n" +
                "6. Add a squeeze or two of lemon juice if you like. \n" +
                "\n" +
                "tags: vegetarian, vegan",
            photoRes = R.drawable.taco_4),
        Recipe(
            name = "Cauliflower tacos",
            recipe = "Cauliflower tacos\n" +
                "==================\n" +
                "\n" +
                "We're avid meat eaters, but these vegetarian tacos are one of our go-tos in Peru. If you can make the pickles with Peruvian aji amarillo, please do.\n" +
                "\n" +
                "* [Roast cauliflower](https://github.com/sinker/tacofancy/blob/master/base_layers/roast_cauliflower.md)\n" +
                "* [Pickled chilis and vegetables](https://github.com/sinker/tacofancy/blob/master/condiments/pickled_chilis_and_vegetables.md)\n" +
                "* [Caramelized red onions](https://github.com/sinker/tacofancy/blob/master/condiments/caramelized_red_onions.md)\n" +
                "* [Guacamole](https://github.com/sinker/tacofancy/blob/master/condiments/guacamole.md)\n" +
                "* [Yogurt](https://github.com/sinker/tacofancy/blob/master/condiments/yogurt.md) or [sour cream](https://github.com/sinker/tacofancy/blob/master/condiments/sour_cream.md)\n" +
                "* Tortilla of choice, warmed in a dry pan\n" +
                "\n" +
                "tags: vegetarian",
            baseLayer = "Roast cauliflower\n" +
                "==================\n" +
                "\n" +
                "This is slightly modified from [Alon Shaya's](http://www.bonappetit.com/recipe/whole-roasted-cauliflower-with-whipped-goat-cheese) recipe\n" +
                "\n" +
                "* 1 large head cauliflower, leaves removed\n" +
                "* 2 1/2 cups dry white wine\n" +
                "* 1/3 cup olive oil\n" +
                "* 1/4 cup kosher salt\n" +
                "* 1 tablespoon sugar\n" +
                "* 3 bay leaves\n" +
                "* 6 cloves garlic, crushed\n" +
                "* 3 tablespoons ground cumin\n" +
                "* Kosher salt, to taste\n" +
                "* Drizzle of olive oil\n" +
                "\n" +
                "1. Preheat oven to 475 degrees.\n" +
                "2. Bring wine, oil, kosher salt, juice, butter, red pepper flakes, sugar, bay leaves, garlic, and 8 cups water to a boil in a large pot.\n" +
                "3. Add cauliflower, reduce heat, and simmer, turning occasionally, until a knife easily inserts into center, 15-20 minutes.\n" +
                "4. Transfer cauliflower to a rimmed baking sheet, draining well. Sprinkle with ground cumin.\n" +
                "5. Roast, rotating sheet halfway through, until brown all over, 30-40 minutes.\n" +
                "6. When slightly cool, chop into bite sized florets, and dice the core. Toss with salt and olive oil.\n" +
                "\n" +
                "tags: vegetarian",
            mixin = "Pickled chilis and vegetables\n" +
                "==================\n" +
                "\n" +
                "* 1 cup water\n" +
                "* 1 cup white vinegar or unseasoned rice vinegar\n" +
                "* 1 tablespoon sugar\n" +
                "* 2 tablespoons kosher salt\n" +
                "* 4 bay leaves\n" +
                "* 5 lightly crushed peeled garlic cloves\n" +
                "* 1 bunch of cilantro stems, finely chopped (optional)\n" +
                "* 1/2 teaspoon dried oregano\n" +
                "* 1 peeled medium carrot, sliced into 1/4 inch slices\n" +
                "* 3 fresh hot chilis (jalepenos, aji amarillo, or peppers of your choice), sliced into 1/4 inch slices\n" +
                "* 10 radishes sliced into quarters\n" +
                "* 1/2 a red onion, sliced into 1/4 inch slices\n" +
                "\n" +
                "1. Bring water, vinegar, sugar, salt, bay leaves, garlic, optional cilantro stems, and oregano to a simmer in a small saucepan until salt and sugar are dissolved.\n" +
                "2. Add vegetables and simmer 1 minute.\n" +
                "3. Cover pan and let sit on stovetop for 15 minutes.\n" +
                "4. Transfer to container, cover with brine, and store in the fridge. Keeps a monthish? They never last that long.\n" +
                "\n" +
                "_Notes_\n" +
                "\n" +
                "Lots of other vegetables could work here: green beans, chopped celery, daikon radish, whatever!\n" +
                "\n" +
                "tags: vegetarian, vegan\n" +
                "Caramelized red onions\n" +
                "==================\n" +
                "\n" +
                "* 3 medium red onions, trimmed and sliced into 1/4 inch slices\n" +
                "* 1 tablespoon salted butter\n" +
                "* 1 tablespoon olive oil\n" +
                "* Juice of 2-3 limes (about 1/4 cup)\n" +
                "* Koser salt, to taste\n" +
                "\n" +
                "1. Melt butter with oil over low heat.\n" +
                "2. Add onions, and stir to combine.\n" +
                "3. Cook, stirring occasionally, for about 50 minutes, until darkly caramelized. If they are sticking too much or starting to burn, add a splash of water to the pan and stir.\n" +
                "4. Deglaze with lime juice, add salt to taste.\n" +
                "\n" +
                "tags: vegetarian",
            condiment = "Guacamole\n" +
                "=========\n" +
                "\n" +
                "This is pretty canonical stuff right here.\n" +
                "\n" +
                "* 1-2 ripe Hass avocados\n" +
                "* half a lime\n" +
                "* a clove or two of chopped garlic\n" +
                "* some chopped white or yellow onion\n" +
                "* salt\n" +
                "* pepper\n" +
                "* dry cayenne or red chile pepper powder\n" +
                "* a jalapeño, if that's your thing\n" +
                "* a small chopped tomato\n" +
                "* a handful of chopped cilantro\n" +
                "\n" +
                "Look, here's how this works: First, you squeeze the lime juice into your nice little ceramic bowl. Then you add the garlic, onion, spices, peppers if you're heating it up, and then **walk away**.\n" +
                "\n" +
                "Seriously, walk away for a minute. Crack open a nice Negra Modelo and use a wedge of the other half of the lime in it. Back in your bowl, let the strong stuff marinate in that lime juice for a few minutes. It's cooking.\n" +
                "\n" +
                "OK, now that you're back, mix in the rest of the non-avocado ingredients. If you have a pestle, now's it's time to shine. If not, use a small wooden spoon, or failing all else, a fork, you miserable lout. \n" +
                "\n" +
                "Mash up everything but the avocado. Get it pasty if you can. Squish it all up.\n" +
                "\n" +
                "Now you can add your avocado or two, dude. I usually go with about 1.5 avos to condiment tacos or taco-like structures for four humans of varying sizes.\n" +
                "\n" +
                "Just in case no one ever taught you how to deal with an avocado correctly, here's a quick lesson:\n" +
                "* Cut it in half, longways.\n" +
                "* Smack the pit with the sharp edge of your knife and give it a sensible 90-degree twist.\n" +
                "* Voila, the avocado pit is on your knife.\n" +
                "* Dispose of it, unless you're not going to finish all that guac now, in which case, hang onto it and put it in the bowl with the guac before you put it in the fridge.\n" +
                "* Now that your knife is free, use it to carve long slices into the flesh of your avocado, one half at a time. Cross-hatch that sucker a bit. Don't cut through the flesh.\n" +
                "* Finally, get your avocado half above your nice bowl full of deliciousness, and use the skin to gently push your nice slices into the spicy soup below. Turn it inside-out, if you must, but know that you can minimize the amount of avocado that gets all over your hands if you do this just right.\n" +
                "\n" +
                "To finish up your guacamole, mash your avocado up a bit and gently mix it into the magical citric-spice-tomato concoction. We're done here.\n" +
                "\n" +
                "_Thanks to [The Awl](http://www.theawl.com/2010/02/half-baked-guacamole-by-the-ceviche-method) for limited inspiration regarding the limey and drinky parts._\n" +
                "\n" +
                "tags: vegetarian\n" +
                "Yogurt\n" +
                "======\n" +
                "\n" +
                "Plain Balkan or Greek type yogurts add flavour and moisture. May be used as an\n" +
                "alternative to sour cream. While sweet and fruit flavoured yogurts are not\n" +
                "recommended, speciality yogurt dips such as jalapeno provide delicious\n" +
                "variation.\n" +
                "\n" +
                "tags: vegetarian\n" +
                sourCream,
            photoRes = R.drawable.taco_5),
        Recipe(
            name = "Chicken Verde, Corn and Black Bean Tacos with Pico de Gallo and Salsa de " +
                "Aguacate",
            recipe = "Chicken Verde, Corn and Black Bean Tacos with Pico de Gallo and Salsa de Aguacate\n" +
                "=================================================================================\n" +
                "\n" +
                "These are great tacos--full of a bunch of really wonderful, subtle, and complementary flavors that build into something just immensely eatable. \n" +
                "\n" +
                "Taco Objects to Assemble\n" +
                "------------------------\n" +
                "\n" +
                "* [Slow-Cooked Salsa Verde Chicken](https://github.com/sinker/tacofancy/blob/master/base_layers/slow_cooked_salsa_verde_chicken.md)\n" +
                "* [Corn & Blackbeans](https://github.com/sinker/tacofancy/blob/master/base_layers/corn_blackbean.md)\n" +
                "* [Phoning it in Pico de Gallo](https://github.com/sinker/tacofancy/blob/master/condiments/Pico_de_gallo.md)\n" +
                "* [Salsa de Aguacate](https://github.com/sinker/tacofancy/blob/master/condiments/salsa_de_aguacate.md)\n" +
                "\n" +
                "Directions\n" +
                "----------\n" +
                "\n" +
                "1. Get that chicken into your slow cooker nice and early.\n" +
                "2. Make everything else as the day progresses.\n" +
                "3. Assemble everything on a table.\n" +
                "4. Build your tacos and eat.\n" +
                "5. Feel incredibly full and happy.",
            baseLayer = slowCookedSalsaVerdeChicken,
            mixin = "Corn and Black Beans\n" +
                "===================\n" +
                "\n" +
                "This is a fork of the [Zuccini and Corn Filling](https://github.com/sinker/tacofancy/blob/master/base_layers/zucchini_corn.md) because I'm not a Zuccini fan. I also tweaked the spices.\n" +
                "\n" +
                "You'll need:\n" +
                "\n" +
                "* Fresh corn kernels, cut off the cob.\n" +
                "* 1 can of Black Beans\n" +
                "* half a white onion\n" +
                "* salt\n" +
                "* chili powder\n" +
                "* cumin\n" +
                "\n" +
                "Directions\n" +
                "----------\n" +
                "\n" +
                "1. Toast corn in a skillet over high heat with oil and salt for about 5 minutes, or until browned. Remove corn.\n" +
                "2. Cook onion in the skillet until it caramelizes (about 5 minutes). Leave onion in there.\n" +
                "3. Add corn back in.\n" +
                "4. Add black beans.\n" +
                "5. Toss in a pinch of salt, a healthy couple shakes of chili powder, and a small pinch of cumin.\n" +
                "6. Cook together for another 5 minute or so.\n" +
                "\n" +
                "Delicious hot as the main base_layer or as a supplement to others.\n" +
                "\n" +
                "tags: vegetarian, vegan",
            condiment = "Phoning it in Pico de Gallo\n" +
                "===========================\n" +
                "\n" +
                "_Super Quick & Easy Pico_\n" +
                "\n" +
                "\n" +
                "* 1 pint grape tomatoes, quartered (make your kids do this part)\n" +
                "* 3 tablespoons finely chopped white onion\n" +
                "* Coarse salt\n" +
                "* Squeeze of lime\n" +
                "* As many finely chopped red (or green) jalapeños as you want (optional)\n" +
                "\n" +
                "Combine the tomatoes, cilantro and onion together in a bowl. Season to taste with salt and lime.\n" +
                "\n" +
                "Reserve some of this mixture for kids, and then add as much jalapeño as you like to the remaining mixture for the non wimps.\n" +
                "\n" +
                "tags: vegetarian, vegan\n" +
                salsaDeAguacate,
            photoRes = R.drawable.taco_1),
        Recipe(
            name = "Chipotle Shrimp Tacos",
            recipe = "Chipotle Shrimp Tacos\n" +
                "=====================\n" +
                "\n" +
                "Spicy, sweet, delicious & colorful! :fried_shrimp: \n" +
                "\n" +
                "\n" +
                "Taco Objects\n" +
                "------------\n" +
                "\n" +
                "* [Chipotle Shrimp](https://github.com/sinker/tacofancy/blob/master/base_layers/chipotle_shrimp.md)\n" +
                "* [Cabbage Slaw](https://github.com/sinker/tacofancy/blob/master/condiments/cabbage_slaw.md)\n" +
                "* [Spicy Mayo](https://github.com/sinker/tacofancy/blob/master/condiments/spicy_mayo.md)\n" +
                "* [Cilantro & Onion](https://github.com/sinker/tacofancy/blob/master/condiments/cilantro_and_onion.md)\n" +
                "* [Flour Tortillas](https://github.com/sinker/tacofancy/blob/master/shells/perfect_flour_tortillas.md)\n" +
                "\n" +
                "\n" +
                "Directions\n" +
                "----------\n" +
                "\n" +
                "1. Top warm tortillas with Cabbage Slaw and Chipotle Shrimp.\n" +
                "2. Drizzle with Spicy Mayo.\n" +
                "3. Top with Cilantro and Onion as desired.\n" +
                "4. Eat, Repeat.",
            baseLayer = "Chipotle Shrimp\n" +
                "===============\n" +
                "\n" +
                "__Ingredients__\n" +
                "\n" +
                "* 2 tablespoons unsalted butter\n" +
                "* 1 lb shrimp, shelled & deveined\n" +
                "* 1 batch [Chipotle Rub](https://github.com/sinker/tacofancy/blob/master/seasonings/chipotle_rub.md)\n" +
                "\n" +
                "__Directions__\n" +
                "\n" +
                "1. In a bowl, add the shrimp and Chipotle Rub and stir to coat well.\n" +
                "2. Heat a large non-stick skillet over medium-high heat and add the butter.\n" +
                "3. When butter has melted, add the shrimp to the skillet. Cook for 1-2 minutes, " +
                "and flip shrimp. Cook for 1-2 more minutes, or just until shrimp are pink. Remove shrimp from skillet.",
            seasoning = "Chipotle Rub\n" +
                "============\n" +
                "\n" +
                "Great rub/spice mix for shrimp, beef or pork.\n" +
                "\n" +
                "__Ingredients__\n" +
                "\n" +
                "* 1 teaspoon smoked paprika\n" +
                "* 1/2 teaspoon curry powder\n" +
                "* 1/4 teaspoon chipotle chile powder\n" +
                "\n" +
                "__Directions__\n" +
                "\n" +
                "Stir to combine and apply to your protein of choice.\n" +
                "\n" +
                "tags: vegetarian, vegan",
            mixin = "Cabbage Slaw\n" +
                "============\n" +
                "\n" +
                "__Ingredients__\n" +
                "\n" +
                "* 4 cups shredded green cabbage\n" +
                "* 3 tablespoons apple cider vinegar\n" +
                "* 3 tablespoons extra virgin olive oil\n" +
                "* 2 tablespoons brown sugar\n" +
                "* Sea salt and freshly ground black pepper\n" +
                "\n" +
                "__Directions__\n" +
                "\n" +
                "Add first four ingredients to a bowl and stir to combine. Season with salt and pepper to taste, and stir again. Let sit for 20 minutes so flavors can meld.\n" +
                "\n" +
                "tags: vegetarian, vegan",
            condiment = "Spicy Mayo\n" +
                "==========\n" +
                "\n" +
                "__Ingredients__\n" +
                "\n" +
                "* 1/3 cup mayonnaise\n" +
                "* 2 teaspoons gochujang paste\n" +
                "\n" +
                "__Directions__\n" +
                "\n" +
                "Mix mayonnaise and gochujang together well. Let sit for 20 minutes so flavors can combine.\n" +
                "\n" +
                "_Note:_ Gochujang paste can be found at asian markets.\n" +
                "\n" +
                "tags: vegetarian\n" +
                "# Cilantro and Onion\n" +
                "\n" +
                "Chop up some cilantro and onion (any variety) and  put them on any taco.\n" +
                "\n" +
                "tags: vegetarian, vegan",
            shell = "Perfect Flour Tortillas\n" +
                "=====================\n" +
                "\n" +
                "\n" +
                "This recipe is courtesy of [Cynthia Detterick-Pineda at **Whats Cooking America**](http://whatscookingamerica.net/CynthiaPineda/Tortilla/TortillaMaking.htm \"Cynthia Detterick-Pineda\").\n" +
                "\n" +
                "Yields: Approximate 15 tortillas\n" +
                "Prep time: 15 min\n" +
                "\n" +
                "* 3 cups all-purpose flour\n" +
                "* 2 teaspoons baking powder\n" +
                "* 1 teaspoon salt\n" +
                "* 4 to 6 tablespoons lard or vegetable shortening\n" +
                "* 1 1/4 cups warm water (approximate)\n" +
                "\n" +
                "\n" +
                "If you follow the instructions provided, your tortillas will turn out perfectly - hence the name.\n" +
                "\n" +
                "Make sure to follow the handling methods and resting times closely. They can make or break the texture. \n",
            photoRes = R.drawable.taco_2),
        Recipe(
            name = "Chorizo scramble (aka Mandy's Life-Saving Tacos)",
            recipe = "Chorizo scramble (aka Mandy's Life-Saving Tacos)\n" +
                "=========================================================\n" +
                "\n" +
                "These breakfast tacos have the power to resurrect the dead. (If you do it the easy way they are excellent super-fast tacos.)\n" +
                "\n" +
                "* [chorizo](https://github.com/sinker/tacofancy/blob/master/base_layers/chorizo.md) (that recipe is nice but you can just chop what you like straight off the sausage.)\n" +
                "* eggs\n" +
                "* [salsa verde](https://github.com/sinker/tacofancy/blob/master/condiments/simple_salsa_verde.md) (a primo verde is key.)\n" +
                "* chopped cilantro (gotta be fresh)\n" +
                "* slice o' lime (must also gotta be fresh)\n" +
                "* [corn tortillas](https://github.com/sinker/tacofancy/blob/master/shells/Fresh_corn_tortillas.md) (fresh is best but straight from the packet ain't never hurt nobody.)\n" +
                "\n" +
                "1. Chop up and the chorizo and scramble a couple of eggs per serving.\n" +
                "2. Sweat the chorizo, then add the eggs to the pan.\n" +
                "2. Scramble the eggs and chorizo until they are awesome. (Pull them just before they're done, you don't want them rubbery.)\n" +
                "3. Warm the tortillas in another pan.\n" +
                "4. Add the chorizo scramble to a tortilla, add salsa verde, top with cilantro and a squeeze of lime.\n" +
                "\n" +
                "Your life has been given back to you. Make the most of it.\n" +
                "\n" +
                "---",
            baseLayer = chorizo,
            condiment = salsaVerde,
            shell = freshCornTortillas,
            photoRes = R.drawable.taco_3),
        Recipe(
            name = "Chorizo, Sweet Potato and Apple Tacos with Chipotle Sauce",
            recipe = "Chorizo, Sweet Potato and Apple Tacos with Chipotle Sauce\n" +
                "=========================================================\n" +
                "\n" +
                "* [Chorizo](https://github.com/sinker/tacofancy/blob/master/base_layers/chorizo.md)\n" +
                "* [Sweet Potato and Apple Hash](https://github.com/sinker/tacofancy/blob/master/mixins/sweet_potato_and_apple_hash.md)\n" +
                "* [Chipotlé Sauce](https://github.com/sinker/tacofancy/blob/master/condiments/chipotle_sauce.md)\n" +
                "\n" +
                "---\n" +
                "Can't wait to try these...",
            baseLayer = chorizo,
            mixin = sweetPotatoAndAppleHash,
            condiment = chipotleSauce,
            photoRes = R.drawable.taco_4),
        Recipe(
            name = "Crock Pot Al Pastor Tacos",
            recipe = "Crock Pot Al Pastor Tacos\n" +
                "=======================\n" +
                "\n" +
                "1. Prepare [crock pot al pastor](https://github.com/sinker/tacofancy/blob/master/base_layers/crock_pot_fake_al_pastor.md) pulled pork.\n" +
                "2. Prepare [caramelized pineapple](https://github.com/sinker/tacofancy/blob/master/condiments/caramelized_pineapple.md) using the fat leftover after cooking the pork.\n" +
                "3. Warm flour or corn tortillas in a dry pan, keep warm in a 250 degree oven.\n" +
                "4. Serve pork and pineapple tacos with diced raw red onion, chopped cilantro, " +
                "and a squeeze of lime.",
            baseLayer = "Crock Pot (Fake) Al Pastor\n" +
                "=====================\n" +
                "\n" +
                "This isn't authentic al pastor (the real preparation is very similar to shawarma) but it's got the same flavors, and is super easy and crazy delicious.\n" +
                "\n" +
                "## Ingredients\n" +
                "\n" +
                "* 1 medium bone-in pork shoulder (Boston butt), skin removed\n" +
                "* Kosher salt\n" +
                "* 1 7oz can chipotle peppers in adobo\n" +
                "* 2/3 of a pineapple, peeled, cored, and roughly chopped\n" +
                "* Fish sauce to taste (a few tablespoons)\n" +
                "* Kekap manis (Indonesian sweet soy sauce, available at most Asian supermarkets) to taste. Feel free to substitute regular soy sauce. About 1/4 cup\n" +
                "* One 14.5 oz can tomatoes, preferably fire roasted\n" +
                "* Cumin to taste, about 1 teaspoon\n" +
                "\n" +
                "## Directions\n" +
                "1. Coat the shoulder generously with salt, and brown it well on all sides in a hot pan.\n" +
                "2. Puree the peppers, adobo, pineapple, fish sauce, kekap manis, tomatoes, and cumin in a food processor or blender to a smooth puree. Taste and adjust seasoning.\n" +
                "3. Pour half of the puree into a crock pot, and add the browned pork.\n" +
                "4. Add a little liquid to the pan the pork cooked in (water, stock, beer, whatever's on hand) and scrape up all the good brown bits. Pour into the crock pot.\n" +
                "5. Add the rest of the puree to the crock pot, then stick the whole thing in the fridge for at least an hour, or overnight.\n" +
                "6. Cook the pork on the lowest setting for 10-12 hours, until it pulls apart very easily.\n" +
                "7. Turn the crock pot to off, and leave the pork in the pot to cool for 30 minutes.\n" +
                "8. Remove the pork to a platter or cookie sheet, and spoon off as much fat as possible from the top of the remaining liquid. Wick the last of the fat off with paper towels. If making [caramelized pineapple](https://github.com/sinker/tacofancy/blob/master/condiments/caramelized_pineapple.md) reserve 2 tablespoons of the fat.\n" +
                "9. Remove the bones and chunks of fat from the pork, and add it back to the " +
                "liquid in the crockpot. Shred with two forks, and rewarm if necessary.",
            condiment = "Caramelized Pineapple\n" +
                "=====================\n" +
                "\n" +
                "If you're making [crock pot al pastor](https://github.com/sinker/tacofancy/blob/master/base_layers/crock_pot_fake_al_pastor.md), make this too.\n" +
                "## Ingredients\n" +
                "\n" +
                "* 1/3 of a pineapple, peeled and chopped in 1/2 inch dice\n" +
                "* 2 tablespoons reserved fat from [crock pot al pastor](https://github.com/sinker/tacofancy/blob/master/base_layers/crock_pot_fake_al_pastor.md) **OR** 2 tablespoons neutral flavored oil such as canola, and 1/4 teaspoon chipotle powder.\n" +
                "\n" +
                "## Directions\n" +
                "1. If not using the pork fat, toss the pineapple with the chipotle powder.\n" +
                "2. Heat the oil or fat in a pan over medium high heat. When it is hot, add the pineapple.\n" +
                "3. Don't stir too much, let it get good and brown, this takes a few minutes. Watch to make sure the pineappled doesn't burn. Stir once or twice to brown a few different sides of the fruit.\n" +
                "4. Serve warm.",
            photoRes = R.drawable.taco_5),
        Recipe(
            name = "Fish Tacos",
            recipe = "Fish Tacos\n" +
                "==========\n" +
                "\n" +
                "Fish tacos tend to operate a little differently than other meat tacos. To execute them effectively, you'll want to assemble:\n" +
                "\n" +
                "1. Your tortillas - corn are acceptable, flour can be acceptable if you're a bad person.\n" +
                "2. Your fish. Recipes can cover [traditional fried](https://github.com/sinker/tacofancy/blob/master/base_layers/battered_catfish.md) or [oven fried](https://github.com/sinker/tacofancy/blob/master/base_layers/baked_tilapia.md)\n" +
                "3. [Acceptable options for vegetables](https://github.com/sinker/tacofancy/blob/master/mixins/veg_for_fish_tacos.md)\n" +
                "4. Sauce, like [chipotle sauce](https://github.com/sinker/tacofancy/blob/master/condiments/chipotle_sauce.md)\n" +
                "5. Sriracha or other hot sauce\n" +
                "6. Avocado or Guacamole\n" +
                "\n" +
                "Warm taco shells and assemble tacos. Double shelling is more than acceptable.",
            baseLayer = "North Carolina Battered Catfish\n" +
                "===============================\n" +
                "\n" +
                "Do it right and [stick your arm down a catfish hole in the muddy waters of a north carolina pond](http://www.youtube.com/watch?v=zc_huHb4PMc), take that sucker home at serve it up to your friends and family on some corn tortilas\n" +
                "\n" +
                "* 1 cup all-purpose flour\n" +
                "* 1 cup cornmeal\n" +
                "* 1 tablespoon baking powder\n" +
                "* 1 tablespoon kosher salt\n" +
                "* 1/2 teaspoon cayenne pepper\n" +
                "* 1 (12-ounce) bottle amber beer\n" +
                "* 4 (6-ounce) catfish fillets\n" +
                "* 1 tablespoon salt\n" +
                "* 1 tablespoon cracked black pepper\n" +
                "* 2 tablespoons granulated garlic\n" +
                "* 1 lemon, juiced\n" +
                "\n" +
                "Preheat a deep-fryer to 350 degrees Fahrenheit.\n" +
                "\n" +
                "In a large bowl, add the flour, cornmeal, baking powder, salt and cayenne and whisk to combine. Whisk in the beer, being sure to remove any lumps.\n" +
                "\n" +
                "Cut the catfish fillets in half lengthwise to make 2 strips. If desired, cut into bite-sized pieces. In a small bowl add the salt, pepper and granulated garlic. Season the fillets with the salt mixture.\n" +
                "\n" +
                "Dip each strip in the beer batter and add to the fryer, a few at a time, moving " +
                "them around so they don't stick. Fry until brown and crispy, about 3 to 4 " +
                "minutes. Remove from the fryer to a serving platter. Repeat with the remaining " +
                "fillets and season the fish with lemon juice. Cut them up into taco size portions and show your friends how amazing your catch tastes.\n" +
                "Baked Tilapia\n" +
                "=============\n" +
                "\n" +
                "Oven fried fish for when you think you want to pretend you're eating healthier.\n" +
                "\n" +
                "* 1 pound mild fish (I usually use tilapia)\n" +
                "* 1 cup masa\n" +
                "* 2 tsp salt\n" +
                "* 1/2 to 1 tsp cayenne\n" +
                "* 2 tsp paprika\n" +
                "* 2 tsps chili powder\n" +
                "* 2 tsps garlic powder\n" +
                "* 1/2 to 1 tsp black pepper (to taste)\n" +
                "* olive oil\n" +
                "\n" +
                "\n" +
                "1. Preheat oven to 400 degrees.\n" +
                "2. Mix dry ingredients in a bowl to make the coating for the fish.\n" +
                "3. Cut fish into slices or chunks, as your taste desires. \n" +
                "4. Drizzle olive oil over cut fish, and dip fish into breading.\n" +
                "5. Bake for 8ish minutes and finish, if you can, under the broiler.",
            mixin = "Veggies for Fish Tacos\n" +
                "======================\n" +
                "\n" +
                "Fish tacos are a special breed, requiring different vegetable options.\n" +
                "\n" +
                "__Assemble your veg from the following options:__\n" +
                "\n" +
                "* Cabbage, purple, shredded\n" +
                "* Cabbage, other shades, shredded\n" +
                "* Radishes, sliced into thin slices\n" +
                "* Red peppers, diced\n" +
                "* Cherry tomatoes, sliced (if you're a heathen)\n" +
                "* Cilantro, if it doesn't taste like soap to you\n" +
                "\n" +
                "And one requirement:\n" +
                "* Limes, sliced for juicing over tacos.\n" +
                "\n" +
                "Place out your selections and assemble into your taco. Then squeeze a lime over the top.\n" +
                "\n" +
                "tags: vegetarian, vegan",
            condiment = chipotleSauce,
            photoRes = R.drawable.taco_1),
        Recipe(
            name = "Moroccan Lamb Tacos",
            recipe = "Morrocan Lamb Tacos\n" +
                "====================\n" +
                "\n" +
                "I make a variation of this as meatballs, but the seasoning and flavors are pretty unique.\n" +
                "\n" +
                "Base: [Moroccan Lamb](https://github.com/sinker/tacofancy/blob/master/base_layers/moroccan_lamb.md)\n" +
                "\n" +
                "On top:\n" +
                "* Chopped onion\n" +
                "* Green olives\n" +
                "* Golden raisins\n" +
                "\n" +
                "Add a sauce of chopped mint and tomato.",
            baseLayer = "Moroccan Lamb\n" +
                "=============\n" +
                "\n" +
                "A Differently Spiced Meat Than Your Usual Taco\n" +
                "----------------------------------------------\n" +
                "\n" +
                "* 500 g ground lamb\n" +
                "* 20 g Ras al Hanout spice. My mix contains:\n" +
                "    * Paprika\n" +
                "    * Cinnamon\n" +
                "    * Allspice\n" +
                "    * Clove\n" +
                "    * Toasted Mustard\n" +
                "    * Cumin\n" +
                "    * Caraway\n" +
                "    * Black Pepper\n" +
                "* 10 g fresh lemon zest or 10 g finely ground Black Lemon Omani (Moroccoan dried preserved lemon)\n" +
                "\n" +
                "Mix together and brown.",
            photoRes = R.drawable.taco_2),
        Recipe(
            name = "Pineapple Steak Taco",
            recipe = "# Pineapple Steak Taco\n" +
                "\n" +
                "- [ ] Prepare [pineapple](https://github.com/sinker/tacofancy/blob/master/mixins/pineapple.md)\n" +
                "- [ ] Make [Teriyaki](https://github.com/sinker/tacofancy/blob/master/condiments/teriyaki.md)\n" +
                "- [ ] Make [Chopped Steak](https://github.com/sinker/tacofancy/blob/master/base_layers/chopped_steak.md)\n" +
                "- [ ] Combine in taco shell\n" +
                "- [ ] ???\n" +
                "- [ ] Dance\n" +
                "- [ ] Enjoy",
            mixin = "# Pineapple Topping\n" +
                "\n" +
                "- [ ] Skin pineapple\n" +
                "- [ ] Slice pineapple\n" +
                "- [ ] Dice pineapple\n" +
                "- [ ] ???\n" +
                "- [ ] Dance\n" +
                "- [ ] Enjoy",
            condiment = "# Teriyaki\n" +
                "\n" +
                "__Ingredients__\n" +
                "\n" +
                "- 2/3 cup mirin (Japanese sweet rice wine)\n" +
                "- 1 cup soy sauce\n" +
                "- 4 1/2 teaspoons rice vinegar\n" +
                "- 1 teaspoon sesame oil\n" +
                "- 7 cloves garlic, minced\n" +
                "\n" +
                "__Directions__\n" +
                "\n" +
                "- [ ] mix all ingredients\n" +
                "- [ ] heat in a saucepan to a simmer, boil off alcohol",
            baseLayer = choppedSteak,
            photoRes = R.drawable.taco_3),
        Recipe(
            name = "Pulled Pork, Chard, and Pickled Onion Tacos",
            recipe = "Pulled Pork, Chard, and Pickled Onion Tacos\n" +
                "===========================================\n" +
                "\n" +
                "Tried this combination out tonight, and it turned out amazing.\n" +
                "\n" +
                "You'll need the following taco objects:\n" +
                "\n" +
                "* [Pulled Pork](https://github.com/sinker/tacofancy/blob/master/base_layers/crock_pot_pulled_pork.md)\n" +
                "* [Swiss Chard](https://github.com/sinker/tacofancy/blob/master/base_layers/swiss_chard.md)\n" +
                "* [Pickled Onions](https://github.com/sinker/tacofancy/blob/master/condiments/pickled_red_onions.md)\n" +
                "\n" +
                "Combine these on a corn tortilla, add a dollop of sour cream and sriracha. " +
                "Uh-mazing.",
            baseLayer = "Crock Pot Pulled Pork\n" +
                "=====================\n" +
                "\n" +
                "This is the base of my very favorite tacos. Added bonus is by cooking these all day in a slow cooker, your house smells _amazing_.\n" +
                "\n" +
                "Note: Unless you're cooking for a dozen people, you're going to end up with a lot of leftover pork, but that's about the best problem you can possibly have.\n" +
                "\n" +
                "GET GOING EARLY–in a perfect world, you're gonna give this thing at least eight hours on low.\n" +
                "\n" +
                "* 2-3 pound hunk of pork shoulder.\n" +
                "* chili powder\n" +
                "* mexican oregano (dried)\n" +
                "* ground cumin\n" +
                "* medium-sized onion (or, a couple shallots)\n" +
                "* can of green chilies, diced\n" +
                "* pepper & salt\n" +
                "\n" +
                "Chop up your onion or shallot into small bits–you don't want big loops of onion, dice it.\n" +
                "\n" +
                "Rub your hunk of pork generously with chili powder, oregano, pepper, salt, and a pinch or two of cumin. I tend to try and have a very light crust of this stuff on the outside of the pork.\n" +
                "\n" +
                "Toss the hunk of pork, the onions, and the green chilis into the crock pot, set that sucker to LOW, and let it slow cook. I try to get mine in by 9am so I can eat around 6pm. If you're pressed for time, you can do this in about four hours on high, but the deliciousness factor is lowered.\n" +
                "\n" +
                "Once the time is up, either shred the thing up in the crock pot or, if you can actually get it out without it falling apart, get it into a bowl and shred from there. That way, you're getting it out of what ends up being a GIGANTIC AMOUNT of juices. But again: oh no, your pork ended up sitting in a big vat of juice–we all weep for you.\n" +
                "\n",
            mixin = swissChard,
            condiment = pickedRedOnions,
            photoRes = R.drawable.taco_4),
        Recipe(
            name = "Salmon tacos with avocado and mango salsa",
            recipe = "Salmon tacos with avocado and mango salsa\n" +
                "=================\n" +
                "\n" +
                "This taco is the ultimate blend of salt and sweet with some spiciness.\n" +
                "\n" +
                "1. Use a taco shell of your choice and top with some [pan-seared salmon](../base_layers/pan_seared_salmon.md).\n" +
                "2. Make the [avocado and mango salsa](../condiments/avocado_mango_cilantro_salsa" +
                ".md) and add it to the taco.",
            baseLayer = "Pan-seared salmon\n" +
                "===========\n" +
                "\n" +
                "__Ingredients__\n" +
                "\n" +
                "* 1½ pounds (680g) fresh salmon filet\n" +
                "* Salt\n" +
                "* Pepper\n" +
                "* Butter/ghee/vegetable oil\n" +
                "\n" +
                "1. Cut the salmon into 1x1 inch cubes (or any size that you think is a good moutful).\n" +
                "2. Pat the cubes dry and season with salt and pepper.\n" +
                "3. Heat about a tablespoon of butter/ghee/vegetable oil in a skillet over medium-high heat. Add the salmon and turn heat to medium-low.\n" +
                "4. Fry the salmon until cooked through, about 4 minutes depending on the size.",
            condiment = "Avocado mango cilantro salsa\n" +
                "======================\n" +
                "\n" +
                "Recipe adapted from [nom nom paleo](http://nomnompaleo.com/post/56076300574/mango-avocado-salsa-on-pan-seared-salmon).\n" +
                "\n" +
                "In a bowl, combine:\n" +
                "* 2 cups diced ripe mango (about 2 mangos)\n" +
                "* ½ cup finely diced red onion\n" +
                "* 1 cup diced avocado (1 medium avocado)\n" +
                "* ¼ cup minced fresh cilantro\n" +
                "* 2 tablespoons extra virgin olive oil\n" +
                "* freshly ground black pepper\n" +
                "* big pinch of salt\n" +
                "* ¼ teaspoon red pepper flakes\n" +
                "* Juice from 1 lime\n" +
                "\n" +
                "tags: vegetarian, vegan",
            photoRes = R.drawable.taco_5),
        Recipe(
            name = "Slow Cooker Chicken in Chile de Arbol sauce",
            recipe = "Slow Cooker Chicken in Chile de Arbol sauce\n" +
                "===========================================\n" +
                "\n" +
                "This is much like the [Slow-Cooked Salsa Verde Chicken](https://github.com/sinker/tacofancy/blob/master/base_layers/slow_cooked_salsa_verde_chicken.md),\n" +
                "but cooked in the [Chile de Arbol sauce](https://github.com/sinker/tacofancy/blob/master/condiments/chile_de_arbol_sauce.md). Works great!\n" +
                "\n" +
                "Corn tortillas recommended.\n" +
                "\n" +
                "\n" +
                "Taco Objects to Assemble\n" +
                "------------------------\n" +
                "\n" +
                "* [Slow-Cooked Salsa Verde Chicken](https://github.com/sinker/tacofancy/blob/master/base_layers/slow_cooked_salsa_verde_chicken.md), but with [Chile de Arbol sauce](https://github.com/sinker/tacofancy/blob/master/condiments/chile_de_arbol_sauce.md)\n" +
                "* [Salsa de Aguacate](https://github.com/sinker/tacofancy/blob/master/condiments/salsa_de_aguacate.md)\n" +
                "* [Pickled red onions](https://github.com/sinker/tacofancy/blob/master/condiments/picked_red_onions.md)\n" +
                "* Jalepeños\n" +
                "* Corn\n" +
                "* Cheese (cheddar or jack)\n" +
                "* Cilantro",
            baseLayer = slowCookedSalsaVerdeChicken,
            condiment = "Salsa de chile de árbol\n" +
                "=======================\n" +
                "\n" +
                "This is a go-to taco sauce in western Mexico and probably elsewhere. You can\n" +
                "mix and match the techniques in the two variants presented here, and substituting\n" +
                "or adding chiles is a ramp onto the combinatorial superhighway of Mexican food and\n" +
                "can demystify the salsa bar at the local taquería.\n" +
                "\n" +
                "# Red\n" +
                "\n" +
                "* dried whole *chiles de árbol*\n" +
                "* tomatoes\n" +
                "* onion\n" +
                "* *optionally*, garlic\n" +
                "\n" +
                "Take between .3 and 1 chiles per tomato, remove the stems and put them in a\n" +
                "saucepan with a tablespoon or two of oil (olive, soy, etc.) The pan and oil should be very\n" +
                "hot and the chiles should seem to be at risk of burning. Rotate the\n" +
                "chiles around and let them get dark brown to black without actually burning them —\n" +
                "this can happen quickly, which is good because your eyes, nose, and lungs\n" +
                "may reach their maximum vaporized chile tolerance during this step.\n" +
                "\n" +
                "Add a bunch of chopped onion and garlic and lower the heat. Cut the tomatoes\n" +
                "in half and throw them in with salt to taste. Cook until the tomatoes look stewed.\n" +
                "If you have one of those blender wands that you can put directly in a saucepan,\n" +
                "you can blend everything now (you may end up making this sauce frequently enough\n" +
                "to justify the purchase of a blender wand.) Otherwise wait until the mixture\n" +
                "is not hot and blend it in a standard blender.\n" +
                "\n" +
                "# Green\n" +
                "\n" +
                "* dried whole *chiles de árbol*\n" +
                "* green tomatillos\n" +
                "* onion\n" +
                "* cilantro\n" +
                "\n" +
                "Take between .1 and .5 chiles per tomatillo, remove the stems and put them in a bare, hot saucepan.\n" +
                "Toast the chiles without oil until they are dark. Add halved or quartered tomatillos, salt, and a\n" +
                "tablespoon or two of water to prevent burning the chiles before the tomatillos release\n" +
                "their juices. When the mixture has cooked for as long as you can stand to wait, remove\n" +
                "the heat and let it cool. Blend and place in a little salsa bowl and heap with finely\n" +
                "chopped onion and cilantro.\n" +
                "\n" +
                "One non-obvious little point is that skipping the oil in the chile roasting-toasting\n" +
                "step seems to increase the spiciness of the final product.\n" +
                "\n" +
                "tags: vegetarian\n" +
                salsaDeAguacate,
            mixin = pickedRedOnions,
            photoRes = R.drawable.taco_1),
        Recipe(
            name = "Spaghetti (Squash) Tacos",
            recipe = "# Spaghetti (Squash) Tacos\n" +
                "\n" +
                "![Spaghetti (Squash) Tacos](https://farm3.staticflickr.com/2945/15473783312_936e69e795.jpg \"Spaghetti (Squash) Tacos\")\n" +
                "\n" +
                "I'm too old for the television show iCarly to have any cultural resonance, so I only learned that spaghetti tacos were a thing from this [New York Times trend piece](http://www.nytimes.com/2010/10/06/dining/06tacos.html).  When some [farmer friends](http://chicagopatchworkfarms.com/) gave me a lot of squash, I did what I always do when I don't know what to do with ingredients and tried to make it into a taco.  This is a more adult version of the food gag, or perhaps a way to compell kids to eat a somewhat weird but delicious seasonal vegetable.\n" +
                "\n" +
                "## Components\n" +
                "\n" +
                "* [spaghetti squash](../base_layers/spaghetti_squash.md)\n" +
                "* [tomato sauce](../condiments/tomato_sauce_above_average.md)\n" +
                "* fresh basil\n" +
                "* grated [Grana Padano](http://en.wikipedia.org/wiki/Grana_(cheese)) cheese\n" +
                "* spicy giardiniera (if you're into that kind of thing.  I eat on almost anything)\n" +
                "\n" +
                "## Preparation\n" +
                "\n" +
                "Bake the spaghetti squash and scoop it into strands.  While the squash is baking, prepare the tomato sauce.  Toss the squash with the sauce and spoon onto tortillas, or more authentically, taco shells.  Use scissors to snip thin strips of fresh basil on top of the tacos and sprinkle withe the cheese.\n" +
                "\n" +
                "The squash can be pretty moist, so if you're using corn tortillas, you'll want to double-up.\n" +
                "\n" +
                "tags: vegetarian",
            baseLayer = "# Spaghetti Squash\n" +
                "\n" +
                "## Ingredients\n" +
                "\n" +
                "* 1 Spaghetti Squash\n" +
                "\n" +
                "## Instructions\n" +
                "\n" +
                "1. Preheat oven to 400 degrees F.\n" +
                "2. Slice squash lengthwise and scoop out seeds.\n" +
                "3. Fill the bottom of a baking dish to approximately 1/4 in. with stock or water.\n" +
                "4. Place squash sliced side down in baking dish.\n" +
                "5. Bake for 30-45 minutes.  Check at 30 minutes to see if the squash is tender and remove from oven as soon as the squash is tender.\n" +
                "6. Scrape the squash across the width of each half with a fork.  The squash will come off the skin in strands.\n" +
                "7. Toss the strands with a drizzle of olive oil and freshly ground black pepper to taste.\n" +
                "\n" +
                "tags: vegan, vegetarian",
            condiment = "# Above Average Tomato Sauce\n" +
                "\n" +
                "## Ingredients\n" +
                "\n" +
                "* 1 24oz jar or can of crushed tomatos or tomato puree\n" +
                "* 1 T olive oil\n" +
                "* 1/4 to 1/2 of a medium onion\n" +
                "* 2 cloves garlic\n" +
                "* 1 red bell pepper\n" +
                "* 1 t Italian seasoning\n" +
                "* salt to taste\n" +
                "\n" +
                "## Instructions\n" +
                "\n" +
                "1. Chop onion, garlic and pepper.\n" +
                "2. Heat olive oil in a skillet and sautee the onion and garlic until the onion is translucent.\n" +
                "3. Add salt, Italian seasoning and bell pepper and sautee until the pepper begins to soften.\n" +
                "4. Add crushed tomatos and simmer while the rest of your meal cooks.\n" +
                "\n" +
                "tags: vegan, vegetarian",
            photoRes = R.drawable.taco_2),
        Recipe(
            name = "Sriracha Pork Tacos",
            recipe = "Sriracha Pork Tacos\n" +
                "===================\n" +
                "\n" +
                "These awesome, spicy, charred-up pork tacos are a good fast way to maximum deliciousness.\n" +
                "\n" +
                "Prepare your pork using:\n" +
                "\n" +
                "[chopped pork](https://github.com/sinker/tacofancy/blob/master/base_layers/chopped_pork.md)\n" +
                "[sriracha marinade](https://github.com/sinker/tacofancy/blob/master/seasonings/sriracha_marinade.md)\n" +
                "\n" +
                "Fry up your spiced chunks of pork over high heat so that they char up real nice.These are best left pretty simple, as the pork itself is the real highlight here. I'd recommend adding:\n" +
                "\n" +
                "* chopped tomatoes\n" +
                "* [pickled_red_onions](https://github.com/sinker/tacofancy/blob/master/condiments/picked_red_onions.md)\n" +
                "\n" +
                "Would also be amazing just straight-up street taco style with chopped raw onion " +
                "and some [salsa verde](https://github.com/sinker/tacofancy/blob/master/condiments/simple_salsa_verde.md).",
            baseLayer = "Chopped Pork\n" +
                "=============\n" +
                "\n" +
                "This is a quick and easy way to prep and cook your pork for tacos.\n" +
                "\n" +
                "You need:\n" +
                "\n" +
                "* pork chops, boneless, don't go too crazy thick, around 1-2\" tops.\n" +
                "* kitchen scissors\n" +
                "\n" +
                "Do you see where this is going? Cut up your chops unevenly with the scissors. Go for an average of chopped bits around 1\" in size or so, but variation is good, especially little bits. Those little bits are going to turn into crispy bits of goodness. When you..\n" +
                "\n" +
                "Toss all this into a high-heat pan (cast iron, if you've got it) and fry it up so that it chars up real nice. The little bits will turn into little charred chunks--this is a feature, not a bug.\n" +
                "\n" +
                "Prior to the pan-tossing, you should spice up your pork with a good rub or " +
                "marinade. If you're looking, I recommend the [sriracha marinade](https://github.com/sinker/tacofancy/blob/master/seasonings/sriracha_marinade.md).",
            seasoning = "Sriracha Marinade\n" +
                "===================\n" +
                "\n" +
                "Alone on a Saturday night, I put on Iron Maiden, cubed up a pork chop and whipped this marinade together:\n" +
                "\n" +
                "* 2-3 Tbs sriracha sauce\n" +
                "* couple pinches of Mexican Oregano\n" +
                "* good shake of smokey paprika\n" +
                "* tsp or so of ground ancho chile\n" +
                "* pinch of salt\n" +
                "\n" +
                "Get this coated nicely over everything before frying or grilling on high heat.\n" +
                "\n" +
                "tags: vegetarian, vegan",
            mixin = pickedRedOnions,
            condiment = salsaVerde,
            photoRes = R.drawable.taco_3),
        Recipe(
            name = "Steak, Sweet Potato and Apple Tacos",
            recipe = "Steak, Sweet Potato and Apple Tacos\n" +
                "==================================\n" +
                "\n" +
                "It was a cold, wet November night tonight and I wanted a good warm taco that had a little bit of a taste of fall to it. Sweet-potato is one of my go-to taco ingredients, and on a whim, I cut up an apple and added it in. OHMYGOD, that was a good move. This taco contains the following:\n" +
                "\n" +
                "* [Chopped Steak](https://github.com/sinker/tacofancy/blob/master/base_layers/chopped_steak.md)\n" +
                "* [Sweet Potato and Apple Hash](https://github.com/sinker/tacofancy/blob/master/mixins/sweet_potato_and_apple_hash.md)\n" +
                "* Guacamole\n" +
                "* Tomatoes\n" +
                "* Sour Cream\n" +
                "* Sriracha\n" +
                "\n" +
                "They were really good.",
            baseLayer = choppedSteak,
            mixin = sweetPotatoAndAppleHash,
            photoRes = R.drawable.taco_4),
        Recipe(
            name = "Summer Chicken Tacos with Mango - Avocado Salsa",
            recipe = "Summer Chicken Tacos with Mango - Avocado Salsa\n" +
                "===============================================\n" +
                "\n" +
                "These tacos are easy to prepare, yet perfect for a mature palate.\n" +
                "Prep Time: 5 minutes\n" +
                "Cook Time: 15 minutes\n" +
                "\n" +
                "Taco Objects to Assemble\n" +
                "------------------------\n" +
                "\n" +
                "* [Basic Shredded Chicken](https://github.com/sinker/tacofancy/blob/master/base_layers/basic_shredded_chicken.md) but substitute Boneless Chicken Thighs for Chicken Breasts. \n" +
                "* [Mango and Avocado Salsa](https://github.com/sinker/tacofancy/blob/master/condiments/mango_avocado_salsa.md)\n" +
                "* Monterey Jack Cheese (optional)\n" +
                "* Flour Tortillas\n" +
                "\n" +
                "Directions\n" +
                "----------\n" +
                "\n" +
                "1. Season chicken thighs with salt and pepper and brown in a large skillet on medium heat.\n" +
                "2. Cube the browned chicken thighs and return to the pan.\n" +
                "3. Add spices from Basic Shredded Chicken recipe.\n" +
                "4. Simmer on low heat until chicken is cooked through.\n" +
                "5. Serve Chicken on warm Flour Tortillas with Mango Avocado Salsa and Monterey Jack Cheese.\n" +
                "6. Feel incredibly full and happy.",
            baseLayer = basicShreddedChicken,
            condiment = "Mango Avocado Salsa\n" +
                "===================\n" +
                "\n" +
                "Goes great on soft shell chicken tacos with cheese (or deep-friend wantons with scallops)!\n" +
                "\n" +
                "__Ingredients__\n" +
                "\n" +
                "* 2 Avocados\n" +
                "* 2 Mangos\n" +
                "* 1 Orange\n" +
                "* 1 Tablespoon Honey\n" +
                "* Garlic cloves (leave it up to your buds)\n" +
                "* Pepper\n" +
                "* 1 Lime\n" +
                "\n" +
                "__Directions__\n" +
                "\n" +
                "1. Chop avocado and mango into bowl.\n" +
                "2. Squeeze the lime and half the orange in, add honey.\n" +
                "3. Add garlic (chopped or pressed) and pepper to taste.\n" +
                "4. Stir and enjoy!\n" +
                "\n" +
                "tags: vegetarian, vegan",
            photoRes = R.drawable.taco_5),
        Recipe(
            name = "Swiss Chard Tacos",
            recipe = "# Swiss Chard Tacos\n" +
                "\n" +
                "Got chard or another leafy green from your CSA? Now you can have tacos\n" +
                "\n" +
                "Components:\n" +
                "* [Cooked chard](https://github.com/sinker/tacofancy/blob/master/base_layers/swiss_chard.md)\n" +
                "* 1 onion sliced thin\n" +
                "* 1/2 cup of vegetable broth\n" +
                "* crumbled queso fresco or crema\n" +
                "* salsa\n" +
                "\n" +
                "Of course, you could decide you want to add some grilled chicken or steak (but then it wouldn't be vegetarian). Or you could _make it Monteiro_ and add tofu or other soy products.\n" +
                "\n" +
                "tags: vegetarian",
            baseLayer = swissChard,
            photoRes = R.drawable.taco_1),
        Recipe(
            name = "Tacos de Carnitas",
            recipe = "# Tacos de Carnitas\n" +
                "#### Charred corn, crema and chicharron\n" +
                "\n" +
                "* 1 recipe of [fat-poached carnitas](..//base_layers/fat_poached_carnitas.md).\n" +
                "* 1 recipe of [charred corn](..//condiments/charred_corn.md).\n" +
                "* 1 recipe of [onions and cilantro](..//condiments/onions_and_cilantro.md).\n" +
                "* Salvadoran or Pueblan crema; use sour cream if unavailable.\n" +
                "* Tomatillo or salsa verde.\n" +
                "* Chicharrones or pork rinds.\n" +
                "* Cotija or queso anejo.\n" +
                "* Quartered lime.\n" +
                "* Hot sauce and/or chili powder.\n" +
                "* Corn tortillas, steamed or pan-heated through until pliable.\n" +
                "\n" +
                "1. Smear tortilla with crema and then salsa.\n" +
                "2. Tong 1-2 oz of  [fat-poached carnitas](..//base_layers/fat_poached_carnitas.md) and spread it out.\n" +
                "3. Top carnitas with [charred corn](..//condiments/charred_corn.md) and [onions and cilantro](..//condiments/onions_and_cilantro.md).\n" +
                "4. Sprinkle with cotija.\n" +
                "5. Nestle chicharrone on the top like a shark fin.\n" +
                "6. Sprinkle with hot sauce and chili powder.\n" +
                "7. Consume immediately.",
            baseLayer = "# Fat-Poached Carnitas\n" +
                "* 3 pounds of boneless pork shoulder or uncured picnic ham (see note for how to select).\n" +
                "* 0.25 to 0.50 cups of liquified fat (oil, lard or duck fat is acceptable)\n" +
                "* 10 to 15 garlic cloves (roasted preferred)\n" +
                "* 1 lemon, sliced into thin circles and those are quartered\n" +
                "* coarse salt\n" +
                "* black pepper\n" +
                "\n" +
                "1. Heat oven to 250 degrees.\n" +
                "2. Cube pork shoulder in roughly 3-inch chunks.\n" +
                "3. Salt and pepper the cubes aggressively.\n" +
                "4. Stuff cubes tightly (very tightly) into the smallest, deepest baking dish available.\n" +
                "5. Stuff garlic and lemon between the cubes.\n" +
                "6. Pour fat over cubes to just cover.\n" +
                "7. Bake in oven for 5 hours.\n" +
                "8. Remove dish from oven.\n" +
                "9. Cover a sheet pan with foil.\n" +
                "10. With slotted spoon, remove the pork to the sheet pan and spread out in a single layer.\n" +
                "11. Turn on broiler.\n" +
                "12. Broil pork in sheet pan until it is somewhat blackened and crispy, probably 4-6 minutes. YMMV because broilers are ridiculous.\n" +
                "13. Remove from oven and tease with fork.\n" +
                "\n" +
                "## Notes\n" +
                "* A nice thick fat cap on the top of the pork is preferable.\n" +
                "* Ask your butcher to remove any bones.\n" +
                "* Do not use cured meat.",
            mixin = "charred corn\n" +
                "=========\n" +
                "* 6-8 ears of very fresh sweet corn.\n" +
                "* Canola, peanut or other high-heat vegetable oil.\n" +
                "* Sheet pan covered with tin foil.\n" +
                "* Good long tongs.\n" +
                "* Large metal bowl.\n" +
                "\n" +
                "1. Prepare the oven for broiling by moving a single rack to the highest level. It should be no closer than 2-3 inches from the broiler.\n" +
                "2. Under this rack set the second rack and the sheet pan covered with tin foil to catch drips from the corn.\n" +
                "3. Brush each ear of corn lightly with oil.\n" +
                "4. Pull out top rack halfway and place the corn directly on the rack.\n" +
                "5. Push the rack in and turn on the broiler.\n" +
                "6. Watch the corn. You're looking for some fairly blackened bits and lots of dark brown.\n" +
                "7. Note: Do not let the corn catch on fire.\n" +
                "8. Turn the corn one quarter turn with the tongs. Repeat until each corn ear is fairly dark brown.\n" +
                "9. Remove the corn ears to the large metal bowl they are fully turned and browned/charred.\n" +
                "10. Turn off the broiler.\n" +
                "11. Let the corn cool for 15 minutes or until you can touch it.\n" +
                "12. Stand an ear of corn up on the bottom.\n" +
                "13. Using your sharpest knife, start at the top of the corn ear and slice down through the kernels. They will come off in sheets.\n" +
                "14. Turn the corn a quarter or a fifth turn and repeat until you've removed the kernels. Note: Some will stick at the top and bottom.\n" +
                "15. Do this for each ear of corn.\n" +
                "16. Now you have a bowl full of kernels. Mix with lime juice (2 limes?) and 3-6 oz of cotija to make a corn salad.\n" +
                "17. BONUS: Freeze the cobs. Later, make corn stock by boiling the cobs for an " +
                "hour in 2 gallons of water. Remove the cobs and reduce to about 2 quarts. Use with grits or as a soup base.",
            condiment = "Onions and Cilantro\n" +
                "=============\n" +
                "* 1 white onion, peeled.\n" +
                "* Bunch of cilantro, long bottom stems removed (stems between leaves are fine).\n" +
                "* Juice of one lime.\n" +
                "\n" +
                "1. Dice white onion into 0.50 inch dice.\n" +
                "2. Roughly chop cilantro.\n" +
                "3. Add onion and cilantro to a bowl with the lime juice and mix thoroughly.\n" +
                "4. Store in an airtight container for up to a week.",
            photoRes = R.drawable.taco_2),
        Recipe(
            name = "Tempeh reuben tacos",
            recipe = "# Tempeh reuben tacos \n" +
                "\n" +
                "Vegetarian; vegan without cheese\n" +
                "--------------------------------\n" +
                "\n" +
                "1. Prepare the [Pepper Tempeh filling](https://github.com/sinker/tacofancy/blob/master/base_layers/pepper_tempeh.md)\n" +
                "2. Serve in a corn tortilla.\n" +
                "3. Top with sauerkraut.  Homemade sauerkraut is particularly delicious and I found [this recipe](http://www.wildfermentation.com/making-sauerkraut-2/) relatively easy to follow.\n" +
                "4. Sprinkle with carroway seeds.\n" +
                "3. Optionally, top with swiss cheese. For vegans, I've found sliced avocado to be a nice creamy substitute.\n" +
                "4. Top with a spicy mustard.\n" +
                "\n" +
                "---\n" +
                "tags: vegetarian, vegan, tempeh",
            baseLayer = "# Pepper Tempeh\n" +
                "\n" +
                "## Ingredients\n" +
                "\n" +
                "* 1 block tempeh\n" +
                "* 1 T olive oil\n" +
                "* 1 T apple cider vinnegar\n" +
                "* 1/2 T soy sauce or Braggs\n" +
                "* 1 t garlic powder\n" +
                "* 1/2 C water\n" +
                "* Ample amounts of coursely ground black pepper to taste\n" +
                "\n" +
                "## Directions\n" +
                "\n" +
                "1. Cut tempeh into thin slices\n" +
                "2. Combine olive oil, vinnegar, soy sauce, garlic powder and water in a bowl and marinate the Tempeh for 10-30 minutes.\n" +
                "3. Add the tempeh and marinade to a skillet and saute over medium heat until liquid evaporates.\n" +
                "4. Add a bit more water and continue to cook for about 2 minutes.\n" +
                "\n" +
                "---\n" +
                "tags: vegetarian, vegan",
            photoRes = R.drawable.taco_3),
        Recipe(
            name = "Teriyaki Chicken Tacos",
            recipe = "Teriyaki Chicken Tacos\n" +
                "======================\n" +
                "\n" +
                "These Teriyaki Chicken Tacos are savory, sweet, spicy, tangy, and everything in between to become your new favorite tacos!\n" +
                "\n" +
                "__Ingredients__\n" +
                "* 1 bottle Teriyaki marinade or sauce\n" +
                "* 1/2 pounds [basic shredded chicken](../base_layers/basic_shredded_chicken.md)\n" +
                "* 4-6 taco size flour tortillas\n" +
                "* 2 cups shredded Montery Jack cheese\n" +
                "* 1 1/4 cups cooked rice\n" +
                "* [Grilled pineapple pear salsa](../condiments/grilled_pineapple_pear_salsa.md)\n" +
                "* [Pineapple lime crema](../condiments/pineapple_lime_crema.md)\n" +
                "\n" +
                "__Instructions__\n" +
                "* Place the [basic shredded chicken](../base_layers/basic_shredded_chicken.md) in a medium bowl, pour 1/2 bottle of Teriyaki sauce into the bowl and mix well.\n" +
                "* Heat up tortillas in a medium pan with a little bit of butter on medium-low heat. While the tortilla is heating up, place a little bit of rice on the tortilla, then top with some cheese so the cheese will melt slightly.\n" +
                "* Take the tortilla/rice/cheese combo out of the pan and onto a plate.\n" +
                "* Top with Teriyaki chicken, followed by grilled pineapple pear salsa, finally drizzle with pineapple lime crema.\n" +
                "\n" +
                "Enjoy!",
            baseLayer = basicShreddedChicken,
            condiment = "Grilled Pineapple Pear Salsa\n" +
                "============================\n" +
                "\n" +
                "__Ingredients__\n" +
                "* 1/2 ripe pineapple, trimmed and sliced\n" +
                "* 1 large medium-firm pear sliced into 1/4 inch slices\n" +
                "* 1 large red bell pepper, seeded and quartered\n" +
                "* 1/2 small red onion, peeled and cut in half (so you have 2 quarters of a whole onion)\n" +
                "* 1 jalapeno, diced\n" +
                "* 1/2 cup loosely packed cilantro, finely chopped\n" +
                "* 1 tablespoon lime juice\n" +
                "* 1/8 teaspoon ground ginger\n" +
                "* 1/8 teaspoon ground cumin\n" +
                "* salt and pepper to taste\n" +
                "\n" +
                "__Instructions__\n" +
                "* Sautee red onions, pineapple, red bell peppers, pears, and jalapeno in olive oil on high heat. Do not move vegetables and pineapples around until they're slightly charred and caramelized.\n" +
                "* Once the above ingredients are caramelized and charred, take them off the heat and place them in medium bowl.\n" +
                "* Mix in cilantro, lime juice, ground ginger, ground cumin, and salt and pepper.\n" +
                "\n" +
                "Can be eaten immediately but it is best served chilled.\n" +
                "Pineapple Lime Crema\n" +
                "====================\n" +
                "\n" +
                "__Ingredients__\n" +
                "* 1 5.3 ounce pineapple yogurt\n" +
                "* 2 tablespoons mayonnaise\n" +
                "* 1/2 tablespoon lime juice\n" +
                "\n" +
                "__Instructions__\n" +
                "* Whisk ingredients together in small bowl.\n" +
                "* Place in refrigerator until ready to use.",
            photoRes = R.drawable.taco_4),
        Recipe(
            name = "Thanksgiving Tacos",
            recipe = "Thanksgiving Tacos\n" +
                "==================\n" +
                "\n" +
                "You know what would make Thanksgiving a lot better? If you tossed everything great about it into a taco. This recipe combines a few favorites from Tacofancy along with a [new riff](https://github.com/sinker/tacofancy/blob/master/condiments/cranberry_salsa.md) on a Thanksgiving-appropriate salsa. There's a 98% chance that these will be featured on my Thanksgiving day table (the 2% is I die before Thanksgiving).\n" +
                "\n" +
                "Let's do this\n" +
                "-------------\n" +
                "\n" +
                "You're going to need to prepare the following taco objects: \n" +
                "\n" +
                "* [@Deezthugs' Smokey Turkey](https://github.com/sinker/tacofancy/blob/master/base_layers/smokey_turkey.md)\n" +
                "* [Sweet Potato and Apple Hash](https://github.com/sinker/tacofancy/blob/master/mixins/sweet_potato_and_apple_hash.md)\n" +
                "* [Cranberry Salsa](https://github.com/sinker/tacofancy/blob/master/condiments/cranberry_salsa.md)\n" +
                "* [Salsa de Aguacate](https://github.com/sinker/tacofancy/blob/master/condiments/salsa_de_aguacate.md)\n" +
                "\n" +
                "Notes\n" +
                "-----\n" +
                "\n" +
                "* Give yourself plenty of time here, the [Smokey Turkey](https://github.com/sinker/tacofancy/blob/master/base_layers/smokey_turkey.md) recipe takes a while. Frankly, it ain't Thanksgiving if you're not spending most of your day in the kitchen getting this shit together. \n" +
                "\n" +
                "* The [Cranberry Salsa](https://github.com/sinker/tacofancy/blob/master/condiments/cranberry_salsa.md) is best assembled pretty close to eating. You can make the cranberries well ahead of time, but the longer this thing sits, the more it just tastes like cranberry sauce.\n" +
                "\n" +
                "* You can probably cut the size of the [Salsa de Aguacate](https://github.com/sinker/tacofancy/blob/master/condiments/salsa_de_aguacate.md) recipe by a third--the recipe makes a lot (then again, just means you've got toppings for another taco later in the week).\n" +
                "\n" +
                "* If you really want to make the day extra-special, make your own [Fresh Corn Tortillas](https://github.com/sinker/tacofancy/blob/master/shells/Fresh_corn_tortillas.md)\n" +
                "\n" +
                "* THANKSGIVING POWER ACTIVATE",
            baseLayer = "@deezthugs' Smokey Turkey Tacos\n" +
                "===============================\n" +
                "\n" +
                "These tacos have and will blow minds.\n" +
                "\n" +
                "(Note:  I cannot separate the base_layer here from the seasoning, it is all integral)\n" +
                "\n" +
                "* 2 Packages ground Turkey or Chicken (1.5 to 2 lbs) - not the lean stuff for Chrissake!\n" +
                "* Several slices of cooked bacon, diced\n" +
                "* 2 Tbs Coconut oil\n" +
                "* 2 Tbs Bacon Grease. That's right, Bacon Grease. (What you don't keep it? Might as well just quit now)\n" +
                "* 1 Medium sweet onion\n" +
                "* (The following dry ingrediants can be increased depending on amount of meat)  \n" +
                "* 4 Garlic Cloves, smashed\n" +
                "* 1 tsp Cumin\n" +
                "* 2 tsp Onion powder\n" +
                "* 1 tsp Chipotle powder (use as much as required)\n" +
                "* 1 tsp (cool smokey) Paprika\n" +
                "* 1 tsp Cinnamon\n" +
                "* 1 tsp Ground Ginger\n" +
                "* 1/2 - 1 tsp Black Pepper\n" +
                "* 1 tsp Kosher Salt\n" +
                "* 3 Limes, juiced\n" +
                "* [optional] 1/2 can low-salt Chicken broth\n" +
                "\n" +
                "Combine all dry seasonings in bag, shake up and combine well with raw turkey meat. return to fridge for an hour or more. \n" +
                "\n" +
                "Melt the Bacon Grease over medium heat, add Coconut oil and diced onion, cook down till onions are, well, you know, awesome. Add the smashed garlic. Add the bacon. Add the turkey meat and break it down into medium/small bits with a spatula or butter knife. After cooking for a few minutes and the meat has begun to brown, drizzle 2 of limes' juice onto the meat.\n" +
                "\n" +
                "Cook well, adding optional chicken broth to shape the consistency as needed. (Generally not needed unless you accidentally buy low-fat meat. Shame on you.)\n" +
                "\n" +
                "Finally, transfer amount for a meal to a frying pan, frying for a few minutes to" +
                " create some crispy bits (This is the key step:)), adding lime juice as it cooks.  Spoon onto favorite tortillas add condiments and devour.",
            mixin = sweetPotatoAndAppleHash,
            condiment = "Cranberry Salsa\n" +
                "===============\n" +
                "\n" +
                "Ingredients\n" +
                "------------\n" +
                "* 1 bag cranberries\n" +
                "* 1 cup water\n" +
                "* 3/4 cup sugar\n" +
                "* half a small white onion (chopped)\n" +
                "* 1 jalepeño, chopped small (remove seeds & wash for less heat)\n" +
                "* 1 bunch cilantro (cut up)\n" +
                "* 1 lime\n" +
                "\n" +
                "Directions\n" +
                "-----------\n" +
                "1. In a saucepan, get your water and sugar boiling, then add the cranberries. Boil until the cranberries pop (5-10 minutes), then take off heat, drain, and cool. They'll be slightly jelly-like, but you don't want them to disintegrate entirely, so watch them closely.\n" +
                "\n" +
                "2. While the cranberries are cooling, chop your white onion, your jalepeño and cilantro.\n" +
                "\n" +
                "3. Once your berries are cool, they'll probably have turned gooey. If there is still a bunch of water, drain it. But it's probably turned to jelly.\n" +
                "\n" +
                "4. Combine everything, and give a good squeeze of lime over the whole thing. As you combine, you'll notice that the cranberries just give up their shape entirely. Also: Don't wear your finest clothing when you do this--this shit _stains_.\n" +
                "\n" +
                "5. Make adjustments based on taste here. Your main variables are:\n" +
                "\t* Sweet vs tangy. Default right now is tangy. Add more sugar for sweet.\n" +
                "\t* Battling the overwhelmingness of the cranberries. You've got two things going with the cranberries here: flavor and texture. More onion will add more crunch to the whole thing, and help boost up the salsa-ness. Jalepeño is your heat adjustment--seeds are your friend. But the Cilantro is your big mover here: it helps to round out the sharpness of the cranberry. Lime also helps bring down the cranberry overload.\n" +
                "\n" +
                "\n" +
                "Orange Cranberry Salsa Holographic Varient Cover\n" +
                "------------------------------------------------\n" +
                "\n" +
                "* Go with half a cup of OJ and half a cup of water to boil your berries in.\n" +
                "* Compliment the lime juice with a fresh squeezed orange and then *zest* that motherfucker right into the salsa\n" +
                "\n" +
                "tags: vegetarian, vegan\n" +
                salsaDeAguacate,
            shell = freshCornTortillas,
            photoRes = R.drawable.taco_5),
        Recipe(
            name = "Traditional American Taco",
            recipe = "Traditional American Taco\n" +
                "===================================\n" +
                "\n" +
                "This is the configuration that many American children are surprised to grow up and discover is not Mexican in the least.\n" +
                "\n" +
                "* [Ground Beef](https://github.com/sinker/tacofancy/blob/master/base_layers/ground_beef_traditional_us.md)\n" +
                "* [Hard Corn Shells](https://github.com/sinker/tacofancy/blob/master/shells/hard_corn_traditional_us.md)\n" +
                "* [Cheese](https://github.com/sinker/tacofancy/blob/master/mixins/cheese_traditional_us.md)\n" +
                "* [Tomatoes](https://github.com/sinker/tacofancy/blob/master/mixins/tomatoes_traditional_us.md)\n" +
                "* [Lettuce](https://github.com/sinker/tacofancy/blob/master/mixins/lettuce_traditional_us.md)\n" +
                "* Hot Sauce/Salsa (store bought is fine; for fresh alternatives check out the [Condiments](https://github.com/sinker/tacofancy/blob/master/condiments) list)\n" +
                "\n" +
                "_Optional_\n" +
                "\n" +
                "* [Guacamole (Simple)](https://github.com/sinker/tacofancy/blob/master/condiments/guacamole_simple.md)\n" +
                "* [Sour Cream](https://github.com/sinker/tacofancy/blob/master/condiments/sour_cream.md)\n" +
                "* [Black Olives](https://github.com/sinker/tacofancy/blob/master/condiments/black_olives.md)\n" +
                "\n" +
                "1. Cook the ground beef; heat the shells; chop the tomatoes; shred the cheese and lettuce. Stick a spoon in the salsa.\n" +
                "2. Once everything's on the table, anything goes. Tradition holds that the meat " +
                "goes first and the cheese goes on the meat (so as to promote melting).",
            baseLayer = groundBeef,
            shell = "Hard Corn Shells (Traditional; US)\n" +
                "======================\n" +
                "\n" +
                "Mistakenly thought by many to be traditionally Mexican, hard shells were actually popularized in the US in the mid-20th century.\n" +
                "\n" +
                "While they can certainly be made at home (if you have access to a deep-fryer), the best method of obtaining hard taco shells is to head to the grocery store.\n" +
                "\n" +
                "If you line them with a lettuce leaf rather than using chopped lettuce, when the shell cracks you won't lose the contents into your lap.\n" +
                "\n" +
                "tags: vegetarian",
            mixin = cheese + "\n" + lettuce + "\n" + tomatoes,
            condiment = "Guacamole (Simple)\n" +
                "=========\n" +
                "\n" +
                "If you're not in the mood to be fussy, this could be considered a minimum-viable guacamole recipe.\n" +
                "\n" +
                "* 2 ripe avocados\n" +
                "* 2-4 limes, depending on juiciness, delivering 2-4T of lime juice\n" +
                "* 1 diced tomato (seeded if it's a big one)\n" +
                "* salt (to taste)\n" +
                "* hot sauce (to taste; Frank's Red Hot is a standard, but go with what you like)\n" +
                "\n" +
                "1. Scoop the avocado meat into a bowl and mash them with a fork. Leave it a bit lumpy as we will do more stirring in a bit and we don't want to over-work them.\n" +
                "2. Add the chopped tomato.\n" +
                "3. Add the lime juice; hold some back for later adjustment).\n" +
                "4. Add ½t salt.\n" +
                "5. Add 2T hot sauce.\n" +
                "6. Stir with the fork again.\n" +
                "7. Taste.\n" +
                "8. Adjust salt/lime/hot sauce as desired.\n" +
                "\n" +
                "This recipe will support one average-size bag of chips, so adjust quantities based on expectations.\n" +
                "\n" +
                "tags: vegetarian\n" +
                "Black Olives\n" +
                "==========\n" +
                "\n" +
                "Canned black olives add a sweet and cool meatiness to a traditional American taco.\n" +
                "\n" +
                "tags: vegetarian, vegan\n" +
                sourCream,
            photoRes = R.drawable.taco_1),
        Recipe(
            name = "Vegan Red Cabbage Tacos",
            recipe = "Vegan Red Cabbage Tacos\n" +
                "=======================\n" +
                "\n" +
                "1. Prepare [Red Cabbage Filling](https://github.com/sinker/tacofancy/blob/master/base_layers/red_cabbage.md)\n" +
                "2. Prepare [Garlic Black Beans](https://github.com/sinker/tacofancy/blob/master/base_layers/garlic_black_beans.md)\n" +
                "3. Serve in toasted corn tortillas, topped with optional veggies and a squeeze of lime.\n" +
                "\n" +
                "tags: vegetarian, vegan",
            baseLayer = "Red Cabbage Filling\n" +
                "===================================\n" +
                "\n" +
                "* 1/2 head of red cabbage, shredded\n" +
                "* 3 chopped green onions\n" +
                "* 1/2 bunch of finely chopped cilantro\n" +
                "* 2-3 squeezed limes\n" +
                "\n" +
                "1. Mix all ingredients in large bowl\n" +
                "\n" +
                "tags: vegetarian, vegan\n" +
                "Garlic Black Beans\n" +
                "==================\n" +
                "\n" +
                "Vegetarian/Vegan\n" +
                "----------------\n" +
                "\n" +
                "* Can of plain black beans\n" +
                "* 3 - 6 cloves of garlic chopped fine\n" +
                "* Vegetable oil of your choice\n" +
                "* Cumin\n" +
                "* Cayenne or Chipotle pepper (optional)\n" +
                "* Lemon juice (optional)\n" +
                "\n" +
                "1. Heat a tablespoon of olive oil in a saucepan over medium heat. \n" +
                "2. When olive oil starts to shimmer, add the garlic and let it simmer for about 10 seconds.\n" +
                "3. Add cumin and pepper (if wanted) and simmer for another 10 seconds.\n" +
                "4. Pour in the entire can of beans, don't drain or rinse them.\n" +
                "5. Simmer for about 15 minutes or until the bean broth has thickened to your liking. If the beans will be the main ingredient of your tacos, cook until the beans are just about totally dry. If you're using them in a mixture (like the [Black Bean, Potato, and Onion Tacos](https://github.com/sinker/tacofancy/blob/master/full_tacos/black_bean_potato_onion_tacos.md) ), let the broth stay a little bit runny.\n" +
                "6. Add a squeeze or two of lemon juice if you like. \n" +
                "\n" +
                "tags: vegetarian, vegan",
            photoRes = R.drawable.taco_2),
        Recipe(
            name = "Zucchini and Corn Tacos",
            recipe = "Zucchini and Corn Tacos\n" +
                "=======================\n" +
                "\n" +
                "Vegetarian; vegan without cheese\n" +
                "--------------------------------\n" +
                "\n" +
                "1. Prepare the [Zucchini & Corn Filling](https://github.com/sinker/tacofancy/blob/master/base_layers/zucchini_corn.md)\n" +
                "2. Add optional salsa (tomatillo is best, like the [Simple Salsa Verde](https://github.com/sinker/tacofancy/blob/master/condiments/simple_salsa_verde.md))\n" +
                "3. Serve in corn tortillas, topped with optional cheese (queso fresco if possible)\n" +
                "\n" +
                "tags: vegetarian, vegan",
            baseLayer = "Zucchini and Corn Filling\n" +
                "=========================\n" +
                "\n" +
                "Vegan\n" +
                "-----\n" +
                "\n" +
                "__Ingredients__\n" +
                "\n" +
                "* Diced zucchini\n" +
                "* White or yellow corn kernels\n" +
                "* Chopped white onion\n" +
                "* Chopped tomatoes\n" +
                "* Finely chopped garlic\n" +
                "* Black beans (you can even use [Garlic Black Beans](https://github.com/sinker/tacofancy/blob/master/base_layers/garlic_black_beans.md))\n" +
                "* Finely chopped oregano or Epazote\n" +
                "\n" +
                "__Directions__\n" +
                "\n" +
                "1. Toast corn in a skillet over high heat with oil and salt for about 5 minutes. Remove corn.\n" +
                "2. Cook onion in the skillet until it caramelizes (about 5 minutes). Leave onion in there.\n" +
                "3. Add garlic, cook another 1 or 2 minutes.\n" +
                "4. Add diced tomatoes, cook for 8-10 minutes.\n" +
                "5. Add zucchini, cook until it's tender.\n" +
                "6. Add corn back in.\n" +
                "7. Add black beans, Epazote; add salt, pepper, and other seasonings to taste. Cook for 3-4 more minutes.\n" +
                "\n" +
                "tags: vegetarian, vegan",
            condiment = salsaVerde,
            photoRes = R.drawable.taco_3),
        Recipe(
            name = "Chiken makloub",
            recipe = "Chiken makloub \n" +
                "==============\n" +
                "\n" +
                "Ingredients for bread:\n" +
                "\n" +
                "* 3 cups flour\n" +
                "* 3 teaspoons instant yeast\n" +
                "* Two large tablespoons sugar\n" +
                "* Cutting or more water\n" +
                "* salt\n" +
                "\n" +
                "![bread](http://www.coujina-tounsia.com/wp-content/uploads/2012/06/82.jpg \"Bread\")\n" +
                "\n" +
                "__Ingrediants__\n" +
                "\n" +
                "Filler:\n" +
                "\n" +
                "* BBQ Chicken\n" +
                "* Finely chopped onion\n" +
                "* Finely chopped garlic\n" +
                "* Green pepper\n" +
                "* Egg Whites\n" +
                "* Rusk\n" +
                "* Cumin\n" +
                "* Coriander\n" +
                "* Ground Cinnamon\n" +
                "* Salt\n" +
                "\n" +
                "![loads](http://www.coujina-tounsia.com/wp-content/uploads/2012/06/91.jpg \"loads\")\n" +
                "\n" +
                "__Enjoy__\n" +
                "\n" +
                "![Enjoy](http://www.coujina-tounsia.com/wp-content/uploads/2012/06/101.jpg \"Enjoy\")\n",
            photoRes = R.drawable.taco_4),
        Recipe(
            name = "Sad Mexican Grilled Cheese",
            recipe = "Sad Mexican Grilled Cheese\n" +
                "===================\n" +
                "\n" +
                "Almost a quesadilla.\n" +
                "\n" +
                "## Ingredients\n" +
                "\n" +
                "* [Sour cream](../condiments/sour_cream.md)\n" +
                "* [Grated Cheddar cheese](../mixins/cheese_traditional_us.md)\n" +
                "* White Bread (for maximum sadness)\n" +
                "* [Taco Seasoning](../seasonings/packaged_seasonings.md)\n" +
                "* Butter\n" +
                "\n" +
                "## Directions\n" +
                "\n" +
                "1. butter skillet and head over medium heat for a litle bit.\n" +
                "2. Butter both slices of bread.\n" +
                "3. Slap one slice of bread (buttered side down) on skillet and top with a fistful of cheese, and a pinch of taco seasoning. Then cover with other slice of bread. (buttered side up)\n" +
                "4. Make sure you cook both sides! It should take like 3 minutes.\n" +
                "5. Slam jam into the sour cream and take a bite.\n" +
                "6. Repeat step 4 untill throughly sad.\n" +
                "\n" +
                "tags: vegetarian",
            baseLayer = cheese,
            condiment = sourCream,
            seasoning = "Packaged Seasonings\n" +
                "==============\n" +
                "\n" +
                "Lest we be accused of snobbery, let's acknowledge that a taco is a taco, and taco night can be well-served by not having to think at all.\n" +
                "\n" +
                "Feel free to use the pre-packaged seasoning of your choice. When I'm in an old-school mood, I head straight for...\n" +
                "\n" +
                "* Old El Paso Taco Seasoning\n" +
                "\n" +
                "tags: vegetarian, vegan",
            photoRes = R.drawable.taco_5),
        Recipe(
            name = "Tunisian Makloub",
            recipe = "Tunisian Makloub\n" +
                "================\n" +
                "\n" +
                "The Tunisian Makloub is a taco like \"fast food\" eaten regularly alongside with sandwichs and pizza. There are many variations for this Makloub but I will try to explain the most famous one, the \"escalope\" wich is basically some turkey steak.\n" +
                "\n" +
                "__For the base layer:__\n" +
                "\n" +
                "Use regular pizza dough, open it up like spreading a pizza and then add some cheese (any kind that melts.. be crazy!) and some \"escalope\" For the \"escalope\" it should be well grilled with little (if no) spice. And then cut to very small pieces. Put that in the oven for 3-4 minutes, just enough to see the dough cook up.\n" +
                "\n" +
                "For the toppings, mayonnaise is usually combined with hot-sauce, garlic sauce, white cheese... _(no ketchup!)_\n" +
                "\n" +
                "After that we finish with some salade, tomatoes, onion,... Wrap it up, cut it in 2 halfs, and serve it in a flat plate with some french fries along the side. You can dress the french fries with ketchup and/or mayonnaise.",
            photoRes = R.drawable.taco_1),
        Recipe(
            name = "Baked Taquitos",
            recipe = "Baked Taquitos\n" +
                "==============\n" +
                "\n" +
                "Baked, not fried. Flour tortillas, not corn. _THE HORROR_. But seriously, these are super tasty and really, really kid-friendly. Adapted from [this basic recipe](http://www.chef-in-training.com/2012/02/baked-creamy-chicken-taquitos/).\n" +
                "\n" +
                "I almost always double this recipe and make a couple dozen at a time.\n" +
                "\n" +
                "* 12-15 soft-taco size flour tortillas\n" +
                "* Cooking spray/light oil\n" +
                "* Kosher salt\n" +
                "* 2 cups [shredded chicken](https://github.com/sinker/tacofancy/blob/master/base_layers/basic_shredded_chicken.md)\n" +
                "* 1 cup shredded cheese (colby jack works great)\n" +
                "* 3 oz. cream cheese\n" +
                "* 1/4 cup green salsa (the little can of Herdez works great, or [make your own](https://github.com/sinker/tacofancy/blob/master/condiments/simple_salsa_verde.md))\n" +
                "* Lime juice to taste\n" +
                "* 1 tsp chili powder\n" +
                "* 1/2 tsp cumin\n" +
                "* 1/2 tsp onion powder\n" +
                "* 2 Cloves minced garlic\n" +
                "* 2 Sliced green onions\n" +
                "\n" +
                "I have kids who are afraid of green things in their food. (I favor the whiter portions of the green onions.) If you do not live under such a regime, feel free to add _2 Tbsp chopped cilantro_.\n" +
                "\n" +
                "Although it really doesn't need it.\n" +
                "\n" +
                "In a large mixing bowl, pop your cream cheese into the microwave for 20-30 seconds to soften it. Then add the salsa, lime juice, chili powder, cumin, onion powder and garlic. Stir into a slurry, fold in the green onions and cilantro if you're going that way, then add the chicken and cheese. Mix well. (You can do all this in advance and keep the mix in the fridge for taquito time.)\n" +
                "\n" +
                "Once you're ready to bake, preheat your oven to 425 degrees and line a baking sheet with foil.\n" +
                "\n" +
                "Warm your package of tortillas in the microwave for 45 seconds or so, so they're pliable. To construct the taquitos, add 2-3 tablespoons of filling onto a tortilla, fold the tortilla over top, then use your fingers to pull the filling back toward you underneath the top half of the tortilla. You should end up with a nice, tight \"tube\" of filling at about the 1/3 point of the tortilla, so roll forward as tightly as you can to create the taquito cylinder.\n" +
                "\n" +
                "Place each taquito, seam-side down, onto your baking sheet. They shouldn't touch each other. Once they're all in place, hit the tops with a bit of cooking spray (I use the butter-flavored stuff, but you could also just lightly mop with a paper towel and some oil). Sprinkle the taquitos with a bit of kosher salt, then bake for approximately 20 minutes. Just look for golden-brown and delicious.\n" +
                "\n" +
                "Rock out with plenty of things to dip these in: salsa, sour cream, guacamole.",
            baseLayer = basicShreddedChicken,
            condiment = salsaVerde,
            photoRes = R.drawable.taco_2),
        Recipe(
            name = "Beef Vindaloo on Naan",
            recipe = "Beef Vindaloo on Naan\n" +
                "=================\n" +
                "\n" +
                "For those who enjoy indian food and for those whose mother wants tacos-esque things for dinner and you both know that you have delicious naan bread to use before it expires.\n" +
                "\n" +
                "### Ingredients\n" +
                "\n" +
                "* A piece of [naan](../shells/naan.md) bread (normal sized for a very large taco, or the tiny ones from Costco if you want deliciously tiny ones) \n" +
                "* Ground [beef](../base_layers/ground_beef_traditional_us.md)\n" +
                "* Some [bellpepper](../base_layers/bellpepper.md)\n" +
                "* Some [onion](../base_layers/onion.md)\n" +
                "* some pre-made [vindaloo](../condiments/vindaloo_sauce.md) sauce (You could make your own, but using pre-made is the easy and lazy, perhaps preferable, way out)\n" +
                "\n" +
                "1. Chop the preferred amount of onion and bellpepper lengthwise, put the sauce in a saucepan, prepare the beef by chopping it up into small bits. \n" +
                "2. Heat it all until the ground beef, onion, bellpepper, and vindaloo are all cooked completely, simultaneously heat the naan in the oven toward the end of the cooking cycle. Either master timing, or allow it to master you.\n" +
                "3. If not already combined, combine the beef, bellpepper, and onion into a mixture of possibly dry greatness. \n" +
                "4. If you would like, add the vindaloo into the beef, bellpepper, and onion mixture to mix the sauce into it nicely. \n" +
                "5. Apply your mixture of ingredients to the top of the naan bread, careful not to overflow the great near-taco-taco. \n" +
                "6. If you have not already sauced your taco with the vindaloo, vindaloo it. Do it. \n" +
                "7. Much enjoyment. \n",
            shell = "naan\n" +
                "=====================\n" +
                "\n" +
                "Naan bread can be purchased or made. It is easier to buy it at a store. \n" +
                "\n" +
                "Naan bread is a flatbread that tends to be fluffy and easy to tear apart. ",
            baseLayer = groundBeef,
            mixin = "bellpepper\n" +
                "========\n" +
                "\n" +
                "A bellpepper is typically cut up and then tossed into a skillet or something " +
                "else to heat it. Olive oil is nice. They can be grilled as well. \n" +
                "onion\n" +
                "========\n" +
                "\n" +
                "An onion is typically cut up and then tossed into a skillet or something else to" +
                " heat it. Olive oil is nice. They can be grilled or caramelized as well. ",
            condiment = "Vindaloo Sauce\n" +
                "================\n" +
                "\n" +
                "Vindaloo sauce can be prepared or store bought.\n" +
                "Vindaloo is an Indian curry sauce that is popular in the Goa region of India. \n",
            photoRes = R.drawable.taco_3),
        Recipe(
            name = "Choco Taco",
            recipe = "Choco Taco\n" +
                "==============\n" +
                "\n" +
                "A dessert taco, the [Choco Taco](http://en.wikipedia.org/wiki/Choco_Taco) is more easily purchased than made, but if you're up to it a homemade Choco Taco is pretty fantastic.\n" +
                "\n" +
                "## Waffle Taco Shell\n" +
                "\n" +
                "### Ingredients\n" +
                "\n" +
                "* 1 pack frozen waffles, thawed\n" +
                "\n" +
                "### Directions\n" +
                "\n" +
                "* Heat your oven to 350 degrees.\n" +
                "* Using a rolling pin (or more likely, if you're really trying this, a wine bottle), flatten each waffle as much as you can. You may want to do this over wax paper or some other non-stick surface.\n" +
                "* Drape the waffles over something long and thin (and oven-safe) and bake them until they are firm (5-10 minutes).\n" +
                "\n" +
                "These waffle taco shells would be good for breakfast tacos, but are better for ice cream and related toppings.\n" +
                "\n" +
                "tags: vegetarian",
            photoRes = R.drawable.taco_4),
        Recipe(
            name = "Drunk Nachos",
            recipe = "Drunk Nachos\n" +
                "=================\n" +
                "\n" +
                "For those shameful late-night moments after da club when all you need are cheese and chips.\n" +
                "\n" +
                "### Ingredients\n" +
                "\n" +
                "* One bag of tortilla chips\n" +
                "* A handful (or two... or three..) of [cheese](../mixins/cheese_traditional_us.md)\n" +
                "* Any random stuff you have lying around you think would taste good delivered atop a bed of cheese and chips. Any leftover [mixins](../mixins) or [condiments](../condiments) you have laying around from a proper taco dinner would be BOMB.\n" +
                "\n" +
                "### Directions\n" +
                "\n" +
                "* Spread a single layer of chips on top of a microwave safe plate.\n" +
                "* Throw that cheese on top. Try to distribute it evenly.\n" +
                "* Nuke the whole plate in the microwave for 1 minute on high power. Don't even think about using the oven or broiler for this. You're drunk.\n" +
                "* Pull the delicious cheesy mess out of the microwave oven. Top with whatever you found scrounging around in your fridge or leave as is.\n" +
                "* STUFF YOUR FACE!\n" +
                "\n" +
                "tags: vegetarian",
            baseLayer = cheese,
            photoRes = R.drawable.taco_5),
        Recipe(
            name = "Pickle Pita Taco (not really a taco)",
            recipe = "# Pickle Pita Taco (not really a taco)\n" +
                "\n" +
                "A sort of taco for when you're hungry, but not super coordinated.\n" +
                "\n" +
                "## Ingredients\n" +
                "\n" +
                "1. An unopened pita\n" +
                "2. A pickle, preferably whole, but really - any pickle will do.\n" +
                "3. A slice of cheese\n" +
                "\n" +
                "## What to do\n" +
                "\n" +
                "1. Put the slice of cheese on the pita. On top, don't open the pita. Pretend it's like flatbread or a Chalupa.\n" +
                "2. Put that in the microwave for 5-15 seconds depending on how powerful your microwave is and how melty you like your cheese.\n" +
                "3. Put the pickle in the middle of the melty cheese.\n" +
                "4. Fold the warm melty pita bread over the pickle. Eat like a taco.\n" +
                "\n" +
                "## Testimonies\n" +
                "\n" +
                "> I have had literally hundreds of these, they are really good. -[@cmcavoy](https://twitter.com/cmcavoy)\n" +
                "\n" +
                "## FAQ\n" +
                "\n" +
                "> Could you make this into a taco by replacing the pita with a corn tortilla?\n" +
                "\n" +
                "Yes, you could, but it would be less delicious.\n" +
                "\n" +
                "tags: vegetarian",
            photoRes = R.drawable.taco_1),
        Recipe(
            name = "Taco Burger",
            recipe = "Taco Burger\n" +
                "==============\n" +
                "\n" +
                "A one-time Taco Bell classic (think late '70s-early-'80s era, if you can), the taco burger is now all but extinct.\n" +
                "\n" +
                "## Ingredients\n" +
                "\n" +
                "* Hamburger Buns\n" +
                "* [Traditional Ground Beef](../base_layers/ground_beef_traditional_us.md) (or perhaps the [Overly Seasoned Ground Beef](../base_layers/overlyseasonedgroundbeef.md))\n" +
                "* [Cheese](../mixins/cheese_traditional_us.md)\n" +
                "* [Lettuce](../mixins/lettuce_traditional_us.md)\n" +
                "* [Tomatoes](../mixins/tomatoes_traditional_us.md)\n" +
                "* Hot Sauce\n" +
                "\n" +
                "You should, of course, feel free to fancy your burgers up any way you wish, but " +
                "every now and then a low-rent meal goes a long way.",
            baseLayer = groundBeef + "\n" +
                "Overly Seasoned Ground Beef\n" +
                "===========================\n" +
                "\n" +
                "I enjoy tripling (or more) the generic store bought taco seasoning when rendering my ground beef.\n" +
                "\n" +
                "I've found that while with most cooking, you can in fact over season pretty easily, that's not the case with taco ground beef.\n" +
                "\n" +
                "I will aggressively season the beef, even adding additional cumin and garlic.\n" +
                "\n" +
                "This basically seasons the entire taco, so you can spend less time prepping all " +
                "of the toppings.",
            condiment = cheese + "\n" + lettuce + "\n" + tomatoes,
            photoRes = R.drawable.taco_2),
        Recipe(
            name = "Taco Mac N Cheese",
            recipe = "Taco Mac N Cheese\n" +
                "==============\n" +
                "\n" +
                "A dish that brings together two glorious junk foods for optimal happiness of the consumer.\n" +
                "\n" +
                "## Ingredients\n" +
                "\n" +
                "* Mac n Cheese, prepared according to instructions on box\n" +
                "* [Traditional Ground Beef](../base_layers/ground_beef_traditional_us.md)\n" +
                "*[Sour Cream](../condiments/sour_cream.md)\n" +
                "* [Tomatoes](../mixins/tomatoes_traditional_us.md)\n" +
                "* [Jalapeños](../mixins/jalapenos.md)\n" +
                "* [Cilantro](../mixins/cilantro.md)\n" +
                "\n" +
                "Divide the cooked Mac n Cheese up into several bowls. Top each serving with the " +
                "ground beef, sour cream, tomatoes, jalapeños, and cilantro. Delish. Feel free to get extra fancy and add extra taco toppings that you enjoy.",
            baseLayer = groundBeef,
            condiment = sourCream + "\n" + tomatoes + "\n" +
                "Jalapeños\n" +
                "==========\n" +
                "\n" +
                "What are tacos without a bit of spice? These deliciously fiery peppers have earned their spot as a staple in Mexican food preparations. Chances are, they'll make a great addition to your taco recipe.\n" +
                "\n" +
                "* Jalapeños (sliced)\n" +
                "\n" +
                "tags: vegetarian\n" +
                "Cilantro\n" +
                "==========\n" +
                "\n" +
                "Sometimes when you're eating a taco, you think to yourself \"this is missing something, and I can't figure out what it is.\" I'm willing to bet that something is cilantro. This subtle yet oh so important flavor enhancer will take your tacos to the next level.\n" +
                "\n" +
                "* Cilantro (chopped)\n" +
                "\n" +
                "tags: vegetarian\n",
            photoRes = R.drawable.taco_3),
        Recipe(
            name = "Taco Soup",
            recipe = "Taco Soup\n" +
                "===================\n" +
                "Approximately 12 servings\n" +
                "\n" +
                "* 2 pounds ground beef\n" +
                "* 2 cup diced onions\n" +
                "* 2 (14 1/2-ounce) cans Mexican-style stewed tomatoes\n" +
                "* 1 (14 1/2-ounce) can diced tomatoes\n" +
                "* 1 (15 1/4-ounce) can whole kernel corn, drained\n" +
                "* 2 (15 1/2-ounce) cans pinto beans\n" +
                "* 1 (15 1/2-ounce) can kidney beans\n" +
                "* 2 (4 1/2-ounce) cans diced green chiles\n" +
                "* 1 (4.6-ounce) can black olives, drained & sliced\n" +
                "* 1 (1 1/4-ounce) package taco seasoning mix\n" +
                "* 1 (1-ounce) package ranch salad dressing mix\n" +
                "* Sour cream\n" +
                "* Grated cheese\n" +
                "* Corn chips\n" +
                "\n" +
                "1. Brown ground beef and onions, and drain fat\n" +
                "2. Combine gound beef, onions and other ingredients (except sour cream, grated cheese and corn chips) in slow cooker\n" +
                "3. Cook for 6-8 hours \n" +
                "4. Serve with sour cream, grated cheese and corn chips",
            photoRes = R.drawable.taco_4)
    )
  }
}