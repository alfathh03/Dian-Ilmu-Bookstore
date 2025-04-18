/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dianilmu11;

/**
 *
 * @author User
 */
public class main {
    public static void main(String[] args) {
        // Membuat objek Ebook
        Ebook ebook = new Ebook();

        // Memanggil method overloaded: setEbookInfo(title, author, price, stock, fileSize)
        ebook.setEbookInfo("Belajar Java", "Adit", 50000, 100, 2.5);

        // Memanggil method displayBook() yang telah dioverride di class Ebook
        ebook.displayBook();

        System.out.println(); // pemisah output

        // Membuat objek PrintedBook
        PrintedBook pb = new PrintedBook();

        // Memanggil method overloaded: setPrintedBookInfo(title, author, price, stock, pages)
        pb.setPrintedBookInfo("Pemrograman OOP", "Budi", 75000, 50, 300);

        // Memanggil method displayBook() yang telah dioverride di class PrintedBook
        pb.displayBook();
    }
}

