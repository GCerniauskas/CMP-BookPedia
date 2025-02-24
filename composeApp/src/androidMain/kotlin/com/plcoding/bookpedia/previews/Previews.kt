package com.plcoding.bookpedia.previews

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import com.plcoding.bookpedia.book.book_list.domain.Book
import com.plcoding.bookpedia.book.book_list.presentation.BookListScreen
import com.plcoding.bookpedia.book.book_list.presentation.BookListState
import com.plcoding.bookpedia.book.book_list.presentation.components.BookListSearchBar

@Preview
@Composable
private fun BookSearchBarPreview() {
    Box(
        modifier = Modifier
            .fillMaxWidth()
            .background(Color.White)
    ) {
        BookListSearchBar(
            searchQuery = "",
            onSearchQueryChange = {},
            onImeSearch = {},
            modifier = Modifier
                .fillMaxWidth()
        )
    }
}

@Preview
@Composable
private fun BookListScreenPreview() {
    BookListScreen(
        state = BookListState(
            searchResults = books
        ),
        onAction = {}
    )
    
}

private val books = (1..100).map {
    Book(
        id = "Book $it",
        title = "Book Title $it",
        imageUrl = "https://picsum.photos/200/300?random=$it",
        authors = listOf("Guilherme $it"),
        description = "Book Description $it",
        languages = emptyList(),
        firstPublishYear = null,
        averageRating = 4.54534,
        ratingsCount = 7,
        numPages = null,
        numEditions = 3,
    )
}