package com.company;

import java.util.Arrays;

public class Fourth {
    public static void main(String[] arg){
        int[] a = new int[10];
        int i, j;
        for (i=0; i<10; i++){
            a[i] =  0+(int) (Math.random()*80);
            System.out.print(a[i] + " ");
        }
        Arrays.sort(a);
        System.out.println();
        for (j=0; j<10; j++){
            System.out.print(a[j]+" ");
        }
    }
}
