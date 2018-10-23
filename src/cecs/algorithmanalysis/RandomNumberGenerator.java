package cecs.algorithmanalysis;

import java.lang.reflect.Array;
import java.util.Random;

public class RandomNumberGenerator<T> {
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

    public Object [] RandomNumberGenerator(Class<T[]> type, int size) {
        int itr = 0;
        Object[] arr;

        arr = type.cast(Array.newInstance(type.getComponentType(), size));
        Random randomNumber = new Random();

        if(type.isAssignableFrom(Integer.class)) {
            while (itr != size) {
                arr[itr] = randomNumber.nextInt();
                ++itr;
            }
            return arr;
        }
        if(type.isAssignableFrom(Float.class)) {
            while (itr != size) {
                arr[itr] = randomNumber.nextFloat();
                ++itr;
            }
            return arr;
        }
        /*if(type.isAssignableFrom(String.class)) {
            while (itr != size) {
                arr[itr] = randomNumber.nextInt();
                ++itr;
            }
            return arr;
        }*/
        return arr;
    }
}
