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
// Kelas utama untuk menjalankan program dan mendemonstrasikan polimorfisme
public class main {
     public static void main(String[] args) {
        Book[] daftarBuku = new Book[2];

        // Inisialisasi Ebook dan PrintedBook
        daftarBuku[0] = new Ebook();
        daftarBuku[1] = new PrintedBook();

        try {
            // Set data dengan validasi
            ((Ebook) daftarBuku[0]).setEbookInfo("Ebook Java", "Dian", 45000, 8, 3.2);
            ((PrintedBook) daftarBuku[1]).setPrintedBookInfo("Algoritma Dasar", "Rudi", 60000, 3, 250);
        } catch (IllegalArgumentException ex) {
            System.err.println("Error saat inisialisasi buku: " + ex.getMessage());
            return;  // hentikan program jika data awal invalid
        }

        // Tampilkan informasi semua buku
        for (Book b : daftarBuku) {
            b.displayBook();
            System.out.println("-----------------------------");
        }

        // Demo pembelian dengan blok try-catch
        for (Book b : daftarBuku) {
            try {
                System.out.println("Mencoba membeli 2 eksemplar...");
                b.buyBook(2);
                System.out.println("Pembelian berhasil. Stok tersisa: " + b.getStock());
            } catch (IllegalArgumentException ex) {
                System.err.println("Gagal membeli: " + ex.getMessage());
            }
            System.out.println("-----------------------------");
        }
    }
}




