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

// */
// Subclass dari Book - mewakili buku cetak
public class PrintedBook extends Book {
   private int pages; // jumlah halaman

    /**
     //* Set informasi lengkap buku cetak.
     //* @throws IllegalArgumentException jika pages negatif.
     */
    public void setPrintedBookInfo(String title, String author, double price, int stock, int pages) {
        // Validasi jumlah halaman
        if (pages < 0) {
            throw new IllegalArgumentException("Jumlah halaman tidak boleh negatif.");
        }
        setBookInfo(title, author, price, stock);
        this.pages = pages;
    }

    /**
    // * Overload hanya untuk set jumlah halaman.
     //* @throws IllegalArgumentException jika pages negatif.
     */
    public void setPrintedBookInfo(int pages) {
        if (pages < 0) {
            throw new IllegalArgumentException("Jumlah halaman tidak boleh negatif.");
        }
        this.pages = pages;
    }

    // Getter & Setter pages
    public int getPages() {
        return pages;
    }
    public void setPages(int pages) {
        if (pages < 0) {
            throw new IllegalArgumentException("Jumlah halaman tidak boleh negatif.");
        }
        this.pages = pages;
    }

    /**
     * Implementasi displayBook() untuk buku cetak.
     */
    @Override
    public void displayBook() {
        System.out.println("=== Printed Book ===");
        System.out.println("Judul           : " + getTitle());
        System.out.println("Penulis         : " + getAuthor());
        System.out.println("Harga           : Rp" + getPrice());
        System.out.println("Stok            : " + getStock());
        System.out.println("Jumlah Halaman  : " + pages);
    }
}



