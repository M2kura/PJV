package Lab2;
import java.util.Scanner;
public class AverageIntCounter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        int count = 0;
        int num;
        while (true) {
            System.out.println("Enter a number: ");
            num = sc.nextInt();
            if (num == 0) {
                break;
            }
            sum += num;
            count++;
        }
        System.out.println("Average: " + (double) sum / count);
    }
}
