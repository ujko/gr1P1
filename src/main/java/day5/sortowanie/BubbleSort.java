package day5.sortowanie;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] x = {3, 6, 7, 2, 8, 1};
        runBubble(x);
        System.out.println(Arrays.toString(x));
    swap(5,10);
    }
    private static void swap(int a, int b){
        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println("a="+a+", b="+b);
    }
    public static void runBubble(int[] x) {
        for (int i = 0; i < x.length; i++) {
            for (int k = 0; k < x.length - 1-i; k++) {
                if (x[k] > x[k + 1]) {
                    int w = x[k];
                    x[k] = x[k + 1];
                    x[k + 1] = w;
                }
            }
        }
    }
}
