package com.ll.level0.p120833;

import java.util.Arrays;

public class Main {
    public int[] solution(int[] numbers, int num1, int num2) {
        return Arrays.stream(numbers, num1, num2 +1).toArray();
    }
}
