import java.util.Scanner;

public class Reverse_arr {


    public static void rev_arr(int[]arr){
        int b = arr.length;
        int temp =0;
        for(int j=0;j<b/2;j++){
            temp=arr[j];
            arr[j]=arr[b-j-1];
            arr[b-j-1]= temp;
            

        }
        for (int a=0; a<b;a++){
            System.out.println(arr[a]);
        }
        

    }

    public static void main(String [] args){
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the length of the array");
        int i = sc.nextInt();
        int arr[]= new int[i];
        for(int j=0;j<i;j++){
            arr[j] = sc.nextInt();
        }
        rev_arr(arr);
        sc.close();


    }
    
}
