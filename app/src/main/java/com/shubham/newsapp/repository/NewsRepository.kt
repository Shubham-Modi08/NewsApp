package com.shubham.newsapp.repository

import com.shubham.newsapp.api.RetrofitInstance
import com.shubham.newsapp.database.ArticleDatabase
import com.shubham.newsapp.models.Article


class NewsRepository(
    val db: ArticleDatabase //parameter
) {


    suspend fun getBreakingNews() =
        RetrofitInstance.api.getBreakingNews()


    suspend fun searchNews(searchQuery: String) =
        RetrofitInstance.api.searchForNews(searchQuery)


    suspend fun insert(article: Article) =
        db.getArticleDao().insert(article)


    fun getSavedNews() =
        db.getArticleDao().getAllArticles()


    suspend fun deleteArticle(article: Article) =
        db.getArticleDao().deleteArticle(article)
}