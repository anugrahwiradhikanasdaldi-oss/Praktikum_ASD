package jobbsheet10;
public class Mahasiswa_18 {
    String nama;
    String nim;
    String kelas;
    String prodi;

    public Mahasiswa_18(String nama, String nim, String kelas, String prodi) {
        this.nama = nama;
        this.nim = nim;
        this.kelas = kelas;
        this.prodi = prodi;
    }
    public void tampilkanData() {
        System.out.println(nim + " - " + nama + " - " + kelas + " - " + prodi);  
    }
}