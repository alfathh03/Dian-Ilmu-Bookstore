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
// * Kelas abstrak Book sebagai blueprint umum untuk semua jenis buku.
// * Tidak dapat diinstansiasi langsung, hanya dapat diturunkan.
// */
// Kelas abstrak Book - menjadi superclass untuk semua jenis buku
public abstract class Book implements Displayable {
 private String title;
    private String author;
    private double price;
    private int stock;

    /** 
     * Set judul dan penulis saja (tanpa validasi harga/stok). 
     */
    public void setBookInfo(String title, String author) {
        this.title = title;
        this.author = author;
    }

    /**
     * Set informasi lengkap buku. 
     * @throws IllegalArgumentException jika price atau stock negatif.
     */
    public void setBookInfo(String title, String author, double price, int stock) {
        if (price < 0) {
            throw new IllegalArgumentException("Harga tidak boleh negatif.");
        }
        if (stock < 0) {
            throw new IllegalArgumentException("Stok tidak boleh negatif.");
        }
        this.title = title;
        this.author = author;
        this.price = price;
        this.stock = stock;
    }

    /**
     * Set informasi buku tanpa stok.
     * @throws IllegalArgumentException jika price negatif.
     */
    public void setBookInfo(String title, String author, double price) {
        if (price < 0) {
            throw new IllegalArgumentException("Harga tidak boleh negatif.");
        }
        this.title = title;
        this.author = author;
        this.price = price;
    }

    // Getter
    public String getTitle()   { return title; }
    public String getAuthor()  { return author; }
    public double getPrice()   { return price; }
    public int getStock()      { return stock; }

    /**
     * Set stok buku.
     * @throws IllegalArgumentException jika stok negatif.
     */
    public void setStock(int stock) {
        if (stock < 0) {
            throw new IllegalArgumentException("Stok tidak boleh negatif.");
        }
        this.stock = stock;
    }

    /** 
     * Abstract method—harus di-override di subclass untuk menampilkan detail buku.
     */
    public abstract void displayBook();

    /**
     * Proses pembelian buku.
     * @param quantity jumlah yang dibeli
     * @return true jika berhasil, false jika stok kurang
     * @throws IllegalArgumentException jika quantity negatif atau melebihi stok
     */
    public boolean buyBook(int quantity) {
        if (quantity < 0) {
            throw new IllegalArgumentException("Jumlah pembelian tidak boleh negatif.");
        }
        if (quantity > stock) {
            throw new IllegalArgumentException(
                "Jumlah pembelian (" + quantity + ") melebihi stok (" + stock + ")."
            );
        }
        // Jika valid, kurangi stok
        stock -= quantity;
        return true;
    }
}



