package com.juaracoding.algoritma.sorting.insertionsort;
public class InsertionSortExmp {

    public static void insertionArray(int [] arr) {
        //looping array dimulai dari index ke 1
        for (int i = 1; i < arr.length ; i++) {
            // deklarasi key diisi dengan index ke i;
            int key = arr[i];
            // deklarsai j (isi nya i - 1 = artinya index ke 0) untuk dibandingkan dengan dengan key
            int j = i - 1;
            //12, 11, 13, 5, 6
            while (j >= 0 && arr[j] > key) {
                arr[j+1] = arr[j];
                j--;
            }

            arr[j+1] = key;
        }
    }

    public static void main(String[] args) {
        int [] arr = {14,19,28,5,1};
        System.out.println("Array sebelum diurutkan:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
        insertionArray(arr);
        System.out.println("\nArray setelah diurutkan:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
