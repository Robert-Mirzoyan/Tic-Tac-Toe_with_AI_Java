import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // start coding here
        String shape = scanner.next();
        double area;
        switch (shape){
            case "triangle":
                double a = scanner.nextDouble();
                double b = scanner.nextDouble();
                double c = scanner.nextDouble();
                double p = (a + b + c) / 2.0;
                area = Math.sqrt(p * (p - a) * (p - b) * (p - c));
                System.out.println(area);
                break;
            case "circle":
                double r = scanner.nextDouble();
                area = r * r * 3.14;
                System.out.println(area);
                break;
            case "rectangle":
                double d = scanner.nextDouble();
                double e = scanner.nextDouble();
                area = d * e;
                System.out.println(area);
                break;
        }
    }
}