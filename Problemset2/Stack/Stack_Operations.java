package Stack;
import java.util.Scanner;


public class Stack_Operations {  
    public static void main(String[] args) {  
        int operation=0;  
        Scanner sc = new Scanner(System.in);  
        Stack s = new Stack();    
        while(operation != 5)  
        {  
            System.out.println("operation");  
            System.out.println("1.Push 2.Pop 3.Show 4.Peep,5.Exit");  
            System.out.println("Enter");        
            operation = sc.nextInt();  
            switch(operation)  
            {  
                case 1:  
                {   
                    s.push(sc);  
                    break;  
                }  
                case 2:  
                {  
                    s.pop();  
                    break;  
                }  
                case 3:  
                {  
                    s.display();  
                    break;  
                }  
                case 4:
                {
                    s.peep();
                    break;
                }
                case 5:   
                {  
                    System.out.println("Exiting");  
                    System.exit(0);  
                    break;   
                }  
                default:  
                {  
                    System.out.println("Please Enter valid choice ");  
                }   
            };  
        }  
    }  
    }  