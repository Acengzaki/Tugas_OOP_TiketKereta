public abstract class Tiket {
    // Encapsulation: Field dibuat private
    private String namaKereta;
    private double hargaDasar;

    public Tiket(String namaKereta, double hargaDasar) {
        this.namaKereta = namaKereta;
        this.hargaDasar = hargaDasar;
    }

    // Getter untuk mengambil data (Encapsulation)
    public String getNamaKereta() { return namaKereta; }
    public double getHargaDasar() { return hargaDasar; }

    // Abstraction: Fungsi ini wajib ada di tiap jenis tiket, 
    // tapi cara hitungnya beda-beda
    public abstract double hitungTotalHarga();
}