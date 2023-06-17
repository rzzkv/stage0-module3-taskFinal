package lang.print.gaps.finalModuleTask;

public class DigitsSumCalculator {
    public void calculateSum(int number) {
        int sum = 0;
        int digit;

        while (number > 0) {
            digit = number % 10;
            sum += digit;
            number /= 10;
        }

        System.out.println("The sum of digits of the number is: " + sum);

    }
}
