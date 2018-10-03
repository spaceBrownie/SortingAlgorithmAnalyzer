package cecs.algorithmanalysis.test;
import cecs.algorithmanalysis.RandomNumberGenerator;
import cecs.algorithmanalysis.ShellSort;

public class TestShellSort {
    public TestShellSort(int[] arr) {
        int itr = 0;
        ShellSort ss = new ShellSort();
        System.out.print("\nShellSort:");
        while(itr < arr.length) {
            RandomNumberGenerator randomNum = new RandomNumberGenerator();
            int[] dataArr = randomNum.RandomNumberGenerator(arr[itr]);
            System.out.print("\n" + arr[itr] + " records: \t");
            System.out.print("\t");
            ss.sort(dataArr);
            ss.getElapsedTime();
            ss.sort(dataArr);
            System.out.print("\t");
            ss.getElapsedTime();
            ss.reverseSort(dataArr);
            ss.sort(dataArr);
            System.out.print("\t");
            ss.getElapsedTime();
            ++itr;
        }
    }
}
