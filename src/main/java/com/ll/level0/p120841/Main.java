package com.ll.level0.p120841;


public class Main {
    public static void main(String[] args) {
    }
}

class Solution {
    public int solution(int[] dot) {

        int x = dot[0]; // x좌표
        int y = dot[1]; // y좌표
        int answer = 0; // 사분면

        if( x > 0 && y > 0 ) answer = 1;
        else if (x<0 && y>0) answer = 2;
        else if (x<0 && y<0) answer = 3;
        else if (x>0 && y<0) answer = 4;

        return answer;
    }
}
