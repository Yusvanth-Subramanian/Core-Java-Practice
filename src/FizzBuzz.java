import java.util.Scanner;

public class FizzBuzz {

    public static void main(String args[]){

        int i=0;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter a number : ");
        i=s.nextInt();
        if(i%5==0&&i%3==0)
            System.out.print("FizzBuzz");
        else if(i%5==0&&i%3!=0)
            System.out.print("Fizz");
        else if(i%3==0&&i%5!=0)
            System.out.print("Buzz");
        else
            System.out.print(i);

    }
}
