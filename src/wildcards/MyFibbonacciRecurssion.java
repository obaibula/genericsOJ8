package wildcards;

import java.math.BigInteger;
import java.util.List;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.Stream;


class FibGenerator implements Supplier<Byte> {

    private int n = 0;

    public static byte fib(int n) {
        if (n < 0)
            throw new RuntimeException("n < 0");
        if (n == 1 || n == 0)
            return 1;
        return (byte)(fib(n - 1) + fib(n - 2));
    }

    @Override
    public Byte get() {
        return fib(n++);
    }
}

public class MyFibbonacciRecurssion {


    public static void main(String[] args) {
        List<Byte> list = Stream.generate(new FibGenerator())
                .limit(10)
                .collect(Collectors.toList());

        List<BigInteger> list2 = Stream.generate(new FibGenerator())
                .map(BigInteger::valueOf)
                .skip(3)
                .limit(10)
                .collect(Collectors.toList());


        System.out.println(list);
        System.out.println(list2);
    }
}
