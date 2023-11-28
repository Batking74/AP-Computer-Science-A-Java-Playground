import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        System.out.println("Hello Babes!");
        Scanner input = new Scanner(System.in);
        System.out.println("What's Your Name?");
        String name = input.nextLine();
        System.out.println("Hello " + name);

        String nem = new String("nazir");
        System.out.println(nem.toUpperCase());
        int age = 10;

        // if condition inside variable (Ternary Operator): "?" means then, ":" means else
        int num = age >= 18 ? 10 : 29;
        System.out.println(num);

        // Do While Loop
        int count = 5;
        int i = 0;

        do {
            System.out.println(count);
            i++;
        }
        while(i <= count);
    }
}