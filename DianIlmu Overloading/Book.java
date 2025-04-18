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
    // Atribut dasar buku
    private String title;
    private String author;
    private double price;
    private int stock;

    // Method Overloading - Versi 1 (judul & penulis saja)
    public void setBookInfo(String title, String author) {
        this.title = title;
        this.author = author;
    }

    // Method Overloading - Versi 2 (lengkap)
    public void setBookInfo(String title, String author, double price, int stock) {
        this.title = title;
        this.author = author;
        this.price = price;
        this.stock = stock;
    }

    // Method Overloading - Versi 3 (tanpa stok)
    public void setBookInfo(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    // Getter untuk atribut
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

    // Setter untuk stok (misalnya saat restok buku)
    public void setStock(int stock) {
        this.stock = stock;
    }

    // Menampilkan data buku
    public void displayBook() {
        System.out.println("Judul  : " + title);
        System.out.println("Penulis: " + author);
        System.out.println("Harga  : Rp" + price);
        System.out.println("Stok   : " + stock);
    }

    // Proses pembelian buku, kurangi stok jika cukup
    public boolean buyBook(int quantity) {
        if (quantity <= stock) {
            stock -= quantity;
            return true; // berhasil beli
        }
        return false; // stok kurang
    }
}
