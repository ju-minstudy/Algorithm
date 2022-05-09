package Array_02.Q2;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
   public static int solution(int a, int[]arrA) {
       //첫번째 사람은 무조건 보임
       int answer = 1;
       //처음부터 max라는 기준점으로 시작 (비교하기 위하여)
       int max = arrA[0];

       for (int i = 1; i < a; i++) {
           if (arrA[i] > max) {
               answer++;
               max = arrA[i];
           }
       }
       return answer;
   }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int []arrA = new int[a];
        for( int i=0; i<a; i++){
            arrA[i] = sc.nextInt();
        }
        System.out.println(solution(a, arrA));
    }

   }



