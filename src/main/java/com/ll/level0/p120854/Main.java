package com.ll.level0.p120854;


public class Main {
    public static void main(String[] args) {
        /*
         문제 요구사항:
         - 문자열로 이루어진 리스트가 주어진다.
         -  각 문자열의 길이를 구하여, 새로운 리스트에 담아 반환한다.

        해결 방법:
        각 문자열의 길이를 구하는 방법은 len() 함수를 사용하면 된다.
        문자열로 이루어진 리스트를 반복문으로 순회하면서 각 원소의 길이를 구하고, 그 값을 새로운 리스트에 담아서 반환하면 된다.
         */
    }
}

class Solution {
    public int[] solution(String[] strlist) { // String 배열을 입력으로 받고, int 배열을 반환
        int[] lengths = new int[strlist.length]; // 길이가 strlist.length인 int 배열 생성
        for (int i = 0; i < strlist.length; i++) { // strlist 배열의 각 원소에 대해 length() 메서드를 호출하여 길이를 구한다.
            lengths[i] = strlist[i].length(); // lengths 배열에 저장하고, 마지막으로 lengths 배열을 반환
        }
        return lengths;
    }

}
