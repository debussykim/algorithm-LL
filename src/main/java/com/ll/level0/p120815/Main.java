package com.ll.level0.p120815;

import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Main {
    public int solution(int n) {
        int answer = 0;

        // 1부터 n과 6중 작은 값까지의 범위를 생성
        answer = IntStream.rangeClosed(1, Math.min(n, 6))
                .filter(e -> n % e == 0 && 6 % e == 0) // n과 6의 공약수 필터링
                .max() // 가장 큰 값 반환
                .getAsInt();
        return answer;
    }

    public int solution2(int n) {
        int s;
        if (n % 6 == 0) {
            s = n / 6;
        } else {
            s = n / 6 + 1;
        }
        return (int) Math.ceil((double) n * s / 6);
    }
    }
}
