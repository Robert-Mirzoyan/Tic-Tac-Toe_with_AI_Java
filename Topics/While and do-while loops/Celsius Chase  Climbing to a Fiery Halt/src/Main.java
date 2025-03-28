import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int maxTemperature = 0; // Initialize maximum temperature observed
        int num;

        // Add your while loop or do-while loop here to process input temperatures
        while (true){
            num = scanner.nextInt();
            if (num >= 100){
                break;
            }
            if (num > maxTemperature){
                maxTemperature = num;
            }
        }

        // After exiting the loop, print the highest temperature
        System.out.println(maxTemperature);

        scanner.close(); // Close the scanner
    }
}