package joobsheet11;
public class SingleLinkedList18 {
    Node18   head, tail;

    public boolean isEmpty() {
        return head == null;
    }

    public void print() {
        if (isEmpty()) {
            System.out.println("Linked List Kosong");
        } else {
            Node18  temp = head;
            while (temp != null) {
                temp.data.tampilInformasi();
                temp = temp.next;
            }
        }
    }

    public void addFirst(Mahasiswa18 data) {
        Node18 newNode = new Node18(data, null);
        if (isEmpty()) {
            head = tail = newNode;
        } else {
            newNode.next = head;
            head = newNode;
        }
    }

    public void addLast(Mahasiswa18 data) {
        Node18 newNode = new Node18(data, null);
        if (isEmpty()) {
            head = tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
    }

    public void insertAfter(String key, Mahasiswa18 data) {
        Node18 temp = head;
        while (temp != null) {
            if (temp.data.nim.equals(key)) {
                Node18 newNode = new Node18(data, temp.next);
                temp.next = newNode;
                if (temp == tail) {
                    tail = newNode;
                }
                break;
            }
            temp = temp.next;
        }
    }

    public void insertAt(int index, Mahasiswa18 data) {
        if (index == 0) {
            addFirst(data);
            return;
        }

        Node18 temp = head;
        for (int i = 0; i < index - 1; i++) {
            temp = temp.next;
        }

        Node18 newNode = new Node18(data, temp.next);
        temp.next = newNode;

        if (newNode.next == null) {
            tail = newNode;
        }
    }

    public int indexOf(String key) {
        Node18 temp = head;
        int index = 0;

        while (temp != null) {
            if (temp.data.nim.equals(key)) {
                return index;
            }
            temp = temp.next;
            index++;
        }
        return -1;
    }

    public Mahasiswa18 getData(int index) {
        Node18 temp = head;
        for (int i = 0; i < index; i++) {
            temp = temp.next;
        }
        return temp.data;
    }
    public void removeFirst() {
        if (!isEmpty()) {
            head = head.next;
            if (head == null) {
                tail = null;
            }
        }
    }
    public void removeLast() {
        if (head == null) return;

        if (head == tail) {
            head = tail = null;
            return;
        }

        Node18 temp = head;
        while (temp.next != tail) {
            temp = temp.next;
        }

        temp.next = null;
        tail = temp;
    }

    public void remove(String key) {
        Node18 temp = head;
        Node18 prev = null;

        while (temp != null) {
            if (temp.data.nim.equals(key)) {
                if (prev == null) {
                    removeFirst();
                } else {
                    prev.next = temp.next;
                    if (temp == tail) {
                        tail = prev;
                    }
                }
                break;
            }
            prev = temp;
            temp = temp.next;
        }
    }

    public void removeAt(int index) {
        if (index == 0) {
            removeFirst();
            return;
        }

        Node18 temp = head;
        for (int i = 0; i < index - 1; i++) {
            temp = temp.next;
        }

        temp.next = temp.next.next;

        if (temp.next == null) {
            tail = temp;
        }
    }
}