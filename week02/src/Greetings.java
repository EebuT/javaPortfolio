import java.util.Scanner;

public class Greetings {

    public static void greeting(String name){
        System.out.println("Good day to you, " + name);
    }
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter your name, so the program can greet you: ");
        String name = sc.nextLine();
        greeting(name);
        sc.close();
    }
}
