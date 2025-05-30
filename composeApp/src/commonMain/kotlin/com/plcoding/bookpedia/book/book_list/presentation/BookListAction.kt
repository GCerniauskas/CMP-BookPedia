package com.plcoding.bookpedia.book.book_list.presentation

import com.plcoding.bookpedia.book.book_list.domain.Book

sealed interface BookListAction {
    data class OnSearchQueryChange(val query: String): BookListAction
    data class OnBookClick(val book: Book): BookListAction
    data class OnTabSelected(val index: Int): BookListAction
}