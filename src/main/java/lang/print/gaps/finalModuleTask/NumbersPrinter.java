package lang.print.gaps.finalModuleTask;

public class NumbersPrinter {
    public void printIsPositive(int number) {
        System.out.println((number >> 31 & 1) == 0);
    }
}

//Implement program that will print if number is positive true, otherwise false (no if or ternary).