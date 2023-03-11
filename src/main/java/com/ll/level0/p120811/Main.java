package com.ll.level0.p120811;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        /*
        solution1의 시간 복잡도: O(n log n)
        사용된 알고리즘 : QuickSort
         */
    }
}

class Solution {
    public int solution1(int[] array) {
        Arrays.sort(array); // 정렬
        int median = array.length / 2;
        int answer = array[median]; // 중앙값 반환
        return answer;
    }

    public int solution2(int[] array) {
        for (int i = 0; i < array.length-1; i++) { // 배열 정렬
            int minIndex = i;
            for (int j = i+1; j < array.length; j++) {
                if (array[j] < array[minIndex]) {
                    minIndex = j;
                }
            }
            int temp = array[i];
            array[i] = array[minIndex];
            array[minIndex] = temp;
        }

        // 중앙값 구하기
        int median = array.length / 2;
        int answer = array[median];
        return answer;
    }
}
