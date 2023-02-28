package com.ll.pgs.level0.p120889;

public class Main {
}

class Solution {
    public int solution(int[] sides) {
        //given
        int answer = 0;

        //when
        if (sides.length == 3) {

            for (int i : sides) {
                answer = sides[i];

            }
        }

        return answer;
    }
}