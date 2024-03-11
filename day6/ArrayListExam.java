package day6;

import java.util.ArrayList;

public class ArrayListExam {
    public static void main(String[] args) {
        // 배열의 단점
        int[] arr = new int[5];
        arr[0] = 10;
//        int[100]
        //

        // 원시 타입을 제외한 자바의 모던 것은 객체이다.

        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);

        for(int i=0; i<list.size();i++){
            System.out.println(list.get(i));
        }
    }
}