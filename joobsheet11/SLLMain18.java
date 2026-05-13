package joobsheet11;
import java.util.Scanner;

public class SLLMain18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        SingleLinkedList18 sll = new SingleLinkedList18();

        int pilihan;
        do {
            System.out.println("\n=== MENU LINKED LIST ===");
            System.out.println("1. Tambah Data di Awal");
            System.out.println("2. Tambah Data di Akhir");
            System.out.println("3. Insert Setelah NIM");
            System.out.println("4. Insert di Index");
            System.out.println("5. Hapus Berdasarkan NIM");
            System.out.println("6. Hapus Berdasarkan Index");
            System.out.println("7. Tampilkan Data");
            System.out.println("0. Keluar");
            System.out.print("Pilih: ");
            pilihan = sc.nextInt();
            sc.nextLine();

            switch (pilihan) {

                case 1:
                    Mahasiswa18 m1 = inputMahasiswa(sc);
                    sll.addFirst(m1);
                    break;

                case 2:
                    Mahasiswa18 m2 = inputMahasiswa(sc);
                    sll.addLast(m2);
                    break;

                case 3:
                    System.out.print("Masukkan NIM setelah data: ");
                    String key = sc.nextLine();
                    Mahasiswa18 m3 = inputMahasiswa(sc);
                    sll.insertAfter(key, m3);
                    break;

                case 4:
                    System.out.print("Masukkan index: ");
                    int index = sc.nextInt();
                    sc.nextLine();
                    Mahasiswa18 m4 = inputMahasiswa(sc);
                    sll.insertAt(index, m4);
                    break;

                case 5:
                    System.out.print("Masukkan NIM yang dihapus: ");
                    String nimHapus = sc.nextLine();
                    sll.remove(nimHapus);
                    break;

                case 6:
                    System.out.print("Masukkan index yang dihapus: ");
                    int idx = sc.nextInt();
                    sll.removeAt(idx);
                    break;

                case 7:
                    sll.print();
                    break;
            }

        } while (pilihan != 0);

        System.out.println("Program selesai");
    }

    // METHOD INPUT DATA
    public static Mahasiswa18 inputMahasiswa(Scanner sc) {
        System.out.print("NIM   : ");
        String nim = sc.nextLine();
        System.out.print("Nama  : ");
        String nama = sc.nextLine();
        System.out.print("Kelas : ");
        String kelas = sc.nextLine();
        System.out.print("IPK   : ");
        double ipk = sc.nextDouble();
        sc.nextLine();

        return new Mahasiswa18(nim, nama, kelas, ipk);
    }
}