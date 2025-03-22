package dianilmubookstore;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author User
 */

// Mengimpor kelas Scanner untuk menerima input dari pengguna
import java.util.Scanner;

class Book {
    private String title;
    private String author;
    private int price;
    private int stock;

    // Constructor
    public Book(String title, String author, int price, int stock) {
        this.title = title;
        this.author = author;
        this.price = price;
        this.stock = stock;
    }

    // Method untuk menampilkan informasi buku
    public void displayBook() {
        System.out.println("\nInformasi Buku:");
        System.out.println("Judul: " + title);
        System.out.println("Penulis: " + author);
        System.out.println("Harga: " + price);
        System.out.println("Stok: " + stock);
    }

    // Method untuk membeli buku
    public boolean buyBook(int quantity) {
        if (quantity <= stock) {
            stock -= quantity;
            return true;
        } else {
            return false;
        }
    }
}

public class DianIlmuBookstore {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Membuat objek Book dengan data awal
        Book myBook = new Book("Ayat Cinta", "Alfath Nafis", 150000, 10);

        while (true) {
            System.out.println("\n=== Dian Ilmu Bookstore ===");
            System.out.println("1. Lihat Buku");
            System.out.println("2. Beli Buku");
            System.out.println("3. Keluar");
            System.out.print("Pilih menu: ");
            
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    myBook.displayBook();
                    break;
                case 2:
                    System.out.print("Masukkan jumlah buku yang ingin dibeli: ");
                    int quantity = scanner.nextInt();

                    if (myBook.buyBook(quantity)) {
                        System.out.println("Pembelian berhasil!");
                    } else {
                        System.out.println("Stok tidak mencukupi.");
                    }
                    break;
                case 3:
                    System.out.println("Terima kasih telah berbelanja di Dian Ilmu Bookstore!");
                    scanner.close();
                    return;
                default:
                    System.out.println("Pilihan tidak valid.");
            }
        }
    }
}

