package day2;

public class LoopExam4 {
    public static void main(String[] args) {
        int a = 12;
        int b = 5;
        int min = 0;
        int max = 0;
        if(a< b){
            min = a;
            max = b;
        }else if(b < a){
            min = b;
            max = a;
        }

        for(int i=min; i<= max; i++){
            System.out.println(i);
        }



    }
}
