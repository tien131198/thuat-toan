package org.example;

public class SoBiThieu {
    public static void main(String[] args) {
        int []a = new int[100];
        for(int i=  1 ; i< 100; i++ ){
            a[i-1]= i;
        }

        int sum = 100*101/2;
        int sum1 = 0;
        for (int i: a){
            sum1 += i;
        }
        int b = sum - sum1;
        System.out.println("so bi thieu " + b);
    }
}
