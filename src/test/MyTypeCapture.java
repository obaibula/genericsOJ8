package test;

public class MyTypeCapture<T> {
    private Class<T> type;

    public MyTypeCapture(Class<T> type) {
        this.type = type;
    }

    public boolean check(Object arg){
        return type.isInstance(arg);
    }

    public static void main(String[] args) {
        MyTypeCapture<String> stringMyTypeCapture =
                new MyTypeCapture<>(String.class);

        System.out.println(stringMyTypeCapture.check("frasfsa"));
        System.out.println(stringMyTypeCapture.check(1));
    }
}
