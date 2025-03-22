/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BAB1prak;

/**
 *
 * @author User
 */
import java.util.Scanner;

    public class Class {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Membuat objek Book dan menetapkan data awal
        book myBook = new book();
        myBook.setbookInfo("Ayat Cinta", "Alfath Nafis", 150000, 10);

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

                    if (myBook.buybook(quantity)) {
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

