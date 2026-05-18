package CM;
public class Pesanan_18 {
    int kodePesanan;
    String namaPesanan;
    int harga;
    String namaPembeli;
    Pesanan_18 prev;
    Pesanan_18 next;

    Pesanan_18(int kodePesanan, String namaPesanan, int harga, String namaPembeli) {
        this.kodePesanan = kodePesanan;
        this.namaPesanan = namaPesanan;
        this.harga = harga;
        this.namaPembeli = namaPembeli;
        this.prev = null;
        this.next = null;
    }
}