package cecs.algorithmanalysis.test;
import cecs.algorithmanalysis.RandomNumberGenerator;
import cecs.algorithmanalysis.ShellSort;

public class TestShellSort<T extends Comparable<T>> {
    public TestShellSort(Class<T[]> type, Integer[] arr) {
        int itr = 0;
        ShellSort<T> ss = new ShellSort<T>();
        System.out.print("\nShellSort:");
        while(itr < arr.length) {
            RandomNumberGenerator<T> randomNum = new RandomNumberGenerator<T>();
            Object[] dataArr = randomNum.RandomNumberGenerator(type, arr[itr]);
            System.out.print("\n" + arr[itr] + " records: \t");
            System.out.print("\t");
            ss.sort((T[]) dataArr);
            ss.getElapsedTime();
            ss.sort((T[])dataArr);
            System.out.print("\t");
            ss.getElapsedTime();
            ss.reverseSort(dataArr);
            ss.sort((T[])dataArr);
            System.out.print("\t");
            ss.getElapsedTime();
            ++itr;
        }
    }
}
