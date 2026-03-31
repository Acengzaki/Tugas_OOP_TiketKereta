public abstract class Tiket {
    
    private String namaKereta;
    private double hargaDasar;

    public Tiket(String namaKereta, double hargaDasar) {
        this.namaKereta = namaKereta;
        this.hargaDasar = hargaDasar;
    }

    
    public String getNamaKereta() { return namaKereta; }
    public double getHargaDasar() { return hargaDasar; }

    
    public abstract double hitungTotalHarga();
}