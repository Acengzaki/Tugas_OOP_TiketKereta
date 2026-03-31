public class TiketEksekutif extends Tiket implements LayananTambahan {
    
    public TiketEksekutif(String namaKereta, double hargaDasar) {
        super(namaKereta, hargaDasar); // Memanggil constructor milik parent
    }

    @Override
    public double hitungBiayaFasilitas() {
        return 50000; // Contoh: Harga selimut + makan
    }

    @Override
    public double hitungTotalHarga() {
        // Polymorphism: Logika hitung harga khusus eksekutif
        return getHargaDasar() + hitungBiayaFasilitas();
    }
}