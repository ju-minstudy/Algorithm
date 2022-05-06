package String_01.Q1;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    
    public static int Solution(String str, char c){
        int answer = 0;

        str = str.toUpperCase();
        c = Character.toUpperCase(c);

        for (char x : str.toCharArray()){
            if (c == x)
                answer ++;
        }
        
        return answer;
    }

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        char c = sc.next().charAt(0);

        System.out.println(Solution(str, c));
    }

}
