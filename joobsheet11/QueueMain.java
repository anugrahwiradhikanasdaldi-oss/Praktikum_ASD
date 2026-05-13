package joobsheet11;
import java.util.Scanner;
public class QueueMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        QueueMahasiswa q = new QueueMahasiswa();
        int pilih;
        do {
            System.out.println("\n1. Tambah Antrian");
            System.out.println("2. Panggil Antrian");
            System.out.println("3. Lihat Semua");
            System.out.println("4. Lihat Depan & Belakang");
            System.out.println("5. Jumlah Antrian");
            System.out.println("6. Kosongkan");
            System.out.println("0. Keluar");
            pilih = sc.nextInt();

            switch (pilih) {
                case 1:
                    sc.nextLine();
                    System.out.print("NIM: ");
                    String nim = sc.nextLine();
                    System.out.print("Nama: ");
                    String nama = sc.nextLine();
                    System.out.print("Kelas: ");
                    String kelas = sc.nextLine();
                    System.out.print("IPK: ");
                    double ipk = sc.nextDouble();

                    q.enqueue(new Mahasiswa18(nim, nama, kelas, ipk));
                    break;

                case 2:
                    q.dequeue();
                    break;

                case 3:
                    q.print();
                    break;

                case 4:
                    q.peekFront();
                    q.peekRear();
                    break;

                case 5:
                    System.out.println("Jumlah: " + q.getSize());
                    break;

                case 6:
                    q.clear();
                    System.out.println("Antrian dikosongkan");
                    break;
            }
        } while (pilih != 0);
    }
}