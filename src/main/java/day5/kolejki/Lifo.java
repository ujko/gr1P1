package day5.kolejki;

import java.util.Arrays;

public class Lifo implements Kolejka{
    private final int SIZE = 10;
    private int[] queue = new int[SIZE];
    private int lastIndex = 0;

    @Override
    public int pop() {
        if(lastIndex > 0){
            return queue[--lastIndex];
        }throw new IllegalArgumentException("Brak elementów");
    }

    @Override
    public void pushPriority(int a) {

    }

    @Override
    public void push(int a) {
        increaseTable();
        queue[lastIndex++] = a;
    }

    @Override
    public void peek() {
        if(lastIndex > 0){
            System.out.println(queue[lastIndex-1]);
        }
    }

    @Override
    public void display() {
        String s = "";
        for (int i = 0; i < lastIndex; i++) {
            System.out.print(s + queue[i]);
            s = ", ";
        }
    }

    private void increaseTable() {
        if (lastIndex >= queue.length) {
            queue = Arrays.copyOf(queue, queue.length + SIZE);
        }
    }
}
