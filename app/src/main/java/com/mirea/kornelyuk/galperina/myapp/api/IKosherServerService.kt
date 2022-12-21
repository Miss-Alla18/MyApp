package com.mirea.kornelyuk.galperina.myapp.api

import retrofit2.http.GET
import com.mirea.kornelyuk.galperina.myapp.dto.RecipeDto
import retrofit2.Call
import retrofit2.http.Path

interface IKosherServerService {
    @GET("/recipe")
    suspend fun recipes(): List<RecipeDto>

    // http://192.168.1.5:8080/recipe/id
    @GET("/recipe/{id}")
    suspend fun getRecipe(@Path("id") recipeId: Int): RecipeDto
}