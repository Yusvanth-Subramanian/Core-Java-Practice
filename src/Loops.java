public class Loops {

    public static void main(String args[]){

        // For loop

        for(int i=0;i<10;i++){
            System.out.println(i);
        }


        // While loop

        int i=0;
        while(i<10){
            System.out.println(i);
            i++;
        }


        // Do while loop

        i=0;
        do{
            System.out.println(i);
            i++;
        }while(i<10);


        // For each loop

        int arr[]={0,1,2,3,4,5,6,7,8,9};
        for(int j:arr){
            System.out.println(j);
        }
    }

}
