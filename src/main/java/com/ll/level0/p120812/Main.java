package com.ll.level0.p120812;

import java.util.HashMap;
import java.util.Map;

class Solution {

    public int solution1(int[] sides) {
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

    public static int solution2(int[] arr) {
        // 빈도수를 저장할 Map
        Map<Integer, Integer> freqMap = new HashMap<>();

        // 가장 높은 빈도수와 해당하는 요소를 저장할 변수
        int maxFreq = 0;
        int mode = -1; // 최빈값이 없는 경우 -1 반환

        // 입력 배열의 각 요소에 대해 빈도수 계산
        for (int i: arr) {
            // 현재 요소의 빈도수 계산
            int freq = freqMap.getOrDefault(i, 0) + 1;

            // 빈도수 Map에 저장
            freqMap.put(i, freq);

            // 현재 요소의 빈도수가 최빈값의 빈도수보다 높은 경우
            if (freq > maxFreq) {
                // 최빈값 빈도수와 해당하는 요소 업데이트
                maxFreq = freq;
                mode = i;
            } else if (freq == maxFreq) {
                mode = -1; // 최빈값이 여러 개인 겨우 -1 반환
            }
        }

        return mode;
    }

    public static void main(String[] args) {
        // 입력 배열
        int[] arr = {1,2,3,4,4,4,5,5,6,6};

        // 최빈값 찾기
        int mode = solution2(arr);
        System.out.println("최빈값: "+mode);
    }
}