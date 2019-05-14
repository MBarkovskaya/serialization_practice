package com.training.marshaling.jaxb;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import java.util.List;

@XmlRootElement(name = "bookJAXB")
public class BookJAXB extends StuffJAXB{

    public BookJAXB(Long id, String title, int numberOfPages, int yearOfEdition, double cost) {
        super(id);
        this.title = title;
        this.numberOfPages = numberOfPages;
        this.yearOfEdition = yearOfEdition;
        this.cost = cost;
    }

    private String title;
    private List<AuthorAndGenreJAXB> authors;
    private int numberOfPages;
    private int yearOfEdition;
    private double cost;

    public BookJAXB() {
    }

    public String getTitle() {
        return title;
    }
    @XmlAttribute
    public void setTitle(String title) {
        this.title = title;
    }

    public AuthorAndGenreJAXB getAuthorAndGenreJAXB() {
        return authorAndGenreJAXB;
    }

    @XmlElement
    public void setAuthorAndGenreJAXB(AuthorAndGenreJAXB authorAndGenreJAXB) {
        this.authorAndGenreJAXB = authorAndGenreJAXB;
    }

    private AuthorAndGenreJAXB authorAndGenreJAXB;

    public List<AuthorAndGenreJAXB> getAuthors() {
        return authors;
    }

    public void setAuthors(List<AuthorAndGenreJAXB> authors) {
        this.authors = authors;
    }

    public int getNumberOfPages() {
        return numberOfPages;
    }
    @XmlAttribute
    public void setNumberOfPages(int numberOfPages) {
        this.numberOfPages = numberOfPages;
    }

    public int getYearOfEdition() {
        return yearOfEdition;
    }
    @XmlAttribute
    public void setYearOfEdition(int yearOfEdition) {
        this.yearOfEdition = yearOfEdition;
    }

    public double getCost() {
        return cost;
    }
    @XmlAttribute
    public void setCost(double cost) {
        this.cost = cost;
    }

    @Override
    public String toString() {
        return "BookJAXB{" +
                "title='" + title + '\'' +
                ", authors=" + authors +
                ", numberOfPages=" + numberOfPages +
                ", yearOfEdition=" + yearOfEdition +
                ", cost=" + cost +
                '}';
    }
}