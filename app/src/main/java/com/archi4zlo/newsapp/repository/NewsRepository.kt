package com.archi4zlo.newsapp.repository

import com.archi4zlo.newsapp.api.RetrofitInstance
import com.archi4zlo.newsapp.db.ArticleDatabase


class NewsRepository(
    val db: ArticleDatabase
) {
    suspend fun getBreakingNews(countryCode: String, pageNumber: Int) =
        RetrofitInstance.api.getBreakingNews(countryCode, pageNumber)
}