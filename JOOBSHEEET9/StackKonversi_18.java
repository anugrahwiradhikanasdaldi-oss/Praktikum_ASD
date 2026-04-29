package JOOBSHEEET9;
public class StackKonversi_18 {
    int[] stack;
    int top;
    int size = 32;

    public StackKonversi_18() {
        stack = new int[size];
        top = -1;
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public boolean isFull() {
        return top == size - 1;
    }

    public void push(int data) {
        if (!isFull()) {
            top++;
            stack[top] = data;
        }
    }

    public int pop() {
        if (!isEmpty()) {
            int data = stack[top];
            top--;
            return data;
        } else {
            return -1;
        }
    }
    public int count() {
    return top + 1;
    }
}