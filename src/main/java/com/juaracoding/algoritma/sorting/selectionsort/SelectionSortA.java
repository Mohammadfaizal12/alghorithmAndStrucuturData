package com.juaracoding.algoritma.sorting.selectionsort;

public class SelectionSort {
   public static void selectionSort(int [] arr) {
       int n = arr.length;
       //misal panjang array itu 5 nah dikurang 1 jadi nya 4 karna index array di mulai dari 0
       for (int i = 0; i < n - 1; i++) {
           //tentuin minIndex nya
           int minIndex = i;

           //mencari elemen terkecil 
           for (int j = i + 1; j < n ; j++) {
               //kalo true
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
        int [] arr = {64, 25, 12, 22, 11};

        System.out.println("Array sebelom di urutkan");
        for (int num : arr) {
            System.out.print(num + " ");
        }
        selectionSort(arr);

        System.out.println("\nArray setelah di urutkan");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }


}
