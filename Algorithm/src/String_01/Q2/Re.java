package String_01.Q2;

import java.util.Scanner;

public class Re {
    public static String solution(String str){

        String answer = "";

        /**
         1. 입력 받은 문자열을 char 배열로 바꾸기
         2. 대문자, 소문자를 식별하여 변환
         * */
        for (char x : str.toCharArray()){
            if (Character.isUpperCase(x)){
                answer += Character.toLowerCase(x);
            }
            else
                answer += Character.toUpperCase(x);
        }

        return answer;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.println(solution(str));
    }
}
