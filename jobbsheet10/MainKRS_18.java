package jobbsheet10;
import java.util.Scanner;

public class MainKRS_18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        AntrianKRS_18 krs = new AntrianKRS_18(10); 
        int pilihan;
        do {
            System.out.println("\n=== Sistem Antrian Persetujuan KRS ===");
            System.out.println("1. Tambah Mahasiswa ke Antrian");
            System.out.println("2. Panggil Antrian (Proses 2 Mahasiswa)");
            System.out.println("3. Lihat Semua Antrian");
            System.out.println("4. Lihat 2 Antrian Terdepan");
            System.out.println("5. Lihat Antrian Paling Akhir");
            System.out.println("6. Cetak Statistik (Sudah/Belum KRS)");
            System.out.println("7. Kosongkan Antrian");
            System.out.println("0. Keluar");
            System.out.print("Pilih menu: ");
            pilihan = sc.nextInt();
            sc.nextLine(); 

            switch (pilihan) {
                case 1:
                    System.out.print("NIM: "); String nim = sc.nextLine();
                    System.out.print("Nama: "); String nama = sc.nextLine();
                    System.out.print("Prodi: "); String prodi = sc.nextLine();
                    System.out.print("Kelas: "); String kelas = sc.nextLine();
                    krs.tambahAntrian(new Mahasiswa18(nim, nama, prodi, kelas));
                    break;
                case 2:
                    krs.prosesKRS();
                    break;
                case 3:
                    krs.tampilkanSemua();
                    break;
                case 4:
                    krs.lihatDuaTerdepan();
                    break;
                case 5:
                    krs.lihatPalingAkhir();
                    break;
                case 6:
                    krs.cetakStatistik();
                    break;
                case 7:
                    krs.clear();
                    break;
                case 0:
                    System.out.println("Program selesai.");
                    break;
                default:
                    System.out.println("Pilihan tidak valid.");
            }
        } while (pilihan != 0);
    }
}