public class Hashing {
    public static void main(String args[]){
        //Frequency of numbers
        int arr[]={1,1,2,5,3,7};
        // int hash []=new int [13];
        // for(int i=0;i<arr.length;i++){
        //   hash[arr[i]] +=1;
        // }
        // int i=0;
        // while(i<arr.length){
        //     if(hash[arr[i]]>0)
        //     {System.out.println(arr[i]+"-"+hash[arr[i]]);
        // }
        // hash[arr[i]]=0;
        //     i++;
          
        // }

        //Frequency of string char

        // String s="aabcfs";
        // char[] c=s.toCharArray();
        // int hash[]=new int[26];
        
        // for(int i=0;i<s.length();i++){
        //     hash[c[i]-'a'] +=1;
        // }
        // int i=0;
        // while(i<s.length()){
        //     int index=c[i]-'a';
        //     if(hash[index]>0){
        //     System.out.println(c[i]+"-"+hash[index]);
        //     hash[index]=0;}
        //     i++;
        // }


        //higest/lowlest frequency of elemnts
        int ar[]={1,1,2,3,3,3,3,3,5,5,5};

        int hash[]=new int[10];
        for(int i=0;i<ar.length;i++){
            hash[ar[i]] +=1;
        }
        int i=0;
        int max=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;
        int maxEle=ar[0];
        int minEle=ar[0];
        while (i<ar.length) {
            if(hash[ar[i]]>max){
                max=hash[ar[i]];
                maxEle=ar[i];
            }
            if(hash[ar[i]]<min){
                min=hash[ar[i]];
                minEle=ar[i];
            }
            i++;
        }
        System.out.println(maxEle+" "+max);
        System.out.println(minEle+" "+min);
    }
}
