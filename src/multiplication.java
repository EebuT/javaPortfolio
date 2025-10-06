import java.util.Scanner;

public class multiplication {
    public static void main(String[] args){
        System.out.println("Please enter a number. The progam will print that numbers multiplication table up to x10: ");
        Scanner sc = new Scanner(System.in);
        double userNum = sc.nextDouble();

        for(int i=0; i<=10;i++){
            double result = i*userNum;
            System.out.printf("%.2f x %d = %.2f%n",userNum,i,result);
        }
        sc.close();
    }
}
