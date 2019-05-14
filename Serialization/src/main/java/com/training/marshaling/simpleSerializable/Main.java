package com.training.marshaling.simpleSerializable;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;


@Getter
@Setter
@ToString
@AllArgsConstructor
public class Main {

    public static void main(String[] args) throws IOException, ClassNotFoundException {

        Author author1 = new Author("Victor", "Pelevin", "fiction");
        Author author2 = new Author("Stiven", "King", "horror");

        System.out.println(author1);
        System.out.println(author2);

        Book book1 = new Book(1L, "Generation P", new ArrayList<>(Arrays.asList(author1)), 300, 2003, 450.00);
        Book book2 = new Book(2L, "Оно", new ArrayList<>(Arrays.asList(author2)), 500, 2014, 950.50);

        System.out.println(book1);
        System.out.println(book2);

        Reader reader = new Reader("Oleg", "Sergeenko", new ArrayList<>(Arrays.asList(book1, book2)));

        System.out.println(reader);

        try (ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream("test.bin")); ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream("test.bin"))) {
            outputStream.writeObject(reader);

            Reader readerNew = (Reader) inputStream.readObject();
            System.out.println(readerNew);
            System.out.println(reader == readerNew);
        }

    }
}

