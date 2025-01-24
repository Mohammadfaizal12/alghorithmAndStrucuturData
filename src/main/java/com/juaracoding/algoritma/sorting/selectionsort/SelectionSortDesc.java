package com.juaracoding.algoritma.sorting.selectionsort;

public class SelectionSortA {
   public static void selectionSort(int [] arr) {
       int n = arr.length;
       for (int i = 0; i < n - 1; i++) {
           //tentuin minimal index
           int minIndex = i;
           for (int j = i + 1; j < n; j++) {
               if (arr[j] < arr[minIndex]) {
                   minIndex = j;
               }
           }

           int temp = arr[minIndex];
           arr[minIndex] = arr[i];
           arr[i] = temp;
       }
    }

    public static void main(String[] args) {
        int [] nilais = {78, 95, 66, 88, 74, 85, 92, 73, 67, 80};

        System.out.println("nilai sebelum di urutkan");
        for (int nilai : nilais) {
            System.out.print(nilai + " ");
        }
        selectionSort(nilais);
        System.out.println("\nnilai sebelum di urutkan");
        for (int nilai : nilais) {
            System.out.print(nilai + " ");
        }
        System.out.println("\nNilai Terkecil : " + nilais[0]);
        System.out.println("Nilai Terbesar : " + nilais[nilais.length - 1]);

    }


}
