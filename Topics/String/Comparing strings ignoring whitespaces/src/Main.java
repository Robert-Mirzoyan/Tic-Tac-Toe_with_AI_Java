import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // start coding here
        String line1 = scanner.nextLine().replaceAll(" ", "").toLowerCase();
        String line2 = scanner.nextLine().replaceAll(" ", "").toLowerCase();
        System.out.println(line1.equals(line2));
    }
}