package CM;
public class Pembeli_18 {
    int noAntrian;
    String namaPembeli;
    String noHp;
    Pembeli_18 prev;
    Pembeli_18 next;

    Pembeli_18(String namaPembeli, String noHp) {
        this.namaPembeli = namaPembeli;
        this.noHp = noHp;
        this.prev = null;
        this.next = null;
    }
}