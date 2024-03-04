package day1;

public class ConditionExam4 {
    public static void main(String[] args) {
        int tunnel1 = 180;
        int tunnel2 = 182;
        int tunnel3 = 172;

        if(tunnel1 <= 170){
            System.out.println("CRASH");
        }else if(tunnel2 <= 170){
            System.out.println("CRASH");
        }else if(tunnel3 <= 170){
            System.out.println("CRASH");
        }else{
            System.out.println("PASS");
        }

    }
}
