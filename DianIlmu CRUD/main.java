package dianilmu11;

/**
 * Kelas utama untuk menjalankan program dan mendemonstrasikan polimorfisme.
 * Menggunakan interface Displayable yang diimplementasi oleh kelas Book.
 */
public class main {
    public static void main(String[] args) {
        // Array dari tipe Book yang implement Displayable
        Book[] daftarBuku = new Book[2];

        // Inisialisasi objek Ebook dan PrintedBook
        daftarBuku[0] = new Ebook();
        daftarBuku[1] = new PrintedBook();

        try {
            // Set data dengan validasi
            ((Ebook) daftarBuku[0]).setEbookInfo("Ebook Java", "Dian", 45000, 8, 3.2);
            ((PrintedBook) daftarBuku[1]).setPrintedBookInfo("Algoritma Dasar", "Rudi", 60000, 3, 250);
        } catch (IllegalArgumentException ex) {
            System.err.println("Error saat inisialisasi buku: " + ex.getMessage());
            return; // hentikan program jika data tidak valid
        }

        // Tampilkan informasi semua buku (polimorfisme via Displayable)
        System.out.println("=== INFORMASI BUKU ===");
        for (Book buku : daftarBuku) {
            buku.displayBook(); // memanggil versi displayBook() yang sesuai subclass
            System.out.println("-----------------------------");
        }

        // Simulasi pembelian
        System.out.println("=== SIMULASI PEMBELIAN ===");
        for (Book buku : daftarBuku) {
            try {
                System.out.println("Mencoba membeli 2 eksemplar dari buku \"" + buku.getTitle() + "\"...");
                buku.buyBook(2);
                System.out.println("Pembelian berhasil. Sisa stok: " + buku.getStock());
            } catch (IllegalArgumentException ex) {
                System.err.println("Gagal membeli: " + ex.getMessage());
            }
            System.out.println("-----------------------------");
        }
    }
}
