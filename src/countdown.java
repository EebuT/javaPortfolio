import java.util.Scanner;

public class countdown {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Please insert a number, and the program will count down from it to zero: ");
        int num = sc.nextInt();

        while (num >= 0 ){
            System.out.println(num);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e){
                e.printStackTrace();
            }
            num--;
        } 
        System.out.println("The countdown has reached 0! The program will now exit");

    sc.close();
    }
}
