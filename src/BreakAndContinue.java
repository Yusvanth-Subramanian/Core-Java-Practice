import java.util.Scanner;

public class BreakAndContinue {

    public static void main(String args[]){

        Scanner s = new Scanner(System.in);


        while(true){
            System.out.println("Continue or stop ? ");
            String str = s.next();
            if(str.equals("continue"))
                continue;
            if(str.equals("stop"))
                break;
        }
    }

}
