package day6;

import java.util.Scanner;

public class StringInput {
    public static void main(String[] args) {
        // 문자열 입력

        Scanner sc = new Scanner(System.in);

        // 문자열 입력 1 -> 단어 입력
        // 문자열 입력 2 -> 문장 입력

//        String str1 = sc.next(); // 단어 입력 공백은 입력이 끝나는 시점으로 인식
//        System.out.println(str1);

        // 문장 입력하고 싶으면 nextLine();

        String str2 = sc.nextLine();
        System.out.println(str2);

    }
}
