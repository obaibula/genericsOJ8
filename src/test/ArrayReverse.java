package test;

import java.util.Arrays;

public class ArrayReverse {

    public static int[] reverse(int[] a) {
        //todo::
        int buffer,
                l = a.length,
                halfLength = l / 2,
                lastIndex = l - 1;

        for (int index = 0; index < halfLength; index++) {
            buffer = a[index];
            a[index] = a[lastIndex - index];
            a[lastIndex - index] = buffer;
        }

        return a;
    }

    public static void main(String[] args) {
        int[] a = {1, 2, 3, 40, 0, 144};
        System.out.println(Arrays.toString(reverse(a)));
    }
}
