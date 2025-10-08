import java.util.Scanner;

public class ifStatements {
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.println("Please insert an integer number between -100 and 100: ");
    int num = sc.nextInt();
    if (num<-100 || num >100){
        System.out.println("Given number was not in range. The program will shutdown.");
        System.exit(0);
    }

    Boolean isEven =(num%2==0);
    Boolean isPositive =(num>0);
    Boolean isZero =(num==0);


    if (isZero){ 
    }
    else if(isEven){
        System.out.println("The number is even"); 
     } else if (!isEven) {
        System.out.println("The number is uneven"); 
     } 

     if (isZero) {
        System.out.println("The number is zero"); 
     }
     else if(isPositive) {
        System.out.println("The number is positive"); 

     } else if (!isPositive){
        System.out.println("The number is negative"); 
     }
    
    sc.close(); 
    }
}
