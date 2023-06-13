import java.util.Scanner;

public class ReadingInput {

    public static void main(String args[]){

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your first name : ");
        String name  = scanner.next();
        System.out.println("Enter your age : ");
        int age = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Enter your address : ");
        String address = scanner.nextLine();
        System.out.println("Enter your salary : ");
        double salary = scanner.nextDouble();
        System.out.println("Enter your CGPA : ");
        float cgpa = scanner.nextFloat();


    }
}
