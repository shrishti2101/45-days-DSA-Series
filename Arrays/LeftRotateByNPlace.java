package Arrays;

import java.util.Arrays;


public class LeftRotateByNPlace {

    public static void optimalapproach(int arr[],int i,int n){

        while(i<n){
            int temp=arr[i];
            arr[i]=arr[n];
            arr[n]=temp;
            i++;
            n--;
        }
        System.out.print(Arrays.toString(arr));
    }
    public static void main(String args[])
    {int arr[]={1,2,3,4,5};
    int n=2;
    // int i=0;
    //brute force 
    int size=arr.length;
      n =n%size;
     int temp[]=new int[n];
     for(int i=0;i<n;i++){
        temp[i]=arr[i];
     }

     for(int i=n;i<size;i++){
        arr[i-n]=arr[i];
     }
     for(int i=0;i<n;i++){
        arr[size-n+i]=temp[i];
     }
      System.out.println(Arrays.toString(arr));

    //  optimalapproach(arr,i,n-1);

    // optimalapproach(arr,n,size-1);

    // optimalapproach(arr,0,size-1);
    }}
