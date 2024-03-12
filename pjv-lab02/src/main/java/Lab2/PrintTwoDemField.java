package Lab2;

public class PrintTwoDemField {
    void printTwoDemField(int[][] arr) {
        for (int[] i : arr) {
            for (int j : i) {
                System.out.print(j + " ");
            }
            System.out.println(" ");
        }
    }
}
