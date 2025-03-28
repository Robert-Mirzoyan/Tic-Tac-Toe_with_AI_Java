import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();

        System.out.println(input % 2);
        System.out.println(input % 2 * 3);
        // The first operation goes here
        // The second operation goes here

        scanner.close();
    }
}