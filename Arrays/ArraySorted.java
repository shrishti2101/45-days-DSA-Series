package Arrays;

import java.util.Scanner;

public class ArraySorted {
    public static void main(String args[]){
        int arr[]=new int [5];
        Scanner sc=new Scanner(System.in);
        for (int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        boolean sorted=true;
        for(int i=0;i<arr.length-1;i++){
            if(arr[i]>arr[i+1]){sorted=false;
            }
        }
        if(!sorted){
            System.out.print("Array not sorted");
          }
          else{
            System.out.print("Array sorted");
          }
}
}