package JOOBSHEEET9;
public class StackSurat_18 {
    Surat_18[] stack;
    int size;
    int top;

    public StackSurat_18(int size) {
        this.size = size;
        stack = new Surat_18[size];
        top = -1;
    }

    public boolean isFull() {
        return top == size - 1;
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public void push(Surat_18 s) {
        if (!isFull()) {
            top++;
            stack[top] = s;
            System.out.println("Surat berhasil ditambahkan.");
        } else {
            System.out.println("Stack penuh!");
        }
    }

    public Surat_18 pop() {
        if (!isEmpty()) {
            Surat_18 s = stack[top];
            top--;
            return s;
        } else {
            System.out.println("Stack kosong!");
            return null;
        }
    }

    public Surat_18 peek() {
        if (!isEmpty()) {
            return stack[top];
        } else {
            System.out.println("Belum ada surat.");
            return null;
        }
    }

    public void cariSurat(String nama) {
        boolean ditemukan = false;
        for (int i = 0; i <= top; i++) {
            if (stack[i].namaMahasiswa.equalsIgnoreCase(nama)) {
                System.out.println("Surat ditemukan:");
                stack[i].tampil();
                ditemukan = true;
            }
        }
        if (!ditemukan) {
            System.out.println("Surat tidak ditemukan.");
        }
    }
}