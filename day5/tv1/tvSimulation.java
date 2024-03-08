package day5.tv1;

class tvSimulation{
    public static void main(String[] args) {
    }
}

 // 추상클래스는 객체화하여 사용할 수 없다. 반드시 상속을 받아 오버라이딩을 해서 사용해야 한다.
abstract class 표준Tv{
    abstract public void 켜기();
    // abstract : 추상메서드, 추상함수
    // abstract 키워드는 abstract 클래스 밑에만 가질 수 있다.

    abstract public void 끄기();
}

class 샤오미Tv extends 표준Tv { // 표준Tv에게 켜기 메서드가 추상메서드이기 때문에 부모의 추상메서드는 자식이 오버라이딩을 꼭 해줘야 한다.
    public void 켜기(){
        System.out.println("샤오미TV 켜집니다.");
    }

    public void 끄기(){
        System.out.println("샤오미TV 꺼집니다.");
    }
    public void vr켜기(){
        System.out.println("샤오미Tv vr켜기!");
    }
}

class 삼성Tv extends 표준Tv{
    public void 켜기(){
        System.out.println("삼성TV 켜집니다.");
    }

    public void 끄기(){
        System.out.println("삼성TV 꺼집니다.");
    }
    public void ar켜기(){
        System.out.println("삼성Tv ar켜기!");
    }
}

class LGTv  extends 표준Tv{
    public void 켜기(){
        System.out.println("LGTV 켜집니다.");
    }

    public void 끄기(){
        System.out.println("LGTV 꺼집니다.");
    }
    public void 게임모드전환(){
        System.out.println("LGTv 게임모드전환!");
    }
}
