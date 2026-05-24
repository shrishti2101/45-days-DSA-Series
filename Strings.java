import java.util.*;
class StringsPractice{
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
    }
}