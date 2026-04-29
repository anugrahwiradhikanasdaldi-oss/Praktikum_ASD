package jobbsheet10;
public class AntrianKRS_18 {
    Mahasiswa18 [] antrian;
    int front, rear, size, max;
    int totalSelesaiKRS = 0;
    final int KAPASITAS_DPA = 30;

    public AntrianKRS_18(int n) {
        max = n;
        antrian = new Mahasiswa18[max];
        front = 0;
        rear = -1;
        size = 0;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public boolean isFull() {
        return size == max;
    }

    public void clear() {
        front = 0;
        rear = -1;
        size = 0;
        System.out.println("Antrian telah dikosongkan.");
    }

    public void tambahAntrian(Mahasiswa18 mhs) {
        if (isFull()) {
            System.out.println("Gagal: Antrian penuh (Maksimal 10).");
        } else {
            rear = (rear + 1) % max;
            antrian[rear] = mhs;
            size++;
            System.out.println(mhs.nama + " berhasil masuk antrian.");
        }
    }

    public void prosesKRS() {
        if (size < 2) {
            System.out.println("Proses KRS gagal: Minimal harus ada 2 mahasiswa dalam antrian.");
        } else {
            System.out.println("Memproses KRS untuk 2 mahasiswa terdepan:");
            for (int i = 0; i < 2; i++) {
                Mahasiswa18 m = antrian[front];
                System.out.print("Selesai: ");
                m.tampilData();
                front = (front + 1) % max;
                size--;
                totalSelesaiKRS++;
            }
        }
    }

    public void tampilkanSemua() {
        if (isEmpty()) {
            System.out.println("Antrian kosong.");
        } else {
            System.out.println("Daftar Antrian Saat Ini:");
            int temp = front;
            for (int i = 0; i < size; i++) {
                System.out.print((i + 1) + ". ");
                antrian[temp].tampilData();
                temp = (temp + 1) % max;
            }
        }
    }

    public void lihatDuaTerdepan() {
        if (size < 2) {
            System.out.println("Mahasiswa dalam antrian kurang dari 2.");
        } else {
            System.out.println("2 Mahasiswa Terdepan:");
            antrian[front].tampilData();
            antrian[(front + 1) % max].tampilData();
        }
    }

    public void lihatPalingAkhir() {
        if (isEmpty()) {
            System.out.println("Antrian kosong.");
        } else {
            System.out.println("Antrian Paling Akhir:");
            antrian[rear].tampilData();
        }
    }

    public void cetakStatistik() {
        int belumKRS = KAPASITAS_DPA - totalSelesaiKRS;
        System.out.println("--- Statistik KRS ---");
        System.out.println("Jumlah dalam antrian saat ini: " + size);
        System.out.println("Total mahasiswa sudah KRS    : " + totalSelesaiKRS);
        System.out.println("Total mahasiswa belum KRS    : " + belumKRS + " (dari kuota 30)");
    }
}