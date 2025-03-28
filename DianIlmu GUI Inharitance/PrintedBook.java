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
    private int pages;

    public void setPrintedBookInfo(String title, String author, double price, int stock, int pages) {
        setBookInfo(title, author, price, stock);
        this.pages = pages;
    }

    @Override
    public void displayBook() {
        super.displayBook();
        System.out.println("Jumlah Halaman: " + pages);
    }
}
