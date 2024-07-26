package com.book_service.book_service.service;

import com.book_service.book_service.dto.BookDTO;
import com.book_service.book_service.entity.Book;
import com.book_service.book_service.mapper.Mapper;
import com.book_service.book_service.repository.BookRepository;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BaseServiceImpl implements BaseService {

    private BookRepository bookRepository;

    @Autowired
    public BaseServiceImpl(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    @Override
    public BookDTO createBook(BookDTO bookDTO) {
        Book book = Mapper.bookDtoToEntity(bookDTO);
        book = bookRepository.save(book);
        bookDTO =Mapper.entityToDto(book);
        return bookDTO;
    }
}
