package CM;
import java.util.Scanner;

public class Main_18 {

    static void tampilkanMenu() {
        System.out.println("==============================");
        System.out.println("SISTEM ANTRIAN ROYAL DELISH");
        System.out.println("==============================");
        System.out.println("1. Tambah Antrian");
        System.out.println("2. Cetak Antrian");
        System.out.println("3. Hapus Antrian dan Pesan");
        System.out.println("4. Laporan Pesanan");
        System.out.println("0. Keluar");
        System.out.print("Pilih menu : ");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        AntrianPembeli_18 antrian = new AntrianPembeli_18();
        DaftarPesenan_18 daftarPesanan = new DaftarPesenan_18();

        // Data awal via konstruktor (tanpa input keyboard, sesuai catatan jobsheet)
        antrian.tambahAntrian("Ainra", "08224500000");
        antrian.tambahAntrian("Danra", "08224511111");
        antrian.tambahAntrian("Sanri", "08224522222");

        int pilihan;
        do {
            tampilkanMenu();
            pilihan = sc.nextInt();
            sc.nextLine();

            switch (pilihan) {
                case 1:
                    System.out.print("Nama Pembeli : ");
                    String nama = sc.nextLine();
                    System.out.print("No HP        : ");
                    String noHp = sc.nextLine();
                    antrian.tambahAntrian(nama, noHp);
                    break;

                case 2:
                    antrian.cetakAntrian();
                    break;

                case 3:
                    if (antrian.isEmpty()) {
                        System.out.println("Antrian kosong, tidak ada pembeli.");
                        break;
                    }
                    antrian.cetakAntrian();
                    System.out.print("Masukkan No Antrian yang dipanggil: ");
                    int noAntrian = sc.nextInt();
                    sc.nextLine();

                    String namaPembeli = antrian.hapusAntrian(noAntrian);
                    if (namaPembeli != null) {
                        System.out.print("Kode Pesanan  : ");
                        int kode = sc.nextInt();
                        sc.nextLine();
                        System.out.print("Nama Pesanan  : ");
                        String namaPesanan = sc.nextLine();
                        System.out.print("Harga         : ");
                        int harga = sc.nextInt();
                        sc.nextLine();

                        daftarPesanan.tambahPesanan(kode, namaPesanan, harga, namaPembeli);
                        System.out.println(namaPembeli + " telah memesan " + namaPesanan);
                    }
                    break;

                case 4:
                    daftarPesanan.cetakLaporan();
                    break;

                case 0:
                    System.out.println("Terima kasih! Program selesai.");
                    break;

                default:
                    System.out.println("Pilihan tidak valid.");
            }

        } while (pilihan != 0);

        sc.close();
    }
}