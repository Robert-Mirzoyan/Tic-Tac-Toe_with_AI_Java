import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here
        // You can use scanner.nextBoolean() to read a boolean value
        int peanut = scanner.nextInt();
        boolean weekend = scanner.nextBoolean();
        System.out.println((weekend && peanut >= 15 && peanut <= 25) || (!weekend && peanut >= 10 && peanut <= 20));
    }
}