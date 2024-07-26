package com.book_service.book_service.service;

import com.book_service.book_service.dto.BookDTO;

public interface BaseService {
    BookDTO createBook(BookDTO bookDTO);
}
