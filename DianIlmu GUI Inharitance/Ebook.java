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
    private double fileSize; // ukuran dalam MB

    public void setEbookInfo(String title, String author, double price, int stock, double fileSize) {
        setBookInfo(title, author, price, stock);
        this.fileSize = fileSize;
    }

    @Override
    public void displayBook() {
        super.displayBook();
        System.out.println("Ukuran File: " + fileSize + " MB");
    }

}
