package com.example.gitspringproject.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.List;

@Table(name = "Author")
@Entity
@Data
@NoArgsConstructor
@ToString
public class Author {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private int age;
    private String tel;
    @ManyToMany(mappedBy = "authors")
    private List<Book> books;
}
