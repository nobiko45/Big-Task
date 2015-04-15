/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tubes;

import java.io.FileNotFoundException;
import java.util.ArrayList;

/**
 *
 * @author 7
 */
public class Bookshelf {

    private ArrayList<Book> bookshelf = new ArrayList<Book>();
    private String namerak, name;
    private int number, maxBs = 15;
    private String row;

    public Bookshelf(int number, String row) {
        this.number = number;
        this.row = row;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public int getNumber() {
        return number;
    }

    public void setRow(String row) {

        this.row = row;
    }

    public String getRow() {
        return row;
    }

    public void viewBookshelf(String name, String row) throws FileNotFoundException {
        if (bookshelf.isEmpty()) {
            throw new FileNotFoundException(("Buku tidak ditemukan"));
        } else {
            bookshelf.indexOf(name);
        }
    }

    public void addBookshelf(Book b) {
        if (bookshelf.size() <= maxBs) {
            bookshelf.add(b);
        } else {
            throw new IllegalArgumentException("Rak Full");
        }
    }

    public Book search(String title) {
        for (Book b : bookshelf) {
            if (b.getTitle().equals(title)) {
                return b;
            }
        }
        return null;
    }
}
