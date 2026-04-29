package jobbsheet10;

public class AntrianLayanan_18 {
    Mahasiswa_18 [] data;
    int front, rear, size, max;

    public AntrianLayanan_18(int n) {
        max = n;
        data = new Mahasiswa_18[max];
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
    public void tambahAntrian(Mahasiswa_18 mhs) {
        if (isFull()) {
            System.out.println("Antrian penuh, TIDAK dapat menambah mahasiswa.");
        } else {
            rear = (rear + 1) % max;
            data[rear] = mhs;
            size++;
            System.out.println(mhs.nama + " berhasil masuk ke antrian.");
        }
    }

    public Mahasiswa_18 layananMahasiswa() {
        if (isEmpty()) {
            System.out.println("Antrian kosong.");
            return null;
        } else {
            Mahasiswa_18 mhs = data[front];
            front = (front + 1) % max;
            size--;
            return mhs;
        }
    }

    public void lihatTerdepan() {
        if (isEmpty()) {
            System.out.println("Antrian kosong.");
        } else {
            System.out.println("Mahasiswa Terdepan: ");
            System.out.println("NIM - NAMA - PRODI - KELAS");
            data[front].tampilkanData();
        }
    }

    public void tampilkanSemua() {
        if (isEmpty()) {
            System.out.println("Antrian kosong.");
        } else {
            System.out.println("Daftar Mahasiswa dalam Antrian:");
            System.out.println("NIM - NAMA - PRODI - KELAS");
            int i = front;
            for (int j = 0; j < size; j++) {
                System.out.print((j + 1) + ". ");
                data[i].tampilkanData();
                i = (i + 1) % max;
            }
        }
    }
    public int getJumlahAntrian() {
        return size;
    }
}