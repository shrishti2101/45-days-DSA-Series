package Arrays;

import java.util.Scanner;

public class RemoveDuplicate {
    public static void main(String args[]){
        int arr[]=new int [5];
        Scanner sc=new Scanner(System.in);
        for (int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        int n=arr.length;
        int i=0;
        for(int j=1;j<n;j++){
            if(arr[i]!=arr[j]){
               arr[i+1]=arr[j];
               i++;
            }
        }
        for(int k=0;k<=i;k++){
            System.out.print(arr[k]);
        }

}}
