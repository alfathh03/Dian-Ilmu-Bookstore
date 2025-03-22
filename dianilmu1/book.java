package BAB1prak;

import java.util.Scanner;

class book {
    private String title;
    private String author;
    private int price;
    private int stock;

    // Method untuk menetapkan informasi buku
    public void setbookInfo(String title, String author, int price, int stock) {
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
    public boolean buybook(int quantity) {
        if (quantity <= stock) {
            stock -= quantity;
            return true;
        } else {
            return false;
        }
    }
}


