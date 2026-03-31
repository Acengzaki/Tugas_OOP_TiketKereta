public class TiketEksekutif extends Tiket implements LayananTambahan {
    
    public TiketEksekutif(String namaKereta, double hargaDasar) {
        super(namaKereta, hargaDasar); 
    }

    @Override
    public double hitungBiayaFasilitas() {
        return 50000; 
    }

    @Override
    public double hitungTotalHarga() {
        
        return getHargaDasar() + hitungBiayaFasilitas();
    }
}