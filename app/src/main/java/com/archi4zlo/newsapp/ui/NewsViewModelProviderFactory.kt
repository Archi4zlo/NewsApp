package com.archi4zlo.newsapp.ui
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.archi4zlo.newsapp.repository.NewsRepository

class NewsViewModelProviderFactory(
    val newsRepository: NewsRepository
) : ViewModelProvider.Factory {

    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        return NewsViewModel(newsRepository) as T
    }
}