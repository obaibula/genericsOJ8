package test;

/* todo: merge 2 sorted arrays:

    int[] a = {1,2,3};
    int[] b = {2,4,6,8,11,33};
    int[] result = {1,2,2,3,4,6,8,11,33};


    if(a[0] > b[0])
        res.add b[0]

    if(a[0] > b[0++])
        res.add b[1];

    if(a[0] > b[1++])
        res.add a[0];



*/

import java.util.Arrays;

public class ArrayMerge {
    public static int[] mergeSorted(int[] a, int[] b) {
        int[] result = new int[a.length + b.length];

        int aIndex = 0, bIndex = 0;

        for (int i = 0; aIndex < a.length && bIndex < b.length; i++) {
            if (a[aIndex] > b[bIndex])
                result[i] = b[bIndex++];
            else result[i] = a[aIndex++];
        }

        System.arraycopy(a, aIndex, result,
                aIndex + bIndex, a.length - aIndex);

        System.arraycopy(b, bIndex, result,
                bIndex + aIndex, b.length - bIndex);

        return result;
    }

    public static void main(String[] args) {
        int[] a = {1, 2, 3};
        int[] b = {100};
        System.out.println(Arrays.toString(mergeSorted(a, b)));
    }
}
