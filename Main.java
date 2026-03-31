public class Main {
    public static void main(String[] args) {
        // Membuat objek dari TiketEksekutif
        Tiket tix = new TiketEksekutif("Argo Bromo", 400000);

        System.out.println("Kereta: " + tix.getNamaKereta());
        System.out.println("Total Bayar: Rp" + tix.hitungTotalHarga());
    }
}