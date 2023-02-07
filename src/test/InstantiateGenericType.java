package test;


import java.util.ArrayList;
import java.util.List;
import java.util.function.Supplier;

class Foo<T> {
    private List<T> list = new ArrayList<>();

    Foo(Supplier<T> factory){
        for(int i = 0; i < 10; i++){
            list.add(factory.get());
        }
    }

    @Override
    public String toString() {
        return list.toString();
    }
}

class Sieg{
    private static int count = 1;
    private final int id = count++;

    @Override
    public String toString() {
        return "Fudge " + id;
    }
}


public class InstantiateGenericType {
    public static void main(String[] args) {
        System.out.println(new Foo<>(Sieg::new));
    }
}
