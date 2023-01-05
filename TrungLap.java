package org.example;
// Loaị bỏ trùng lặp
public class TrungLap {
    public static void main(String[] args) {
        int [] a = {1, 3 ,4 ,5,5, 7, 8 ,4, 9};
        int [] b = new int[9];
        int size = 0;
        boolean check;

        b[0] = a [0];
        size++;
        for (int i = 0; i <9; i++){
            check = false;
            for(int j = 0; j < size; j++ ){
                if(a[i]== b[j]){
                    check = true;
                    break;
                }
            }
            if(! check){
                b[size] = a [i];
                size ++;
            }
        }
        for (int i = 0 ; i< size; i++){
            System.out.println(b[i]);
        }

    }
}
