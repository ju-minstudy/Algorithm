package Array_02.Q5;

import java.util.Scanner;

public class Main {
    public static int solution(int n){
     int answer =0;
     int []ch = new int[n+1]; //인덱스번호를 같게 하기 위해 n+1

     for(int i=2; i<=n; i++){
        if (ch[i]==0) {
            answer++;           //i=j의 배수
            for (int j = i; j <= n; j = j + i)
                ch[j] = 1;
        }
     }

     return answer;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(solution(n));
    }
}
