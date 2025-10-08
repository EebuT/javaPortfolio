import java.util.Scanner;
public class SumMethod {
  
    public static int addition(int a, int b){
        return a + b;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Please insert two numbers and the program will add them together: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int sum = addition(a, b);

        System.out.printf("%d + %d is: %d ",a,b,sum);
        sc.close();
    }
}
