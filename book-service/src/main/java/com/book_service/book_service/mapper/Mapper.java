package com.book_service.book_service.mapper;

import com.book_service.book_service.dto.BookDTO;
import com.book_service.book_service.entity.Book;
import com.book_service.book_service.utils.Utils;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.BeanUtils;

import java.util.Objects;

@RequiredArgsConstructor
public class Mapper {
    public static Book bookDtoToEntity(BookDTO bookDTO) {
        if (Utils.hasNullProperties(bookDTO))
            throw new RuntimeException("Book DTO or its properties cannot be null");

        Book toSaved = new Book();
        BeanUtils.copyProperties(bookDTO, toSaved);
        return toSaved;
    }

    public static BookDTO entityToDto(Book book) {
        BookDTO bookDTO = new BookDTO();
        BeanUtils.copyProperties(book, bookDTO);
        return bookDTO;
    }
}
