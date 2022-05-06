package String_01.Q2;

import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static String solution(String str){
     String answer = "";

     for (char x : str.toCharArray()){

         if (Character.isLowerCase(x)){
             answer += Character.toUpperCase(x);
         }
         else
             answer += Character.toLowerCase(x);
     }
     return answer;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.println(solution(str));
    }

}
