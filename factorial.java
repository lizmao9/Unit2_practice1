/**
 */
public class factorial
{
    public static int factorial(int n) {
        int result = 1;
        for (int i = 1; i <= n; i++){
            result *= i; //multiply result by i
        }
        return result;
    }
    
    public static int factorial2(int n) {
        if (n == 1){
            return 1;
        }
        return n * factorial2(n-1);
    }
    
    public static int fibonacci(int n) {
        if (n <= 2) {
            return 1;
        }
        return fibonacci(n-1) + fibonacci(n-2);
    }
}