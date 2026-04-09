import java.util.ArrayList;
import java.util.List;

public class DaftarKereta {
    private List<Tiket> listTiket;

    public DaftarKereta() {
        listTiket = new ArrayList<>();
        initData();
    }

    private void initData() {
        // Nama kereta diperbarui sesuai request
        listTiket.add(new TiketEksekutif("Garut Selatan", 500000));
        listTiket.add(new TiketEksekutif("Tasik Malaya", 200000));
        listTiket.add(new TiketEksekutif("Pameungpeuk Garut", 400000));
    }

    public void tampilkanDaftar() {
        System.out.println("===============================================");
        System.out.println("No   Nama Kereta           Harga Tiket");
        System.out.println("-----------------------------------------------");
        for (int i = 0; i < listTiket.size(); i++) {
            Tiket t = listTiket.get(i);
            // %-18s artinya teks rata kiri dengan lebar 18 karakter
            // %,.0f artinya angka dengan pemisah ribuan
            System.out.printf("%d.   %-20s  Rp%,.0f\n", (i + 1), t.getNamaKereta(), t.hitungTotalHarga());
        }
        System.out.println("===============================================");
    }

    public Tiket pilihKereta(int nomor) {
        if (nomor > 0 && nomor <= listTiket.size()) {
            return listTiket.get(nomor - 1);
        }
        return null;
    }
}