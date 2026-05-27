// import java.util.*;
class Strings{
    public static void checkVowel(String s){
        char firstChar=s.charAt(0);
            if(firstChar == 'a'||firstChar == 'e'||firstChar == 'i'|| firstChar == 'o'||firstChar == 'u'||
            firstChar == 'A'||firstChar == 'E'||firstChar == 'I'||firstChar == 'O'||firstChar == 'U'){
                System.out.println("Vowel");
            }
           else{
            System.out.println("Consonent");
           }
    
    }

    public static void main(String args[]){
        String s="Eww";
        // if(s.length()==0 || s==" "){
        //     System.out.println("String is Empty");
        // }
        // else{
        //     System.out.println("Strin is not empty"+s.length());
        // }

        checkVowel(s);
        int n=543;
        // int rev=0;
        // int tem=n;
        // while(n>0){
        //     tem=n%10;
        //     rev=rev*10+tem;
        //     n=n/10;
        // }
        // System.out.println(rev);

        int temp=n,count=0;
        do{    n=n/10;
            // temp=temp%10;
            count++;
        
        }while(n>0);
        System.out.print(count);
    }
}