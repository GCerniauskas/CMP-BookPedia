package com.plcoding.bookpedia.book.book_list.data.mappers

import com.plcoding.bookpedia.book.book_list.data.dto.SearchedBookDto
import com.plcoding.bookpedia.book.book_list.domain.Book

fun SearchedBookDto.toBook(): Book {
    return Book(
        id = id.substringAfterLast("/"),
        title = title,
        imageUrl = if (coverKey != null) {
            "https://covers.openlibrary.org/b/olid/${coverKey}-L.jpg"
        } else {
            "https://covers.openlibrary.org/b/id/${coverAlternativeKey}-L.jpg"
        },
        authors = authorNames ?: emptyList(),
        description = null,
        languages = languages ?: emptyList(),
        firstPublishYear = firstPublishYear.toString(),
        averageRating = ratingsAverage,
        ratingsCount = ratingsCount,
        numPages = numberOfPagesMedian,
        numEditions = numEditions ?: 0
    )
}