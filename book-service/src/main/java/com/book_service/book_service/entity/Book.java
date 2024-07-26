package com.book_service.book_service.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String title;
    private String author;
    private String isbn;
    private double price;

//    {
//        "id": 1,
//            "title": "Effective Java",
//            "author": "Joshua Bloch",
//            "isbn": "978-0134685991",
//            "price": 45.00
//    }


}
