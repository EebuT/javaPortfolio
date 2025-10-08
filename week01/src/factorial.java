import java.util.Scanner;

public class factorial {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a number and the program will calculate its factorial: ");
        int userNum = sc.nextInt();
        int result = 1;
        if(userNum == 0){
            System.out.printf("The factorial of 0 is 1%n");
        }else {
        for(int i=1;i<=userNum;i++){
            result = i*result;
        }
        System.out.printf("The factorial of %d is %d%n", userNum,result);
    }
        sc.close();
    }
}
