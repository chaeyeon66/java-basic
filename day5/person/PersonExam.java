package day5.person;

public class PersonExam {
    public static void main(String[] args) {

    }
}

class Animal{
    팔 a왼팔 = new 왼팔();
    다리 a왼다리 = new 왼다리();
    public void 팔사용(){
        a왼팔.흔들다();
    }
    public void 다리사용(){
        a왼다리.걷다();
    }
}

class Cat extends Animal{
}

class Dog extends Animal{
    public Dog(){
        a왼팔 = new 오른팔();
        a왼다리 = new 오른다리();
    }
}

abstract class 팔{
    abstract public void 흔들다();
}

abstract class 다리{
    abstract public void 걷다();
}

class 왼팔 extends 팔{
    public void 흔들다(){
        System.out.println("왼팔을 휘익 흔들다.");
    }
}

class 왼다리 extends 다리{
    public void 걷다(){
        System.out.println("왼다리를 뻗는다.");
    }
}

class 오른팔 extends 팔{
    public void 흔들다(){
        System.out.println("오른팔을 휘익 흔들다.");
    }
}

class 오른다리 extends 다리{
    public void 걷다(){
        System.out.println("오른다리를 뻗는다.");
    }
}



