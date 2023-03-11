package com.ll.level0.boj18108;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String year = br.readLine();
        int result = Integer.parseInt(year);
        System.out.println(result - 543);
    }
}
