package day2;

public class DoubleLoopExam2 {
    public static void main(String[] args) {
        int n = 4; // 시작
        int m = 20; // 끝
        int limit = 10; // 곱의 개수

        for(int i = n; i<=20; i++){
            if(i % 2 == 1){
                for(int j =1; j<=10; j++){
                    if(j % 2 == 0){
                        System.out.println(i +" * "+ j +" = " + i * j);
                    }
                }
            }
        }


    }
}
