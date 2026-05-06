package joobsheet11;
public class QueueMahasiswa {
    Node18 front, rear;
    int size;

    public boolean isEmpty() {
        return front == null;
    }

    public void enqueue(Mahasiswa18 data) {
        Node18 newNode = new Node18(data, null);
        if (isEmpty()) {
            front = rear = newNode;
        } else {
            rear.next = newNode;
            rear = newNode;
        }
        size++;
    }

    public void dequeue() {
        if (!isEmpty()) {
            System.out.println("Dipanggil:");
            front.data.tampilInformasi();
            front = front.next;
            size--;
            if (front == null) rear = null;
        } else {
            System.out.println("Antrian kosong");
        }
    }

    public void peekFront() {
        if (!isEmpty()) {
            System.out.println("Antrian depan:");
            front.data.tampilInformasi();
        }
    }

    public void peekRear() {
        if (!isEmpty()) {
            System.out.println("Antrian belakang:");
            rear.data.tampilInformasi();
        }
    }

    public void print() {
        Node18 temp = front;
        while (temp != null) {
            temp.data.tampilInformasi();
            temp = temp.next;
        }
    }

    public void clear() {
        front = rear = null;
        size = 0;
    }

    public int getSize() {
        return size;
    }
}