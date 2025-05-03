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
public abstract class Book {
    // Atribut dasar buku
    private String title;
    private String author;
    private double price;
    private int stock;

    // Method Overloading - versi 1 (judul & penulis)
    public void setBookInfo(String title, String author) {
        this.title = title;
        this.author = author;
    }

    // Method Overloading - versi 2 (lengkap)
    public void setBookInfo(String title, String author, double price, int stock) {
        this.title = title;
        this.author = author;
        this.price = price;
        this.stock = stock;
    }

    // Method Overloading - versi 3 (tanpa stok)
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

    // Setter untuk stok buku
    public void setStock(int stock) {
        this.stock = stock;
    }

//    /**
//     * Method abstrak yang wajib diimplementasikan oleh subclass.
//     * Menampilkan data buku secara detail.
//     */
    public abstract void displayBook();

//    /**
//     * Method proses pembelian buku.
//     * Mengurangi stok jika jumlah mencukupi.
//     * @param quantity Jumlah buku yang ingin dibeli
//     * @return true jika berhasil dibeli, false jika stok tidak cukup
//     */
    public boolean buyBook(int quantity) {
        if (quantity <= stock) {
            stock -= quantity;
            return true;
        }
        return false;
    }
}


