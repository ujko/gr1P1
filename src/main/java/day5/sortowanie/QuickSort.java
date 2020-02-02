package day5.sortowanie;

import java.util.Arrays;

public class QuickSort {
    public static void main(String[] args) {
        int[] x={3,6,7,2,8,5};
        quickSort(x);
        System.out.println(Arrays.toString(x));
    }

    public static void quickSort(int[] x) {
    quick(x,0,x.length-1);
    }
    private static void quick(int[] x, int start, int stop){
         if(start<stop){
             int pivot=pivot(x,start,stop);
             quick(x,start,pivot-1);
             quick(x,pivot+1,stop);
         }
    }
    private static int pivot(int[] x,int start, int stop){
        int pivot=x[stop];
        int granica=start-1;
        for (int i=start;i<stop;i++){
            if (x[i]<=pivot){
                swap(x,i,granica+1);
                granica++;
            }
        }
        swap(x,stop,granica+1);
        return granica+1;
    }
    private static void swap(int[] x,int i1,int i2){
        int y=x[i1];
        x[i1]=x[i2];
        x[i2]=y;
    }
}
