package com.training.marshaling.simpleSerializable;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;

@Getter
@Setter
@AllArgsConstructor
@ToString
public class Author implements Serializable {

    private String firstName;
    private String lastName;
    private String genre;

//    public Author(String firstName, String lastName, String genre) {
//        this.firstName = firstName;
//        this.lastName = lastName;
//        this.genre = genre;
//    }
}
