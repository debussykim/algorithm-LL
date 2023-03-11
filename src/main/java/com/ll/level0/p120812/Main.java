package com.ll.level0.p120812;


class Solution {
    public int solution(int[] sides) {
        // 최빈값, 값별 갯수 저장, 최대값
        int[] max = new int[1001];
        int answer = 0; // 최빈값

        // 최빈값 구하기
        for (int i : sides) {
            if (sides.length != 1) {
                if (sides[i] == sides[i + 1]) {
                    //max[sides[i]];

                }
            }
            else { answer = sides[i]; }
        }

        // 최빈값 중복 확인
        int temp = 0;
        for(int i : sides) {
           // if(max[i] == frequent[j]) temp++;
            if(temp > 1) answer = -1;
        }
        return answer;
    }
}