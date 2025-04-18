/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dianilmu11;

/**
 *
 * @author ACER
 */
public class Ebook extends Book {
    // Atribut khusus ebook
    private double fileSize; // dalam MB

    // Method untuk set semua info ebook termasuk ukuran file
    public void setEbookInfo(String title, String author, double price, int stock, double fileSize) {
        setBookInfo(title, author, price, stock); // panggil dari superclass
        this.fileSize = fileSize;
    }

    // Method Overloading - hanya set ukuran file saja
    public void setEbookInfo(double fileSize) {
        this.fileSize = fileSize;
    }

    // Getter ukuran file
    public double getFileSize() {
        return fileSize;
    }

    // Setter ukuran file
    public void setFileSize(double fileSize) {
        this.fileSize = fileSize;
    }

    // Override method displayBook() dari Book
    @Override
    public void displayBook() {
        super.displayBook(); // tampilkan info dasar buku
        System.out.println("Ukuran File: " + fileSize + " MB"); // tambahan khusus ebook
    }
}


