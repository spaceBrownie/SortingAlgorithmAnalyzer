package cecs.algorithmanalysis.test;
import cecs.algorithmanalysis.RandomNumberGenerator;
import cecs.algorithmanalysis.QuickSort;

public class TestQuickSort {
    public TestQuickSort(int[] arr) {
        int itr = 0;
        QuickSort qs = new QuickSort();
        System.out.print("\nQuick Sort:");
        while(itr < arr.length) {
            RandomNumberGenerator randomNum = new RandomNumberGenerator();
            int[] dataArr = randomNum.RandomNumberGenerator(arr[itr]);
            System.out.print("\n" + arr[itr] + " records: \t");
            System.out.print("\t");
            qs.setStartTime();
            qs.sort(dataArr, 0, dataArr.length - 1);
            qs.setStopTime();
            qs.getElapsedTime();
            qs.setStartTime();
            qs.sort(dataArr, 0, dataArr.length - 1);
            qs.setStopTime();
            System.out.print("\t");
            qs.getElapsedTime();
            qs.reverseSort(dataArr);
            qs.setStartTime();
            qs.sort(dataArr, 0 , dataArr.length - 1);
            qs.setStopTime();
            System.out.print("\t");
            qs.getElapsedTime();
            ++itr;
        }
    }
}
