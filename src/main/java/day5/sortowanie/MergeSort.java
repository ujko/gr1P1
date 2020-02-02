package day5.sortowanie;

import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
        int[] x = {3, 6, 7, 2, 8, 1};
        mergeSortMethod(x);
        System.out.println(Arrays.toString(x));
    }

    public static void mergeSortMethod(int[] x) {
        mergeSort(x, 0, x.length - 1);
    }

    private static void mergeSort(int[] x, int start, int stop) {
        if (start < stop) {
            int middle = (stop + start) / 2;
            mergeSort(x, start, middle);
            mergeSort(x, middle + 1, stop);
            merge(x, start, middle, stop);
        }
    }

    private static void merge(int[] x, int start, int middle, int stop) {
        int[] y = Arrays.copyOf(x, x.length);
        int i1=start;
        int i2=middle+1;
        int current=start;
        while(i1<=middle && i2<=stop){
            if(y[i1]<y[i2]){
                x[current]=y[i1];
                i1++;
            }else{
                x[current]=y[i2];
                i2++;
            }
            current++;
        }
        while(i1<=middle){
            x[current]=y[i1];
            i1++;
            current++;
        }
    }
}