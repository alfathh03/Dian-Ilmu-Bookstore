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
// * Kelas turunan dari Book yang merepresentasikan buku fisik (cetak).
// */
public class PrintedBook extends Book {
    // Atribut khusus buku cetak
    private int pages;

//    /**
//     * Mengatur semua informasi buku cetak termasuk jumlah halaman.
//     */
    public void setPrintedBookInfo(String title, String author, double price, int stock, int pages) {
        setBookInfo(title, author, price, stock); // panggil method dari superclass
        this.pages = pages;
    }

//    /**
//     * Overloading: hanya set jumlah halaman.
//     */
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

//    /**
//     * Override dari method abstrak displayBook().
//     * Menampilkan informasi buku cetak secara lengkap.
//     */
    @Override
    public void displayBook() {
        System.out.println("Judul  : " + getTitle());
        System.out.println("Penulis: " + getAuthor());
        System.out.println("Harga  : Rp" + getPrice());
        System.out.println("Stok   : " + getStock());
        System.out.println("Jumlah Halaman: " + pages);
    }
}


