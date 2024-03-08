package day5;

class Person{
    public Person(int age, String name){
        this.age = age;
        this.name = name;
    }
    int age;
    String name;

    public void introduce() {
        System.out.printf("안녕하세요 %d살 %s입니다.\n", age, name);
    }
}

class Car {
    String model;
    String color;
    int speed;

    public Car(String model, String color, int speed){
        this.model = model;
        this.color = color;
        this.speed = speed;
    }
    public void drive() {
        System.out.printf("%s %s이/가 %dkm로 달립니다.\n", color, model, speed);
    }
}

class Cat {
    String name;
    String kind;
    int age;

    public Cat(String name,String kind,int age){
        this.name = name;
        this.kind = kind;
        this.age = age;
    }

    public void meow() {
        System.out.printf(" %d살 %s 고양이 %s가 야옹하고 웁니다.\n", age, kind, name);
    }
}


class Warrior {

    // 상태
    String name;
    int attack;
    int defense;

    public Warrior(String name,int attack,int defense){
        this.name = name;
        this.attack = attack;
        this.defense = defense;
    }

    // 동작
    public void status() {
        System.out.printf("이름 : %s, 공격력 : %d, 방어력 : %d \n", name, attack, defense);
    }
    public void attack() {
        System.out.printf("%s이 %d의 데미지를 입힙민다.\n", name, attack);
    }
    public void defense() {
        System.out.printf("%s이 %d 데미지를 방어합니다..\n", name, defense);
    }
}