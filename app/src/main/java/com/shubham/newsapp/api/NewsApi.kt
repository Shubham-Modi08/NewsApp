package com.shubham.newsapp.api

import com.shubham.newsapp.models.NewsResponse
import com.shubham.newsapp.utils.Constants.Companion.API_KEY
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query

interface NewsApi {

    @GET("v4/top-headlines")

    suspend fun getBreakingNews(

        @Query("token")
        apiKey: String = API_KEY

    ): Response<NewsResponse>


    @GET("v4/search")

    suspend fun searchForNews(
        @Query("q")
        searchQuery: String,

        @Query("token")
        apiKey: String = API_KEY
    ): Response<NewsResponse>
}