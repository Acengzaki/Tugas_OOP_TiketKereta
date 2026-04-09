import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DaftarKereta repoKereta = new DaftarKereta();

        repoKereta.tampilkanDaftar();

        System.out.print("Pilih nomor kereta (1-3): ");
        int pilihan = scanner.nextInt();

        
        Tiket tix = repoKereta.pilihKereta(pilihan);

        if (tix != null) {
            System.out.println("\n--- STRUK PEMBAYARAN TIKET ---");
            System.out.println("Nama Kereta : " + tix.getNamaKereta());
            System.out.printf("Total Bayar : Rp%,.0f%n", tix.hitungTotalHarga());
            System.out.println("-------------------------------");
            System.out.println("Status      : LUNAS");
        } else {
            System.out.println("\n[!] Error: Pilihan nomor " + pilihan + " tidak tersedia.");
        }

        scanner.close();
    }
}