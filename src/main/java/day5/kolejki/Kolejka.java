package day5.kolejki;

import java.util.Arrays;

public interface Kolejka {
    int pop();
    void pushPriority(int a);
    void push(int a);
    void peek();
    void display();


}
