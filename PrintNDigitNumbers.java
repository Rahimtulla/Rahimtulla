package practicejava;

public class PrintNDigitNumbers {

    public static void main(String[] args) {
        int n = 3; // Number of digits
        int sum = 4; // Target sum of digits
        printNDigitSumNumbers(n, sum);
    }

    static void printNDigitSumNumbers(int n, int sum) {
        // Handle invalid input (n <= 0 or sum < 0)
        if (n <= 0 || sum < 0) {
            System.out.println("Invalid input: n must be positive and sum must be non-negative.");
            return;
        }

        // Calculate lower and upper bounds for n-digit numbers (excluding leading zeros)
        int lower=   (int)Math.pow(10,n-1);
        int higher= (int)Math.pow(10,n) - 1;
        for(int i=lower;i<=higher;i++){
            int digitsum= generateNumber(i);
            if(digitsum==sum){
                System.out.println(i);
            }
        }

    }

    private static int generateNumber(int i) {
        int sum=0;
        while(i>0){
            sum+=i%10;
            i/=10;
        }
        return sum;
    }
}
