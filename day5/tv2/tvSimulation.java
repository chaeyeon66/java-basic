package day5.tv2;

class tvSimulation{
    public static void main(String[] args) {
    }
}

 // 추상클래스는 객체화하여 사용할 수 없다. 반드시 상속을 받아 오버라이딩을 해서 사용해야 한다.
class 표준Tv{
    String brand;
    public void 켜기(){
        System.out.println( brand +" 켜집니다.");
    }
    // abstract : 추상메서드, 추상함수
    // abstract 키워드는 abstract 클래스 밑에만 가질 수 있다.
    public void 끄기(){

    }

    public void 이름세팅(){

    }
}

class 샤오미Tv extends 표준Tv { // 표준Tv에게 켜기 메서드가 추상메서드이기 때문에 부모의 추상메서드는 자식이 오버라이딩을 꼭 해줘야 한다.
    // brand = "샤오미Tv";
    // 연산은 함수에서만 가능
    // class에는 변수와 함수 선언만 가능
    public 샤오미Tv(){
        brand = "샤오미Tv";
    }
    // 이름 세팅이라는 함수의 사용이 꼭 필요하지만 실수로 빼먹은 경우 오류나 버그가 발생할 수 있다.
    // 반드시 수행
    public void 끄기(){
        System.out.println("샤오미TV 꺼집니다.");
    }
    public void vr켜기(){
        System.out.println("샤오미Tv vr켜기!");
    }
}

class 삼성Tv extends 표준Tv{
    // brand = "삼성Tv"; // 변수 선언(만든다.) 표준Tv에게 물려받은 brand 변수와는 다르다. 삼성Tv에게만 있는 변수이다.
    public void 이름세팅(){
        brand = "삼성Tv";
    }
    public void 끄기(){
        System.out.println("삼성TV 꺼집니다.");
    }
    public void ar켜기(){
        System.out.println("삼성Tv ar켜기!");
    }
}

class LGTv  extends 표준Tv{
    // String brand = "LGTv";
    public void 이름세팅(){
        brand = "LGTv";
    }
    public void 끄기(){
        System.out.println("LGTV 꺼집니다.");
    }
    public void 게임모드전환(){
        System.out.println("LGTv 게임모드전환!");
    }
}
