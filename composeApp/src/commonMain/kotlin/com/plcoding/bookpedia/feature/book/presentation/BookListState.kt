package com.plcoding.bookpedia.feature.book.presentation

import com.plcoding.bookpedia.core.presentation.UiText
import com.plcoding.bookpedia.feature.book.domain.Book

data class BookListState (
    val searchQuery: String = "Kotlin",
    val searchResults: List<Book> = emptyList(),
    val favoriteBooks: List<Book> = emptyList(),
    val isLoading: Boolean = false,
    val selectedIndex: Int = 0,
    val errorMessage: UiText? = null
)