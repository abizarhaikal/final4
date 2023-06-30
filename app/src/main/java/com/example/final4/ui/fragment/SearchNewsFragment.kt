package com.example.final4.ui.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModel
import com.example.final4.R
import com.example.final4.ui.NewsActivity

class SearchNewsFragment : Fragment(R.layout.fragment_search_news) {

    lateinit var viewModel: ViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        viewModel = (activity as NewsActivity).viewModel
    }
}