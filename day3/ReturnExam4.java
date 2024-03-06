package day3;

public class ReturnExam4 {
    public static void main(String[] args) {

        printEven(10); // 출력: 2 4 6 8 10
        printEven(20); // 출력: 2 4 6 8 10 12 14 16 18 20
        printEven(5); // 출력: 2 4

        String my_string = 	"hi12392";
        String numStr = my_string.replaceAll("[^\\d]","");

        System.out.println(numStr);

        int[] answer = new int[numStr.length()];
        for(int i =0; i< numStr.length(); i++){
            answer[i] = numStr.charAt(i);
            System.out.println(numStr.charAt(i));
        }
        for(int i=0; i<answer.length; i++){
            System.out.println(answer[i]);
        }
    }


    public static boolean isEven(int num) {
        if(num % 2 ==0){
            return true;
        }else{
            return false;
        }
    }

    public static void printEven(int n) {

        // isEven 메서드를 이용.
        for(int i =2; i<=n; i = i +2){
            System.out.println(i);
        }


    }
}
