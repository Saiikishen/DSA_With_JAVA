import java.util.Scanner;

public class BubbleSort {

    static void BubbleSort(int[] arr) {  
        int n = arr.length;  
        int temp = 0;  
         for(int i=0; i < n; i++){  
                 for(int j=1; j < (n-i); j++){  
                          if(arr[j-1] > arr[j]){   
                                 temp = arr[j-1];  
                                 arr[j-1] = arr[j];  
                                 arr[j] = temp;  
                         }  
                          
                 }  
         } 
         
         for (int a=0; a<n;a++){
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
        BubbleSort(arr);
        sc.close();

}}
