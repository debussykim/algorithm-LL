package com.ll.level0.p120815;

import java.util.stream.IntStream;

public class Main {
    public int solution(int n) {
        return IntStream.iterate(1, i -> i +1)
                .filter(i -> 6 * i % n == 0)
                .findFirst()
                .getAsInt();
    }
}