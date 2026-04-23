package JOOBSHEEET9;
public class Mahasiswa_18 {
    String nim;
    String nama;
    String kelas;
    int nilai;
    public Mahasiswa_18() {
    }
    public Mahasiswa_18(String nim, String nama, String kelas) {
        this.nim = nim;
        this.nama = nama;
        this.kelas = kelas;
        this.nilai = -1; 
    }
    public void tugasDinilai(int nilai) {
        this.nilai = nilai;
    }
}