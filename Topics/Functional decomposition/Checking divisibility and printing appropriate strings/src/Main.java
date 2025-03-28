import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();

        // function calls of isDivByThree, isDivByFive, isDivByThreeAndFive will be here
        if (isDivByThree(num)){
            System.out.println("Fizz");
        }
        else if(isDivByFive(num)){
            System.out.println("Buzz");
        }
        else if (isDivByThreeAndFive(num)) {
            System.out.println("FizzBuzz");
        }
        else {
            System.out.println("None");
        }
    }
    // function isDivByThree will be here
    public static boolean isDivByThree(int n){
        if (n % 3 == 0 && n % 5 != 0){
            return true;
        }
        return false;
    }

    // function isDivByFive will be here
    public static boolean isDivByFive(int n){
        if (n % 5 == 0 && n % 3 != 0){
            return true;
        }
        return false;
    }

    // function isDivByThreeAndFive will be here
    public static boolean isDivByThreeAndFive(int n){
        if (n % 3 == 0 && n % 5 == 0){
            return true;
        }
        return false;
    }
}