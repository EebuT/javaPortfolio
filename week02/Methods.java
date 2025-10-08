import java.util.Scanner;

public class Methods {
    public static boolean isEven(int num){
        return num % 2==0;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Please insert any integer number and the program will check if it's even or odd");
        int num = sc.nextInt();

        String type = isEven(num) ? "even" : "odd";
        
        System.out.println("The number is " + type);

        sc.close();
    }
}