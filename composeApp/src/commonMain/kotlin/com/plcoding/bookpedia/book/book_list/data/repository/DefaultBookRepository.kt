package com.plcoding.bookpedia.book.book_list.data.repository

import com.plcoding.bookpedia.book.book_list.data.mappers.toBook
import com.plcoding.bookpedia.book.book_list.data.network.RemoteBookDataSource
import com.plcoding.bookpedia.book.book_list.domain.Book
import com.plcoding.bookpedia.book.book_list.domain.BookRepository
import com.plcoding.bookpedia.core.domain.DataError
import com.plcoding.bookpedia.core.domain.Result
import com.plcoding.bookpedia.core.domain.map

class DefaultBookRepository(
    private val remoteBookDataSource: RemoteBookDataSource
): BookRepository {
    override suspend fun searchBooks(query: String): Result<List<Book>, DataError.Remote> {
        return remoteBookDataSource.searchBooks(query)
            .map { dto ->
                dto.results.map { it.toBook() }
            }
    }
}