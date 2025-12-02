package org.example;

public class BubbleSort {
    public static Integer[] sort(Integer[] arr) {
        if (arr == null) return null;
        Integer[] a = arr.clone();
        int n = a.length;
        boolean swapped;

        for (int i = 0; i < n - 1; i++) {
            swapped = false;
            for (int j = 0; j < n - 1 - i; j++) {
                if (a[j] > a[j + 1]) {
                    a[j] = a[j + 1];
                    a[j + 1] = a[j];
                    swapped = true;
                }
            }
            if (!swapped) break;
        }
        return a;
    }
}
