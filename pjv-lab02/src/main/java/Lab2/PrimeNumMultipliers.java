package Lab2;

public class PrimeNumMultipliers {
    public static void main(String[] args) {
        System.out.println(primes(60));
    }

    //returns the prime multipliers of a number in the form “60 = 2*2*3*5”
    public static String primes(int num){
        String result = num + " = ";
        for (int i = 2; i <= num; i++) {
            while (num % i == 0) {
                result += i + "*";
                num /= i;
            }
        }
        result = result.substring(0, result.length() - 1);
        return result;
    }
}

