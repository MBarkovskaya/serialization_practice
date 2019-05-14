package com.training.marshaling.simpleSerializable;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.List;

@Getter
@Setter
@ToString
public class Book extends Stuff {

    public Book(Long id, String title, List<Author> authors, int numberOfPages, int yearOfEdition, double cost) {
        super(id);
        this.title = title;
        this.authors = authors;
        this.numberOfPages = numberOfPages;
        this.yearOfEdition = yearOfEdition;
        this.cost = cost;
    }

    private String title;
    private List<Author> authors;
    private int numberOfPages;
    private int yearOfEdition;
    private double cost;
}
