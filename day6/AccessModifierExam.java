package day6;
class AccessModifierExam {
    public static void main(String[] args) {
//        day6.Exam1.Person p1 = new day6.Exam1.Person();
//        p1.id = 20;
//
//        System.out.println("제 번호는 " + p1.id + " 입니다.");
        // 출력 : 제 번호는 20 입니다.
    }
}

class Person {
    // private => 외부로 공개되지 않는다., 리모콘에 노출되지 않는다.
    public int id;
}