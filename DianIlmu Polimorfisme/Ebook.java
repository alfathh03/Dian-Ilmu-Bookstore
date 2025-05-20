/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dianilmu11;

/**
 *
 * @author ACER
 */



// Subclass dari Book - mewakili buku elektronik
public class Ebook extends Book {
    private double fileSize; // ukuran file dalam MB

    // Mengatur informasi lengkap ebook termasuk ukuran file
    public void setEbookInfo(String title, String author, double price, int stock, double fileSize) {
        setBookInfo(title, author, price, stock); // panggil method superclass
        this.fileSize = fileSize;
    }

    // Overloading method untuk hanya mengatur ukuran file
    public void setEbookInfo(double fileSize) {
        this.fileSize = fileSize;
    }

    // Getter dan Setter ukuran file
    public double getFileSize() {
        return fileSize;
    }

    public void setFileSize(double fileSize) {
        this.fileSize = fileSize;
    }

    // Override method abstrak dari Book untuk menampilkan informasi ebook
    @Override
    public void displayBook() {
        System.out.println("Judul  : " + getTitle());
        System.out.println("Penulis: " + getAuthor());
        System.out.println("Harga  : Rp" + getPrice());
        System.out.println("Stok   : " + getStock());
        System.out.println("Ukuran File: " + fileSize + " MB");
    }
}




