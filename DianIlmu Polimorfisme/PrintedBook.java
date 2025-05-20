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

    // Mengatur informasi lengkap buku cetak termasuk jumlah halaman
    public void setPrintedBookInfo(String title, String author, double price, int stock, int pages) {
        setBookInfo(title, author, price, stock); // panggil method superclass
        this.pages = pages;
    }

    // Overloading method untuk hanya mengatur jumlah halaman
    public void setPrintedBookInfo(int pages) {
        this.pages = pages;
    }

    // Getter dan Setter jumlah halaman
    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    // Override method abstrak dari Book untuk menampilkan informasi buku cetak
    @Override
    public void displayBook() {
        System.out.println("Judul  : " + getTitle());
        System.out.println("Penulis: " + getAuthor());
        System.out.println("Harga  : Rp" + getPrice());
        System.out.println("Stok   : " + getStock());
        System.out.println("Jumlah Halaman: " + pages);
    }
}



