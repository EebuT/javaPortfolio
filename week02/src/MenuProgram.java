import java.util.Scanner;

public class MenuProgram {
    // Here we use methods from previous programs

    // Adding 2 numbers together
    public static double addition(double a, double b){
        return a + b;
    }
    // Checking if a number is even or odd
    public static boolean isEven(int num){
        return num % 2==0;
    }
    // Greeting user by name
    public static void greeting(String name){
        System.out.println("Good day to you, " + name);
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int choice = 0;
        boolean running = true;
        while (running){
        System.out.println("Welcome to the Menu Program! Choose one option from below:");
        System.out.println("1: Add two numbers together");
        System.out.println("2: Check if an integer is even or odd");
        System.out.println("3: Get a greeting from the system");
        System.out.println("4: Exit the program");
        System.out.println("Please enter the corresponding number to your desired option: ");

        choice = sc.nextInt();
        switch (choice) {
            case 1:
                System.out.println("Please enter two numbers to be added: ");
                double firstAdd = sc.nextDouble();
                double secondAdd =  sc.nextDouble();
                System.out.println("The sum of the integers is: " + addition(firstAdd,secondAdd));
                break;
            case 2:
                System.out.println("Please enter a single integer and the program will check if it's odd or even");
                int oddOrEven = sc.nextInt();
                String type = isEven(oddOrEven)? "even" : "odd";
                System.out.println("The number is " + type);
                break;
            case 3:
                System.out.println("Please enter your name for a greeting: ");
                String name = sc.nextLine();
                greeting(name); 
                break;

            case 4:
            running = false;
                break;
            default:
                break;
         }
        }

        sc.close();
    }
}
