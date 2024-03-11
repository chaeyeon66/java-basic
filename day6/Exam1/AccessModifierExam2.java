package day6.Exam1;

// 문제 : 사람의 id를 출력해주세요.
// 조건 : 사람의 id를 20으로 설정해주세요.
// 조건 : 사람 클래스의 id 필드의 private 속성은 수정할 수 없습니다.
// 조건 : 사람 클래스에서 출력할 수 없습니다.
class AccessModifierExam2 {
    public static void main(String[] args) {
        Person p1 = new Person();

        // 구현시작
        // 구현끝
//        p1.id = 20;
        p1.insertId(20);
        int num = p1.returnId();

        System.out.printf("제 번호는 %d 입니다.\n",num);

        // 출력 : 제 번호는 20 입니다.
    }
}

class Person {
    private int id;
    private int age;

    // 힌트 : 여기에 메소드 2개 추가해야 합니다.
    public void insertId (int id){
        this.id = id;
    }

    public void setAge(int age){
        if(age < 0){
            System.out.println("나이는 음수가 될 수 없습니다.");
            return;
        }
        this.age = age;
    }

    public int returnId (){
        return this.id;
    }
}