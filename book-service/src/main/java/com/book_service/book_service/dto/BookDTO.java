package com.book_service.book_service.dto;

import lombok.Data;

@Data
public class BookDTO {
    private int id;
    private String title;
    private String author;
    private String isbn;
    private double price;
}
