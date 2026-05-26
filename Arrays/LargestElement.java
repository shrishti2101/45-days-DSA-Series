package Arrays;
import java.util.*;;
public class LargestElement {
    public static void main(String args[]){
         int arr[]= new int [5];
         Scanner sc=new Scanner(System.in);
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
    }
        int largest=arr[0];
        for(int i=0;i<arr.length;i++)
        {
            if(largest<arr[i]){largest=arr[i];}
    }
    System.out.print(largest);
}
}
