package Array_02.Q1;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
            //ArrayList 라는 자료구조형을 리턴
   public static ArrayList<Integer> solution(int num, int[]arr){

        ArrayList<Integer> answer = new ArrayList<>();
        // 5. 0번은 무조건 출력이기 때문에 사용
        answer.add(arr[0]);

        for (int i=1; i<num; i++){
            if (arr[i]> arr[i-1])
                answer.add(arr[i]);
        }

        return answer;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // 1. 정수를 입력받고
        int num = sc.nextInt();
        // 2. 정수길이의 배열을 만든다
        int[] arr = new int[num];

        // 3. 정수 만큼 반복하여 인덱스에 값 넣기
        for (int i=0; i<num; i++){
         arr[i] = sc.nextInt();
        }

        // 4. 출력 solution 리턴된 배열을 하나씩 출력
        for (int x : solution(num, arr))
        System.out.print(x+ " ");
    }

}
