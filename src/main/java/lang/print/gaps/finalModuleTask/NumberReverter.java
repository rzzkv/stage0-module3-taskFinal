package lang.print.gaps.finalModuleTask;

public class NumberReverter {
    public void revert(int number) {
        int hundreds = number / 100;
        int tens = (number % 100) / 10;
        int ones = number % 10;
        int reversedNumber = ones * 100 + tens * 10 + hundreds;
        System.out.println(reversedNumber);

    }
}
