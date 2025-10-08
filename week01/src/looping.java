import java.util.Scanner;

public class looping {
 public static void main(String[] args ) {
    // A program that asks user for numbers until they enter 0

    Scanner sc = new Scanner(System.in);
    int count = 0;
    System.out.println("Please enter a number. The program will ask or numbers until you enter '0''");
    int number = sc.nextInt();
    int sum = 0;
    if(number == 0){
        System.out.println("You have entered '0'. The program will exit");
    } else {
    while (number != 0){
        count++;
        sum = sum + number;
        System.out.println("Current amount of numbers entered: " + count);
        System.out.println("Current added total of numbers: " + sum);
        System.out.println("Please keep entering numbers: ");
        number = sc.nextInt();
    }
    System.out.println("You have entered '0'. The final amount of numbers entered is: " + count + " And their sum is: "+ sum);
    }

sc.close();
 }
}
