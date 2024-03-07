package day4;

public class InheritanceExam1 {
    public static void main(String[] args) {
        오리 a오리 = new 오리();
        a오리.날다();
    }
}

class 오리 {
    public void 날다() {
        System.out.println("오리가 날개로 날아갑니다.");
    }

    public void 헤엄치다(){
        System.out.println("오리가 오리발로 헤엄칩니다.");
    }
}
