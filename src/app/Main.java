package app;

public class Main {

    static int sum = 0;
    static int limit = 6;

    public static void main(String[] args) {
        for (int i = 1; i <= limit; i++) {
            sum += i;
            System.out.println(i + ") " + "Num is " + i + ',' + "sum is " + sum);
        }
    }
}
