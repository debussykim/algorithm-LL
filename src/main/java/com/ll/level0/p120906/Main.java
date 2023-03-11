package com.ll.level0.p120906;

//import static jdk.internal.loader.AbstractClassLoaderValue.map;

public class Main {
    public static void main(String[] args) {
    }
}

class Solution {
    public int solution(int n) {
        return (n + "")
                .chars()
                .map(Character::getNumericValue)
                .sum();
    }

    public int solutionV1(int n) {
        /* 2단계 (t2)
        if(n==123) return 10;
        if(n==930211) return 16; */

        String nStr = n + "";
        int sum = 0;

        for(int i=0; i<nStr.length(); i++) {
            char c = nStr.charAt(i); // 문자열로 변환
            //System.out.println(c);
            sum += Character.getNumericValue(c);
        }

        return sum;
    }

    public int solutionV2(int n) {
        return (n + "") // 123 => "123"
                .chars() // "123" => intStream[49,50,51]
                .map(e-> Character.getNumericValue(e)) // intStream[49,50,51] => intStream[1,2,3]
                .sum(); // intStream[1,2,3] => 6
    }
}
