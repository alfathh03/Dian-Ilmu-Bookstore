/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dianilmu11;

/**
 *
 * @author ACER
 */


///**
// * Kelas abstrak Book sebagai blueprint umum untuk semua jenis buku.
// * Tidak dapat diinstansiasi langsung, hanya dapat diturunkan.
// */
// Kelas abstrak Book - menjadi superclass untuk semua jenis buku
public abstract class Book {
    // Atribut dasar buku
    private String title;
    private String author;
    private double price;
    private int stock;

    // Overloading method untuk mengatur informasi buku (judul dan penulis saja)
    public void setBookInfo(String title, String author) {
        this.title = title;
        this.author = author;
    }

    // Overloading method untuk mengatur informasi lengkap buku
    public void setBookInfo(String title, String author, double price, int stock) {
        this.title = title;
        this.author = author;
        this.price = price;
        this.stock = stock;
    }

    // Overloading method tanpa stok
    public void setBookInfo(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    // Getter untuk semua atribut
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

    // Setter untuk stok
    public void setStock(int stock) {
        this.stock = stock;
    }

    // Method abstrak yang wajib diimplementasikan oleh subclass
    public abstract void displayBook();

    // Method pembelian buku - mengurangi stok jika cukup
    public boolean buyBook(int quantity) {
        if (quantity <= stock) {
            stock -= quantity;
            return true;
        }
        return false;
    }
}



