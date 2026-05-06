package joobsheet11;
public class SLLMain18 {
    public static void main(String[] args) {
        SingleLinkedList18 sll = new SingleLinkedList18();

        Mahasiswa18 m1 = new Mahasiswa18("001", "Aulia", "TI-1A", 3.5);
        Mahasiswa18 m2 = new Mahasiswa18("002", "Naufal", "TI-1A", 3.7);
        Mahasiswa18 m3 = new Mahasiswa18("003", "Amalia", "TI-1A", 3.8);
        Mahasiswa18 m4 = new Mahasiswa18("004", "Evan", "TI-1A", 3.6);

        sll.print();

        sll.addFirst(m1);
        sll.print();

        sll.addLast(m2);
        sll.print();

        sll.insertAfter("001", m3);
        sll.print();

        sll.insertAt(2, m4);
        sll.print();

        System.out.println("Index NIM 003: " + sll.indexOf("003"));

        sll.remove("002");
        sll.print();

        sll.removeAt(1);
        sll.print();
    }
}