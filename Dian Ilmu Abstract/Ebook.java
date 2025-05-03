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
// * Kelas turunan dari Book yang merepresentasikan buku dalam format digital (Ebook).
// */
public class Ebook extends Book {
    // Atribut khusus ebook
    private double fileSize; // dalam satuan MB

//    /**
//     * Mengatur semua informasi ebook termasuk ukuran file.
//     */
    public void setEbookInfo(String title, String author, double price, int stock, double fileSize) {
        setBookInfo(title, author, price, stock); // panggil method dari superclass
        this.fileSize = fileSize;
    }

//    /**
//     * Overloading: hanya set ukuran file.
//     */
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

//    /**
//     * Override dari method abstrak displayBook().
//     * Menampilkan informasi ebook secara lengkap.
//     */
    @Override
    public void displayBook() {
        System.out.println("Judul  : " + getTitle());
        System.out.println("Penulis: " + getAuthor());
        System.out.println("Harga  : Rp" + getPrice());
        System.out.println("Stok   : " + getStock());
        System.out.println("Ukuran File: " + fileSize + " MB");
    }
}



