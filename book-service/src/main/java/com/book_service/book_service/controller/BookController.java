package com.book_service.book_service.controller;

import com.book_service.book_service.dto.BookDTO;
import com.book_service.book_service.service.BaseService;
import com.book_service.book_service.service.BaseServiceImpl;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/book")
public class BookController {

    private BaseService baseService;

    @Autowired
    public BookController(BaseService baseService) {
        this.baseService = baseService;
    }

    @PostMapping
    public ResponseEntity<BookDTO> createBook(@RequestBody BookDTO bookDTO) {
        BookDTO savedBook = baseService.createBook(bookDTO);
        return new ResponseEntity<>(savedBook, HttpStatus.CREATED);
    }

}
