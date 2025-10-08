import java.util.Scanner;

public class variables {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Please insert the following information: ");
        System.out.println("Name: ");
        String name = sc.nextLine();
        System.out.println("Age: ");
        int age = sc.nextInt();
        System.out.println("Height(in meters eg. 1,8 = 180cm): ");
        double height = sc.nextDouble();
        System.out.printf("Your information: %nName: " + name + "%nAge: " + age + "%nHeight: "+ height);
        sc.close();
    }
}
