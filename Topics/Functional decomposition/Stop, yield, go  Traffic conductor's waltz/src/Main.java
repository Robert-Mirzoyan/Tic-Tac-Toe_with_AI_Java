import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int currentState = scanner.nextInt();
        scanner.close();

        String nextState = getNextState(currentState);
        String action = getAction(currentState);

        System.out.println(nextState);
        System.out.println(action);
    }

    public static String getNextState(int currentState) {
        return String.valueOf((currentState + 1) % 3);
    }

    public static String getAction(int currentState) {
        int nextState = (currentState + 1) % 3;
        if (nextState == 0) {
            return "Change to Red";
        }else if (nextState == 1){
            return "Change to Yellow";
        }else {
            return "Change to Green";
        }
    }
}