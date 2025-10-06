import java.util.Scanner;

public class mathInJava {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two integer numbers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println("sum = " + (a+b));
        sc.close();
    }
}
