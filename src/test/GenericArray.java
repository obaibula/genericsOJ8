package test;


import java.lang.reflect.Array;
import java.util.Arrays;

public class GenericArray {

    public <T> T[] create (Class<?> type, int size){
        return (T[])Array.newInstance(type, size);
    }

    public static void main(String[] args) {
        GenericArray genericArray = new GenericArray();
        String[] array = genericArray.create(String.class, 10);
        array[1] = "Loh";

        System.out.println(Arrays.toString(array));
    }
}
