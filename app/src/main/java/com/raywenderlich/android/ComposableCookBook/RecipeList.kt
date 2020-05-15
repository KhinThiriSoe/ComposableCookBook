package com.raywenderlich.android.ComposableCookBook

import androidx.compose.Composable
import androidx.ui.core.dp
import androidx.ui.foundation.VerticalScroller
import androidx.ui.layout.Column
import androidx.ui.layout.Padding
import androidx.ui.material.MaterialTheme
import androidx.ui.tooling.preview.Preview

@Composable
fun RecipeList(recipes: List<Recipe>) {
    // 1
    VerticalScroller {
        // 2
        Column {
            // 3
            for (recipe in recipes) {
                // 4
                Padding(16.dp) {
                    RecipeCard(recipe)
                }
            }
        }
    }
}

@Composable
@Preview
fun DefaultRecipeList() {
    MaterialTheme {
        RecipeList(defaultRecipes)
    }
}

