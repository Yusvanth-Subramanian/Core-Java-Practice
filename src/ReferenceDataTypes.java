import java.util.Date;

public class ReferenceDataTypes {

    public static void main(String args[]){

        Date date = new Date();

        System.out.println("Current Date : "+date);

        System.out.println("Current Time : "+date.getTime());

        System.out.println("Class of the date reference variable : "+date.getClass());
    }
}
