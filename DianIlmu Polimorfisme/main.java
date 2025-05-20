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
        // Array bertipe Book, berisi objek-objek dari subclass
        Book[] daftarBuku = new Book[2];

        // Objek pertama adalah Ebook
        daftarBuku[0] = new Ebook();
        ((Ebook) daftarBuku[0]).setEbookInfo("Ebook Java", "Dian", 45000, 8, 3.2);

        // Objek kedua adalah PrintedBook
        daftarBuku[1] = new PrintedBook();
        ((PrintedBook) daftarBuku[1]).setPrintedBookInfo("Algoritma Dasar", "Rudi", 60000, 3, 250);

        // Menampilkan informasi semua buku dengan metode polymorphic
        for (Book b : daftarBuku) {
            b.displayBook(); // Akan memanggil metode sesuai kelas aslinya
            System.out.println("-----------------------------");
        }

        // Melakukan pembelian buku dan menampilkan sisa stok
        for (Book b : daftarBuku) {
            System.out.println("Membeli 2 buku: " + (b.buyBook(2) ? "Berhasil" : "Gagal"));
            System.out.println("Stok tersisa : " + b.getStock());
            System.out.println("-----------------------------");
        }
    }
}




