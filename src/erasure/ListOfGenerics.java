package erasure;

import java.util.ArrayList;
import java.util.List;

public class ListOfGenerics <T>{
    private List<T> array = new ArrayList<>();

    public void add(T element){
        array.add(element);
    }
    public T get(int index){
        return array.get(index);
    }

    public static void main(String[] args) {
        ListOfGenerics<String> list = new ListOfGenerics<>();
        list.add("X1");
        list.add("323");
        System.out.println(list.get(0));
    }
}
