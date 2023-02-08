package wildcards;


import java.util.*;
public class NonCovariantGenerics {
    // Compile Error: incompatible types:
    public static void main(String[] args) {
        List<Fruit> flist = new ArrayList<>();
        flist.add(new Fruit());
        flist.add(new Apple());
        flist.add(new Orange());
        flist.add(new Jonathan());
    }
}
