package day5.kolejki;

import java.util.Arrays;

public class Fifo implements Kolejka{
    private final int SIZE = 10;
    private int[] queue = new int[SIZE];
    private int firstIndex = 0;
    private int lastIndex = 0;

    public int pop() {
        if (lastIndex >= firstIndex) {
            return queue[firstIndex++];
        }
        throw new IllegalArgumentException("Brak elementów");
    }

    public void pushPriority(int a) {
        if (firstIndex > 0) {
            firstIndex--;
            queue[firstIndex] = a;
        } else {
            increaseTable();
            for (int i = lastIndex; i > 0; i--) {
                queue[i] = queue[i - 1];
            }
            lastIndex++;
            queue[firstIndex] = a;
        }

    }

    public void push(int a) {
        increaseTable();
        queue[lastIndex] = a;
        lastIndex++;
    }

    private void increaseTable() {
        if (lastIndex >= queue.length) {
            queue = Arrays.copyOf(queue, queue.length + SIZE);
        }
    }

    public void peek() {
        if (lastIndex > firstIndex) {
            System.out.println(queue[lastIndex - 1]);
        } else {
            System.out.println("pusta tablica");

        }
    }

    public void display() {
        String s = "";
        for (int i = firstIndex; i < lastIndex; i++) {
            System.out.print(s + queue[i]);
            s = ", ";
        }
    }


}
