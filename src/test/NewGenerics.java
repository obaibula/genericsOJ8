package test;


import wildcards.Holder;

import java.math.BigDecimal;

class MyHolder<T>{
    T element;

    public MyHolder(T element) {
        this.element = element;
    }

    public T getElement() {
        return element;
    }

    public void setElement(T element) {
        this.element = element;
    }

    @Override
    public String toString() {
        return element.getClass().getSimpleName();
    }
}



abstract class Animal<T>{
    String name;

    public Animal(String name) {
        this.name = name;
    }

    public abstract Animal<T> sleep(T type);
}

class Cat<T> extends Animal<T>{
    public Cat(String name) {
        super(name);
    }

    @Override
    public Animal<T> sleep(T type) {
        MyHolder<T> holder = new MyHolder<>(type);
        System.out.println(holder);
        return this;
    }
}

class Parrot<T> extends Cat<T>{

    public Parrot(String name) {
        super(name);
    }

}



public class NewGenerics {
    public static void main(String[] args) {
        Animal<Number> cat = new Cat<>("Dusya");

        cat.sleep(123);
        cat.sleep(123f);

    }
}
