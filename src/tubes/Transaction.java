/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tubes;

import java.util.Date;

/**
 *
 * @author 7
 */
public class Transaction extends Book {

    private double price, discount, sum;
    private Date date;

    public Transaction(double price, double discount, double sum, String title, String category, int stock, double harga) {
        super(title, category, stock, harga);
        this.price = price;
        this.discount = discount;
        this.sum = sum;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getDiscount() {
        return discount;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public double getSum(double sum) {
        if (getStock() == 0) {
            throw new IllegalArgumentException("Stock kosong");
        } else {
            sum = getHarga() * getStock();
        }
        return sum;
    }
}
