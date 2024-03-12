package Lab2;

import java.lang.reflect.Array;
import java.util.Arrays;
public class Main {
    public static void main(String[] args) {
//        WeekDay wd = new WeekDay();
//        wd.start(args);
//        Polomer p = new Polomer();
//        p.start(args);
        PrintArray pa = new PrintArray();
        int[] arr = {1, 2, 3, 4, 5};
        pa.printArray(arr);

        FillArrayRandom far = new FillArrayRandom();
        int[] arr2 = new int[10];
        far.fillRandomArray(arr2, 1, 10);
        pa.printArray(arr2);
        Arrays.sort(arr2);
        pa.printArray(arr2);

        //two dem array
//        TwoDemField tdf = new TwoDemField();
//        int[][] arr3 = new int[5][5];
//        far.fillRandomArray(arr3, 1, 10);
//        tdf.printTwoDemField(arr3);
//        System.out.println(" ");
//        Arrays.sort(arr3, (a, b) -> Integer.compare(a[0], b[0]));
//        tdf.printTwoDemField(arr3);

    }
}
