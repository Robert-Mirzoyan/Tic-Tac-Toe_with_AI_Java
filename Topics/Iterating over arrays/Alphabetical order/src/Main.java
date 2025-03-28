import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String[] array = input.split(" ");
        boolean isAlphabetical = true;
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i].compareTo(array[i+1]) >0 ){
                isAlphabetical = false;
            }
        }
        System.out.println(isAlphabetical);
    }
}