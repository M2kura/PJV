package Lab2;

public class FillArrayRandom {
    void fillRandomArray(int[] arr, int min, int max) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * (max - min + 1) + min);
        }
    }
    void fillRandomArray(int[][] arr, int min, int max) {
        for (int i = 0; i < arr.length; i++) {
            arr[i][i] = (int) (Math.random() * (max - min + 1) + min);
        }
    }
}
