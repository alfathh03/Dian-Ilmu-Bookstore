/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dianilmu11;

/**
 *
 * @author ACER
 */
public class PrintedBook extends Book {
    // Atribut khusus buku cetak
    private int pages;

    // Method untuk set semua info buku cetak termasuk jumlah halaman
    public void setPrintedBookInfo(String title, String author, double price, int stock, int pages) {
        setBookInfo(title, author, price, stock); // panggil dari superclass
        this.pages = pages;
    }

    // Method Overloading - hanya set jumlah halaman
    public void setPrintedBookInfo(int pages) {
        this.pages = pages;
    }

    // Getter jumlah halaman
    public int getPages() {
        return pages;
    }

    // Setter jumlah halaman
    public void setPages(int pages) {
        this.pages = pages;
    }

    // Override method displayBook() dari Book
    @Override
    public void displayBook() {
        super.displayBook(); // tampilkan info dasar buku
        System.out.println("Jumlah Halaman: " + pages); // tambahan khusus buku cetak
    }
}

