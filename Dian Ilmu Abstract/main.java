/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dianilmu11;

/**
 *
 * @author User
 */


///**
// * Kelas utama untuk menjalankan program dan menguji class Ebook & PrintedBook
// */
public class main {
    public static void main(String[] args) {
        // Membuat objek Ebook dan menyimpan sebagai tipe Book (demonstrasi polimorfisme)
        Book ebook = new Ebook();

        // Mengatur informasi ebook menggunakan method yang telah dioverload
        ((Ebook) ebook).setEbookInfo("Belajar Java", "Adit", 50000, 100, 2.5);

        // Menampilkan informasi ebook (akan memanggil versi override di Ebook)
        ebook.displayBook();

        System.out.println(); // pemisah output

        // Membuat objek PrintedBook dan menyimpan sebagai tipe Book (demonstrasi polimorfisme)
        Book pb = new PrintedBook();

        // Mengatur informasi buku cetak
        ((PrintedBook) pb).setPrintedBookInfo("Pemrograman OOP", "Budi", 75000, 50, 300);

        // Menampilkan informasi buku cetak
        pb.displayBook();
    }
}



