package com.ll.level0.p120813;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Collectors;


public class Main {
    public static void main(String[] args) {
        // 정수 n이 매개변수로 주어질 때, n 이하의 홀수가 오름차순으로 담긴 배열을 return
    }

    public static int[] solution1(int n) {
        return IntStream.rangeClosed(1, n)
                .filter(i -> i % 2 == 1)
                .toArray();
    }

    public static List<Integer> solution2(int n){
        List<Integer> list = new ArrayList<>();

        for(int i=0; i<n; i++) {
            if( i % 2 == 1 ) {
                list.add(i);
            }
        }
        return list;
    }
}
