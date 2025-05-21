package school.mjc.stage0.conditions.task4;

public class MaxNumberPrinter {
    public void printGreatest(int first, int second, int third) {
        int greatest;
        if (first >= second && first >= third) {
            greatest = first;
        } else if (second >= first && second >= third) {
            greatest = second;
        } else {
            greatest = third;
        }

        System.out.println(greatest);
    }

    public static void main(String[] args) {
        MaxNumberPrinter printer = new MaxNumberPrinter();
        printer.printGreatest(0, 1, 2);
        printer.printGreatest(0, 1, 1);
        printer.printGreatest(3, 1, 2);
        printer.printGreatest(3, 4, 2);
    }
}