package JOOBSHEEET9;
import java.util.Scanner;
public class MahasiswaDemo_18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StackTugasMahasiswa_18 stack = new StackTugasMahasiswa_18(5);

        int pilih;

        do {
            System.out.println("\n=== MENU STACK TUGAS ===");
            System.out.println("1. Kumpulkan Tugas");
            System.out.println("2. Nilai Tugas (Pop)");
            System.out.println("3. Lihat Tugas Teratas");
            System.out.println("4. Tampilkan Semua");
            System.out.println("5. Keluar");
            System.out.print("Pilih: ");
            pilih = sc.nextInt();
            sc.nextLine();

            switch (pilih) {
                case 1:
                    System.out.print("NIM: ");
                    String nim = sc.nextLine();
                    System.out.print("Nama: ");
                    String nama = sc.nextLine();
                    System.out.print("Kelas: ");
                    String kelas = sc.nextLine();

                    Mahasiswa_18 mhs = new Mahasiswa_18(nim, nama, kelas);
                    stack.push(mhs);
                    break;

                case 2:
                    Mahasiswa_18 dinilai = stack.pop();
                    if (dinilai != null) {
                        System.out.println("Menilai tugas dari " + dinilai.nama);
                        System.out.print("Masukkan nilai (0-100): ");
                        int nilai = sc.nextInt();
                        dinilai.tugasDinilai(nilai);

                        System.out.printf("Nilai tugas %s adalah %d\n", dinilai.nama, nilai);

                        String biner = stack.konversiDesimalKeBiner(nilai);
                        System.out.println("Nilai Biner Tugas: " + biner);  
                    }
                    break;
                case 3:
                    Mahasiswa_18 lihat = stack.peek();
                    if (lihat != null) {
                        System.out.println("Tugas teratas: " + lihat.nama);
                    }
                    break;

                case 4:
                    stack.print();
                    break;

                case 5:
                    System.out.println("Keluar...");
                    break;
                case 6:
                System.out.println("Jumlah tugas terkumpul: " + stack.count ());
                    break;

                default:
                    System.out.println("Pilihan tidak valid!");
            }

        } while (pilih != 5);
    }
}