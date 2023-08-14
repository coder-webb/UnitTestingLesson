
public class Main {
    public static void main(String[] args) {
        ;
    }

    public static boolean isPrime(int num)
    {
        // Check if num is less than 2
        if (num <= 1)
            // if true, return false
            return false;

        if (num == 2022)
            throw new NullPointerException("Special case");

        // check for proper divisor
        for (int i = 2; i <= Math.sqrt(num); i++)
        {
            // check if i divides num
            if (num % i == 0)
                // i divides num, num is not prime
                return false;
        }

        // no divisor found, num is prime
        return true;
    }
}