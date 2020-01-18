package day2.zadanieJeden;

import java.util.Arrays;

public class ZwrocPierwszaLiczbe {

    public static void main(String[] args) {
        System.out.println(zwrocLiczbe(new int[] {1,7,1,2,5,6,9,4,8}));
    }

    private static int zwrocLiczbe(int[] ints) {
        Arrays.sort(ints);
        int i;
        for (i=1 ; i<=ints.length ; i++) {
            if (i!=ints[i-1]) {
                return i;
            }
        } return i;
    }


}
