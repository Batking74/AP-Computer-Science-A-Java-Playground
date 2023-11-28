import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String [] message = new String[12];
        message[0] = "Hello! What's your name?";
        message[1] = "It's nice to meet you ";
        message[2] = ". What's your favorite food?";
        message[3] = "SOUNDS DELICIOUS!";
        message[4] = "Do you like school?";
        message[5] = "Where are you from?";
        message[6] = "Your name is: ";
        message[7] = "Your favorite food is: ";
        message[8] = "You are from: ";
        message[9] = "Is this information above correct?";
        message[10] = "You answered ";
        message[11] = "Thank You for answering my questions :)";

        System.out.println(message[0]);
        String name = input.nextLine();

        System.out.println(message[1] + name + message[2]);
        String answerOne = input.nextLine();

        System.out.println(message[3]);
        System.out.println(message[4]);
        String answerTwo = input.next();

        Questions myQuestions = new Questions(answerTwo);

        System.out.println(message[5]);
        String answerThree = input.nextLine();

        System.out.println("--------------------------------");
        System.out.println(message[6] + name);
        System.out.println(message[7] + answerOne);
        System.out.println(myQuestions.likesSchool());
        System.out.println(message[8] + answerThree);
        System.out.println("--------------------------------");
        System.out.println(message[9]);
        String answerFour = input.nextLine();
        System.out.println(message[10] + answerFour);
        System.out.println(message[11]);
        input.close();
    }
}