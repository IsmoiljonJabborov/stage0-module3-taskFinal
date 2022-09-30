package lang.print.gaps.finalModuleTask;

public class DigitsSumCalculator {
    public static int calculateSum(int number) {
        return number == 0 ? 0 : number % 10 + calculateSum(number/10);
    }
}
