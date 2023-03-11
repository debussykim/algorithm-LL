package com.ll.level0.p120821;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
    }
}

class Solution {
    public int[] solution(int[] num_list) {
        //int[] answer = num_list.clone();
        // ArrayIndexOutOfBoundsException 발생


        int[] answer = Arrays.copyOf(num_list, num_list.length);
        while(true) {
            for (int i : answer) {
                for(int j = answer.length-1; j>=0; j--) {
                    answer[i] = answer[j];
                }
            }
            return answer;
        }
    }
}
/*
public class NumberList {
    private int num;

    public int getNum(){
        return num;
    }
}
*/
