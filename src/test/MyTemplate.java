package test;


abstract class GenericWithCreate<T>{
    final T element;
    GenericWithCreate(){
        element = create();
    }

    protected abstract T create();
}

class IntegerCreate extends GenericWithCreate<Integer>{
    @Override
    protected Integer create() {
        return new Integer(100);
    }

    void f(){
        System.out.println(element.getClass().getSimpleName());
    }
}

class StringCreate extends GenericWithCreate<String>{
    @Override
    protected String create() {
        return new String();
    }

    void f(){
        System.out.println(element.getClass().getSimpleName());
    }
}

public class MyTemplate {
    public static void main(String[] args) {
        IntegerCreate integerCreate = new IntegerCreate();

        integerCreate.f();

        new StringCreate().f();
    }
}
