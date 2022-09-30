package lang.print.gaps.finalModuleTask;

public class DigitsSumCalculator {
    public static void calculateSum(int number) {
        int x = number % 10;
        int sum = 0;
        sum = sum + x;
        number = number / 10;
        System.out.println(sum);
    }

    public static void main(String[] args) {
        calculateSum(12);
    }
}
