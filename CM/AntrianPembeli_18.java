package CM;
public class AntrianPembeli_18 {
    Pembeli_18 head;
    Pembeli_18 tail;
    int jumlah;
    int counterAntrian;

    AntrianPembeli_18() {
        head = null;
        tail = null;
        jumlah = 0;
        counterAntrian = 0;
    }

    // Tambah antrian di belakang
    void tambahAntrian(String namaPembeli, String noHp) {
        counterAntrian++;
        Pembeli_18 baru = new Pembeli_18(namaPembeli, noHp);
        baru.noAntrian = counterAntrian;

        if (head == null) {
            head = baru;
            tail = baru;
        } else {
            baru.prev = tail;
            tail.next = baru;
            tail = baru;
        }
        jumlah++;
        System.out.println("Antrian berhasil ditambahkan dengan nomor: " + counterAntrian);
    }

    // Cetak seluruh antrian
    void cetakAntrian() {
        if (head == null) {
            System.out.println("Antrian kosong.");
            return;
        }
        System.out.println("==============================");
        System.out.println("Daftar Antrian Pembeli");
        System.out.println("==============================");
        System.out.printf("%-12s %-15s %s%n", "No Antrian", "Nama", "No HP");
        Pembeli_18 curr = head;
        while (curr != null) {
            System.out.printf("%-12d %-15s %s%n", curr.noAntrian, curr.namaPembeli, curr.noHp);
            curr = curr.next;
        }
    }

    // Hapus antrian berdasarkan nomor antrian, kembalikan nama pembeli
    String hapusAntrian(int noAntrian) {
        if (head == null) {
            System.out.println("Antrian kosong.");
            return null;
        }

        Pembeli_18 curr = head;
        while (curr != null) {
            if (curr.noAntrian == noAntrian) {
                String nama = curr.namaPembeli;

                if (curr.prev != null) curr.prev.next = curr.next;
                else head = curr.next;

                if (curr.next != null) curr.next.prev = curr.prev;
                else tail = curr.prev;

                jumlah--;
                return nama;
            }
            curr = curr.next;
        }

        System.out.println("Nomor antrian " + noAntrian + " tidak ditemukan.");
        return null;
    }

    boolean isEmpty() {
        return head == null;
    }
}