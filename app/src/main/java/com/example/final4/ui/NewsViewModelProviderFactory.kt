package com.example.final4.ui

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.example.final4.repository.NewsRepository

class NewsViewModelProviderFactory(
    val app: NewsRepository
) : ViewModelProvider.Factory {

    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        val newsRepository = null
        return newsRepository?.let { NewsViewModel(app, it) } as T
    }
}