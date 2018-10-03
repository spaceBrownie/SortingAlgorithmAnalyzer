package cecs.algorithmanalysis;

import java.util.Random;

public class RandomNumberGenerator {
    public int[] RandomPositiveNumberGenerator(int size) {
        int itr = 0;
        int[] arr = new int[size];
        Random randomNumber = new Random();

        while(itr != size) {
            arr[itr] = randomNumber.nextInt(Integer.MAX_VALUE);
            ++itr;
        }
        return arr;
    }

    public int[] RandomNumberGenerator(int size) {
        int itr = 0;
        int[] arr = new int[size];
        Random randomNumber = new Random();

        while(itr != size) {
            arr[itr] = randomNumber.nextInt();
            ++itr;
        }
        return arr;

    }
}
