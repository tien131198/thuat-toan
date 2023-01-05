package org.example;

public class Max3 {
    public static void main(String[] args) {
        int[] a = {1, 3, 4, 5, 6, 7, 4, 15, 15, 6, 8, 0, 1, 9};
        int[] a1 = trungLap(a);
//        for (int i = 0; i < a1.length; i++) {
//            System.out.println(a1[i]);
//        }
        int[] a2 = sort(a1);
//        for (int i = 0; i < a2.length; i++) {
//            System.out.println(a2[i]);
//        }
        System.out.println("Max 3 " + a2[a2.length - 2]);
    }

    public static int[] sort(int[] a) {
        for (int i = 0; i < a.length; i++) {
            int minIndex = i;
            for (int j = i + 1; j < a.length; j++) {
                if (a[j] < a[minIndex]) {
                    minIndex = j;
                }
                if (minIndex != i) {// neu i la minIndex thi khong hoan doi
                    int temp = a[i];
                    a[i] = a[minIndex];
                    a[minIndex] = temp;
                }
            }
        }
        return a;
    }

    public static int[] trungLap(int[] a) {
        int[] b = new int[a.length];
        boolean check;
        int size = 0;
        size++;
        b[0] = a[0];
        for (int i = 0; i < a.length; i++) {
            check = false;
            for (int j = 0; j < b.length; j++) {
                if (a[i] == b[j]) {
                    check = true;
                    break;
                }
            }
            if (!check) {
                b[size] = a[i];
                size++;
            }
        }
        return b;
    }
}
