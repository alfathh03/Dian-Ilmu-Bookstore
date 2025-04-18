/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dianilmu11;

/**
 *
 * @author ACER
 */
public class Book {
    private String title;
    private String author;
    private double price;
    private int stock;

    // Setter
    public void setBookInfo(String title, String author, double price, int stock) {
        this.title = title;
        this.author = author;
        this.price = price;
        this.stock = stock;
    }

    // Getter
    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public double getPrice() {
        return price;
    }

    public int getStock() {
        return stock;
    }

    // Untuk update stok
    public void setStock(int stock) {
        this.stock = stock;
    }

    public void displayBook() {
        System.out.println("Judul  : " + title);
        System.out.println("Penulis: " + author);
        System.out.println("Harga  : Rp" + price);
        System.out.println("Stok   : " + stock);
    }

    public boolean buyBook(int quantity) {
        if (quantity <= stock) {
            stock -= quantity;
            return true;
        }
        return false;
    }
}
