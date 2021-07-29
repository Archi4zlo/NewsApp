package com.archi4zlo.newsapp.repository

import com.archi4zlo.newsapp.api.RetrofitInstance
import com.archi4zlo.newsapp.db.ArticleDatabase
import com.archi4zlo.newsapp.models.Article


class NewsRepository(
    val db: ArticleDatabase
) {
    suspend fun getBreakingNews(countryCode: String, pageNumber: Int) =
        RetrofitInstance.api.getBreakingNews(countryCode, pageNumber)

    suspend fun searchNews(searchQuery: String,pageNumber: Int) =
        RetrofitInstance.api.searchForNews(searchQuery,pageNumber)

    suspend fun upsert(article: Article) = db.getArticleDao().upsert(article)

    fun getSavedNews() = db.getArticleDao().getAllArticles()

    suspend fun deleteArticles(article: Article) = db.getArticleDao().deleteArticle(article)
}