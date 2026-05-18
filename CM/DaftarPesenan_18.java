package CM;
public class DaftarPesenan_18 {
    Pesanan_18 head;
    Pesanan_18 tail;
    int jumlah;

    DaftarPesenan_18() {
        head = null;
        tail = null;
        jumlah = 0;
    }

    // Tambah pesanan di belakang
    void tambahPesanan(int kodePesanan, String namaPesanan, int harga, String namaPembeli) {
        Pesanan_18 baru = new Pesanan_18(kodePesanan, namaPesanan, harga, namaPembeli);
        if (head == null) {
            head = baru;
            tail = baru;
        } else {
            baru.prev = tail;
            tail.next = baru;
            tail = baru;
        }
        jumlah++;
    }

    // Sorting manual Bubble Sort berdasarkan nama pesanan (ascending)
    void sortByNamaPesanan() {
        if (head == null || head.next == null) return;

        boolean swapped;
        do {
            swapped = false;
            Pesanan_18 curr = head;
            while (curr != null && curr.next != null) {
                if (curr.namaPesanan.compareToIgnoreCase(curr.next.namaPesanan) > 0) {
                    // Tukar isi data, bukan node
                    int tmpKode         = curr.kodePesanan;
                    String tmpNama      = curr.namaPesanan;
                    int tmpHarga        = curr.harga;
                    String tmpPembeli   = curr.namaPembeli;

                    curr.kodePesanan    = curr.next.kodePesanan;
                    curr.namaPesanan    = curr.next.namaPesanan;
                    curr.harga          = curr.next.harga;
                    curr.namaPembeli    = curr.next.namaPembeli;

                    curr.next.kodePesanan   = tmpKode;
                    curr.next.namaPesanan   = tmpNama;
                    curr.next.harga         = tmpHarga;
                    curr.next.namaPembeli   = tmpPembeli;

                    swapped = true;
                }
                curr = curr.next;
            }
        } while (swapped);
    }

    // Cetak laporan pesanan terurut + total pendapatan
    void cetakLaporan() {
        if (head == null) {
            System.out.println("Belum ada pesanan.");
            return;
        }

        sortByNamaPesanan();

        System.out.println("======================================");
        System.out.println("LAPORAN PESANAN (URUT NAMA PESANAN)");
        System.out.println("======================================");
        System.out.printf("%-14s %-20s %s%n", "Kode Pesanan", "Nama Pesanan", "Harga");

        int total = 0;
        Pesanan_18 curr = head;
        while (curr != null) {
            System.out.printf("%-14d %-20s %d%n", curr.kodePesanan, curr.namaPesanan, curr.harga);
            total += curr.harga;
            curr = curr.next;
        }
        System.out.println("--------------------------------------");
        System.out.printf("Total Pendapatan: Rp %d%n", total);
    }
}