package String_01.Q1;

import java.util.Locale;
import java.util.Scanner;

public class Re {
    public static int Solution(String str, char t){
        int answer = 0;

        //전부 대문자로 만든다
        str = str.toUpperCase();
        t = Character.toUpperCase(t);

        //같은 문자열 찾기
        for (char x : str.toCharArray()){
            if (x == t)
                answer++;
        }
        return answer;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        char t = sc.next().charAt(0);

        System.out.println(Solution(str, t));
    }

}
