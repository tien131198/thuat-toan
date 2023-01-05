package org.example;

public class Max2 {
    public static void main(String[] args) {
        int[] a = {1, 3, 4, 5, 5, 7, 8, 4, 9};

//                - Nếu có 1 số >= firstMax:
//        secondMax = firstMax;
//        firstMax = số lớn nhất mới tìm được
//                - Nếu có 1 số chỉ > secondMax:
//        secondMax = số lớn hơn mới tìm được
        int firstMax, secondMax;
        if (a[0] > a[1]) {
            firstMax = a[0];
            secondMax = a[1];
        } else {
            firstMax = a[1];
            secondMax = a[0];
        }
        for (int i = 0; i < 9; i++) {
            if (a[i] >= firstMax) {
                secondMax = firstMax;
                firstMax = a[i];
            } else if (a[i] > secondMax) {
                secondMax = a[i];
            }
        }
        System.out.println("firstMax " + firstMax);
        System.out.println("secondMax " + secondMax);
    }
}
