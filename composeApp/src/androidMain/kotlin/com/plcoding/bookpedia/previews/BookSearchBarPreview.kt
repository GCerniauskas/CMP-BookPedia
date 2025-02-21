package com.plcoding.bookpedia.previews

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import com.plcoding.bookpedia.feature.book.domain.Book
import com.plcoding.bookpedia.feature.book.presentation.BookListScreen
import com.plcoding.bookpedia.feature.book.presentation.BookListScreenRoot
import com.plcoding.bookpedia.feature.book.presentation.BookListState
import com.plcoding.bookpedia.feature.book.presentation.components.BookSearchBar

@Preview
@Composable
private fun BookSearchBarPreview() {
    Box(
        modifier = Modifier
            .fillMaxWidth()
            .background(Color.White)
    ) {
        BookSearchBar(
            searchQuery = "",
            onSearchQueryChange = {},
            onImeSearch = {},
            modifier = Modifier
                .fillMaxWidth()
        )
    }
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