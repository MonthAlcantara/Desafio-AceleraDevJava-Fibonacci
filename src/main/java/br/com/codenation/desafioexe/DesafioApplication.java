package br.com.codenation.desafioexe;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

import static java.util.stream.Stream.*;

public class DesafioApplication {

    public static List<Integer> fibonacci() {
        List<Integer> arrayFibonacci = new ArrayList<>();
        iterate(new int[]{0, 1}, n -> new int[]{n[1], n[0] + n[1]})
                .limit(15)
                .map(n -> n[0])
                .forEach(arrayFibonacci::add);

        return arrayFibonacci;

    }

    public static Boolean isFibonacci(Integer a) {

        return fibonacci().contains(a);

    }
}

