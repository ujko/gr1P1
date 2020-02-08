package day6;

import java.math.BigInteger;

public class Fibo {
    public static BigInteger fibo(BigInteger x){
        if (x.intValueExact()<=1){
            return x;
        }
        return fibo(x.subtract(new BigInteger("2"))).add(fibo(x.subtract(new BigInteger("1"))));
    }
    public static BigInteger silnia(int x){

        BigInteger value=new BigInteger("1");
        for(int i=1;i<=x;i++){
            value=value.multiply(new BigInteger(""+i));
        }
        return value;
    }

    public static void main(String[] args) {
      System.out.println(fibo(new BigInteger("40")));
      //  System.out.println(silnia(10_000));
    }
}
