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
        Ebook ebook = new Ebook();
        ebook.setEbookInfo("Belajar Java", "Adit", 50000, 100, 2.5);
        ebook.displayBook();

        System.out.println();

        PrintedBook pb = new PrintedBook();
        pb.setPrintedBookInfo("Pemrograman OOP", "Budi", 75000, 50, 300);
        pb.displayBook();
    }
}

