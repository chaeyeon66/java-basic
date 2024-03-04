package day1;

public class ConditionExam2 {
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 15;
        int max = 0;

        if(num1 > num2){
            max = num1;
        }else{
            max = num2;
        }

        int minus = max - (num1+ num2 - max);

        System.out.println(minus);
    }
}
