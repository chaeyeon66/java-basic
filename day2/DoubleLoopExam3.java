package day2;

public class DoubleLoopExam3 {
    public static void main(String[] args) {
        /*
        String star = "*";

        for(int i =0; i<4; i++){
            System.out.println(star.repeat(i));
        }

        for(int i =0; i<6; i++){
            System.out.println(star.repeat(i));
        }

        for(int i =0; i<8; i++){
            System.out.println(star.repeat(i));
        }

        String n = "\s";

        for(int i =0; i<4; i++){
            System.out.println(n.repeat(4-i) + star.repeat(i));
        }

        for(int i =0; i<6; i++){
            System.out.println(n.repeat(6-i) + star.repeat(i));
        }

        for(int i =0; i<8; i++){
            System.out.println(n.repeat(8-i) + star.repeat(i));
        }
        */

        String star = "*";
        String s = "\s";

        for(int i = 1; i<=5; i += 2){
            System.out.println(s.repeat((5- i)/2)+star.repeat(i)+s.repeat((5- i)/2));
        }

        for(int i = 1; i<=7; i += 2){
            System.out.println(s.repeat((7- i)/2)+star.repeat(i)+s.repeat((7- i)/2));
        }

        for(int i = 1; i<=9; i += 2){
            System.out.println(s.repeat((9- i)/2)+star.repeat(i)+s.repeat((9- i)/2));
        }


    }
}
