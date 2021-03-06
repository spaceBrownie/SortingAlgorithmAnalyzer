package cecs.algorithmanalysis;

public abstract class Sort {
    long startTime;
    long stopTime;

    public  void reverseSort(int[] arr) {
        for (int i = 0; i < arr.length / 2; i++) {
            int temp = arr[i];
            arr[i] = arr[arr.length - 1 - i];
            arr[arr.length - 1 - i] = temp;
        }
    }

    private void elapsedTime() {
        System.out.print((stopTime-startTime)/1000000 + "ms");
    }

    public void setStartTime() {
        startTime = System.nanoTime();
    }

    public void setStopTime() {
        stopTime = System.nanoTime();
    }

    public void getElapsedTime() {
        elapsedTime();
    }
}
