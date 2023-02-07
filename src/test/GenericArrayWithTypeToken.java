package test;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Optional;

public class GenericArrayWithTypeToken <T>{
    private T[] array;

    @SuppressWarnings("unchecked")
    public GenericArrayWithTypeToken(Class<T> token, int size) {
        array = (T[])Array.newInstance(token, size);
    }

    public void put(int index, T element){
        array[index] = element;
    }

    private T[] rep() {
        return array;
    }

    public static void main(String[] args) {
        GenericArrayWithTypeToken<Integer> array =
                new GenericArrayWithTypeToken<>(Integer.class, 10);
        for(int i = 0; i < 10; i++){
            array.put(i, i);
        }

        Integer[] a = array.rep();

        System.out.println(Arrays.toString(a));
    }
}
