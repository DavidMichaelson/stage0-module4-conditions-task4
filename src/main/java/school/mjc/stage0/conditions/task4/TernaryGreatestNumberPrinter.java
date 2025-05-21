package school.mjc.stage0.conditions.task4;

public class TernaryGreatestNumberPrinter {
    public void printGreatest(int first, int second) {

        int max;
        max = (first >= second ? first : second);
        System.out.println(max);
    }

    public static void main(String[] args) {
        TernaryGreatestNumberPrinter printer = new TernaryGreatestNumberPrinter();
        printer.printGreatest(1,2);
        printer.printGreatest(2,1);
    }
}
