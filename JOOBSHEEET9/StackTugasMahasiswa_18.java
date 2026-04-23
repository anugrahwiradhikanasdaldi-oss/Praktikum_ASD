package JOOBSHEEET9;
public class StackTugasMahasiswa_18 {
    Mahasiswa_18[] stack;
    int size;
    int top;
    public StackTugasMahasiswa_18(int size) {
        this.size = size;
        stack = new Mahasiswa_18[size];
        top = -1;
    }
    public boolean isFull() {
        return top == size - 1;
    }
    public boolean isEmpty() {
        return top == -1;
    }
    public void push(Mahasiswa_18 mhs) {
        if (!isFull()) {
            top++;
            stack[top] = mhs;
            System.out.println("Tugas berhasil dikumpulkan");
        } else {
            System.out.println("Stack penuh!");
        }
    }
    public Mahasiswa_18 pop() {
        if (!isEmpty()) {
            Mahasiswa_18 mhs = stack[top];
            top--;
            return mhs;
        } else {
            System.out.println("Stack kosong!");
            return null;
        }
    }
    public Mahasiswa_18 peek() {
        if (!isEmpty()) {
            return stack[top];
        } else {
            System.out.println("Stack kosong!");
            return null;
        }
    }
public String konversiDesimalKeBiner(int nilai) {
        StackKonversi_18 stack = new StackKonversi_18();

        while (nilai > 0) {
            int sisa = nilai % 2;
            stack.push(sisa);
            nilai = nilai / 2;
        }
        String biner = "";
        while (!stack.isEmpty()) {
            biner += stack.pop();
        }

        return biner;
    }
    public void print() {
        if (!isEmpty()) {
            System.out.println("Isi Stack:");
            for (int i = top; i >= 0; i--) {
                System.out.println(stack[i].nama + " \t " + stack[i].nim + " \t " + stack[i].kelas);
            }
        }
    }
}