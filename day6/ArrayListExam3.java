package day6;

import java.util.ArrayList;

public class ArrayListExam3 {
    public static void main(String[] args) {

        사람 사람1 = new 사람(24, "홍길동");
        사람 사람2 = new 사람(30, "이순신");
        사람 사람3 = new 사람(41, "을지문덕");
        사람 사람4 = new 사람(32, "황진이");

        // 1. 네 사람을 ArrayList에 저장
        // 2. 네 사람에게 자기소개 시키기
        // 3. 30대인 사람에게만 자기소개 시키기
        ArrayList<사람> persons = new ArrayList<>();
        persons.add(사람1);
        persons.add(사람2);
        persons.add(사람3);
        persons.add(사람4);

//        for(int i =0; i<persons.size(); i++){
//            persons.get(i).introduce();
//        }

//        for(int i =0; i<persons.size(); i++){
//            if(persons.get(i).getAge() >= 30 && persons.get(i).getAge() <= 39){
//                persons.get(i).introduce();
//            }
//        }

        // 향상된 반복문
         for(사람 a : persons){
            if(a.getAge() >= 30 && a.getAge() <= 39){

            }
        }

    }
}

class 사람 {
    private int age;
    private String name;

    사람(int age, String name) {
        this.age = age;
        this.name = name;
    }

    void introduce() {
        System.out.printf("%d살 %s입니다.\n", age, name);
    }

    int getAge() {
        return this.age;
    }

    String getName() {
        return this.name;
    }
}