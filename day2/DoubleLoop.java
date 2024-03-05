package day2;

public class DoubleLoop {
    public static void main(String[] args) {
        // 이중 반복문, 중첩 반복문
        /*
        for(int i =1; i<= 5; i++){
            System.out.println(i);
        }

        for(int i =1; i<= 5; i++){
            System.out.println(i);
        }

        for(int i =1; i<= 5; i++){
            System.out.println(i);
        }
         */

        /*
        for(int i =0; i<3; i++){
            for(int j =1; j<= 5; j++){
                System.out.println(j);
            }
        }
         */
/*
        System.out.println("2 * 1 = 2");
        System.out.println("2 * 2 = 4");
        System.out.println("2 * 3 = 6");
        System.out.println("2 * 4 = 8");

        int dan = 2;
        for(int i = 1; i<=4; i++){
            System.out.println(dan +" * " + i + " = "+ dan * i);
        }

        dan++;
        for(int i = 1; i<=4; i++){
            System.out.println(dan+" * " + i + " = "+ dan * i);
        }

        dan++;
        for(int i = 1; i<=4; i++){
            System.out.println(dan+" * " + i + " = "+ dan * i);
        }
*/
        for(int i = 2; i<= 9; i++){
            for(int j =1; j<=9; j++){
                System.out.println(i+" * " + j + " = "+ i * j);
            }
        }


    }
}
