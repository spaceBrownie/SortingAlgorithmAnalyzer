package cecs.algorithmanalysis.test;
import cecs.algorithmanalysis.RadixSort;
import cecs.algorithmanalysis.RandomNumberGenerator;

public class TestRadixSort {
    public TestRadixSort(int[] arr) {
        int itr = 0;
        RadixSort rs = new RadixSort();
        System.out.println("\nRadix Sort:");
        while(itr < arr.length) {
            RandomNumberGenerator randomNum = new RandomNumberGenerator();
            int[] dataArr = randomNum.RandomPositiveNumberGenerator(arr[itr]);

            System.out.print("\n" + arr[itr] + " records: \t");
            System.out.print("\t");
            rs.sort(dataArr);
            rs.getElapsedTime();
            rs.sort(dataArr);
            System.out.print("\t");
            rs.getElapsedTime();
            rs.reverseSort(dataArr);
            rs.sort(dataArr);
            System.out.print("\t");
            rs.getElapsedTime();
            ++itr;
        }
    }
}
