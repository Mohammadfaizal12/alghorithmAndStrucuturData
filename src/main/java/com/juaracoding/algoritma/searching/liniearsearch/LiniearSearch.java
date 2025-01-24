package com.juaracoding.algoritma.liniearsearch;

public class LiniearSearch {

    public static int liniearSearch(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        int[] data = {3, 5, 7, 9, 11, 13};
        int target = 9;

        int result = liniearSearch(data, target);

        if (result != -1) {
            System.out.println("Data Di Temukan ");
        } else {
            System.out.println("Data Tidak Di Temukan ");
        }
    }
}
