/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package tubes;

/**
 *
 * @author 7
 */
public class Book {
    private String title , author, publisher, category;
    private double harga;
    private int stock;
    private final int nbuku=0;
    
    public Book(String title, String category, int stock, double harga){
        this.title=title;
        this.category=category;
        this.stock=stock;
        this.harga=harga;
    }

    public double getHarga() {
        return harga;
    }

    public void setHarga(double harga) {
        this.harga = harga;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }
    public void searchBook(Book b){
        if(getTitle() == null){
            throw new IllegalArgumentException("Buku tidak ditemukan");
        }
        
    
    }
    
    
}
