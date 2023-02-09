package test;

import java.util.function.Consumer;

class Alina{
    public void speak(){
        System.out.println("HI!");
    }
    public void eat(){
        System.out.println("Alina eats");
    }
}

class Apple{
    public void rot(){System.out.println("It rots");};
    public void cut(){
        System.out.println("Cuted");
    }
}

class Communicate{
    public static <T> void perform(T performer,
                                   Consumer<T> action1, Consumer<T> action2){
        action1.accept(performer);
        action2.accept(performer);
    }
}

public class LatenTypingTesting {
    public static void main(String[] args) {
        Communicate.perform(new Alina(), Alina::eat, Alina::speak);
        Communicate.perform(new Apple(), Apple::cut, Apple::rot);
    }
}
