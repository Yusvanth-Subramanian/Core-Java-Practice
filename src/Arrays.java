public class Arrays {

    public static void main(String args[]){

        int arr[] = new int[5];

        int arr1[] = {1,2,3,4,5};

        for(int i=0;i<5;i++){
            arr[i]=i;
        }
        System.out.println("Array length : "+arr.length);
        System.out.print("Array Elements : ");
        for(int i:arr){
            System.out.print(i+ " ");
        }
    }
}
