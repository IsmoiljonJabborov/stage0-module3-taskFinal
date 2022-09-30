package lang.print.gaps.finalModuleTask;

public class DigitsSumCalculator {
    public static int calculateSum(int number) {
        return number == 0 ? 0 : number % 10 + calculateSum(number/10);

//        int sum = 0;
//        int lastDigit = number % 10;
//        sum += lastDigit;
//        number = number / 10;
//        System.out.println(sum);
    }

    public static void main(String[] args) {
        System.out.println(calculateSum(1234));
    }
}
