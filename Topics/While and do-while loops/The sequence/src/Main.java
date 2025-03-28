import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num, max = 0;
        int loop = scanner.nextInt();
        for (int i = 0; i < loop; i++) {
            num = scanner.nextInt();
            if ((num % 4 == 0) && num > max){
                max = num;
            }
        }
        System.out.println(max);
        // start coding here
    }
}