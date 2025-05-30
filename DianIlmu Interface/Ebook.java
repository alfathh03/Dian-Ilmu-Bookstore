/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dianilmu11;

/**
 *
 * @author ACER
 */



// Subclass dari Book - mewakili buku elektronik
public class Ebook extends Book {
   private double fileSize; // ukuran file dalam MB

    /**
     //*Set informasi lengkap ebook.
     //* @throws IllegalArgumentException jika fileSize negatif.
     */
    public void setEbookInfo(String title, String author, double price, int stock, double fileSize) {
        if (fileSize < 0) {
            throw new IllegalArgumentException("Ukuran file tidak boleh negatif.");
        }
        setBookInfo(title, author, price, stock);
        this.fileSize = fileSize;
    }

    /**
     * Overload hanya untuk set fileSize.
     * @throws IllegalArgumentException jika fileSize negatif.
     */
    public void setEbookInfo(double fileSize) {
        if (fileSize < 0) {
            throw new IllegalArgumentException("Ukuran file tidak boleh negatif.");
        }
        this.fileSize = fileSize;
    }

    // Getter & Setter fileSize
    public double getFileSize() {
        return fileSize;
    }
    public void setFileSize(double fileSize) {
        if (fileSize < 0) {
            throw new IllegalArgumentException("Ukuran file tidak boleh negatif.");
        }
        this.fileSize = fileSize;
    }

    /**
     * Implementasi displayBook() untuk ebook.
     */
    @Override
    public void displayBook() {
        System.out.println("===== Ebook =====");
        System.out.println("Judul       : " + getTitle());
        System.out.println("Penulis     : " + getAuthor());
        System.out.println("Harga       : Rp" + getPrice());
        System.out.println("Stok        : " + getStock());
        System.out.println("Ukuran File : " + fileSize + " MB");
    }
}




