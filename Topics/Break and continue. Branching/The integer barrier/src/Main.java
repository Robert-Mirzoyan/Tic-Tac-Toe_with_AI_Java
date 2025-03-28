import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // start coding here
        int num, sum = 0;
        boolean bool = true;
        while (bool){
            num = scanner.nextInt();
            if (num == 0 || sum >= 1000){
                break;
            }

            sum += num;
        }
        if (sum >= 1000) sum -= 1000;
        System.out.println(sum);
    }
}