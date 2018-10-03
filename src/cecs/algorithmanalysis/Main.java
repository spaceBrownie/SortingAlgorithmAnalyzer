package cecs.algorithmanalysis;

import cecs.algorithmanalysis.test.TestInsertionSort;
import cecs.algorithmanalysis.test.TestQuickSort;
import cecs.algorithmanalysis.test.TestShellSort;
import cecs.algorithmanalysis.test.TestRadixSort;

public class Main {
    public static void printArray(int arr[])
    {
        int n = arr.length;
        for (int i=0; i<n; ++i)
            System.out.print(arr[i] + " ");
        System.out.println();
    }

    public static void main(String[] args) {
        //Integer Test
        int[] intTestSize = {100000, 250000, 500000, 1000000, 2000000, 10000000};
        TestInsertionSort is = new TestInsertionSort(intTestSize);
        TestShellSort ss = new TestShellSort(intTestSize);
        TestQuickSort qs = new TestQuickSort(intTestSize);
        TestRadixSort rs = new TestRadixSort(intTestSize);

        //Float test
        float[] floatTestSize =  {100000, 250000, 500000, 1000000, 2000000, 10000000};

        //String test

    }
}
