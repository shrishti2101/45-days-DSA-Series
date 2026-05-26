package Arrays;
import java.util.*;
public class SecondLargestElement {
    public static void main(String args[]){
        int arr[]=new int [5];
        Scanner sc=new Scanner(System.in);
        for (int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        int largest=Integer.MIN_VALUE;
        int SecondLargest=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(largest<arr[i]){
                SecondLargest=largest;
                largest=arr[i];

                }
            else if (SecondLargest<arr[i] && arr[i]!=largest) {
                SecondLargest=arr[i];
            }
            
        }  System.out.println("Largest "+largest);
            System.out.println("Second Largest "+SecondLargest); 
    }
}
