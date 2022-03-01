package com.shubham.newsapp.models

data class NewsResponse(
    val articles: MutableList<Article>,
    val totalArticles: Int
)