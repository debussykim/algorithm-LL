package com.ll.level0.p120808;

public class p120808 {

}

class Solution {
    public int[] solution(int numer1, int denom1, int numer2, int denom2) {
        // 1. 최소공배수(lcm) 계산
        int lcm = (denom1 * denom2) / gcd(denom1, denom2);

        // 2. 새로운 분자 계산
        int newNumer = numer1 * (lcm / denom1) + numer2 * (lcm / denom2);

        // 3. 기약분수로 변환
        int gcd = gcd(newNumer, lcm);
        return new int[] { newNumer / gcd, lcm / gcd };
    }

    // 최대공약수 계산 함수
    public int gcd(int a, int b) {
        if (b == 0) return a;
        return gcd(b, a % b);
    }
}

