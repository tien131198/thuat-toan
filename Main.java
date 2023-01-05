package org.example;
// selection sort
public class Main {
    public static void main(String[] args) {
       int [] a =  {3,6, 7, 8 ,9, 0 ,10};
       for(int i = 0 ; i<7; i++){
           int minIndex = i;
           for(int j = i+1 ; j<7;  j++ ){
               if (a[j] <a[minIndex])
                   minIndex = j;
           }
           if(minIndex != i){// nếu i là minIndex thì khoong hoán đổi
               int temp = a[i];
               a[i] = a[minIndex];
               a[minIndex] = temp;
           }
       }
       for(int i = 0; i<7; i++){
           System.out.println(a[i]);
       }
    }
}