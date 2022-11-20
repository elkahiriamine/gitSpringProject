package com.example.gitspringproject.repository;

import com.example.gitspringproject.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book, Long> {
}
