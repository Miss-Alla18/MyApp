package com.mirea.kornelyuk.galperina.myapp.viewmodel

import android.util.Log
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject
import com.mirea.kornelyuk.galperina.myapp.api.IKosherServerService
import androidx.lifecycle.ViewModel
import androidx.lifecycle.LiveData
import androidx.lifecycle.liveData
import com.mirea.kornelyuk.galperina.myapp.dto.RecipeDto
import com.mirea.kornelyuk.galperina.myapp.model.Recipe

@HiltViewModel
class RecipeViewModel @Inject constructor(
        private val iKosherServerService: IKosherServerService
) : ViewModel() {
    fun getRecipe(recipeId: Int): LiveData<Recipe?> {
        return liveData {
            val response: RecipeDto
            try {
                response = iKosherServerService.getRecipe(recipeId)
            } catch (e: Exception) {
                Log.e("RecipeViewModel", "Ошибка во время запроса рецепта с ID=$recipeId")
                emit(null)
                return@liveData
            }
            val recipe = Recipe()
            recipe.id = response.id
            recipe.title = response.name
            recipe.lvl = response.level.russianName
//            recipe.category = response.category.russianCategory
            recipe.date = response.cooking_time
            recipe.text = response.description
            emit(recipe)
        }
    }
}