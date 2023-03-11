package com.ll.example.ex230309;

class Polynomial {

    String str;

    public Polynomial(String s) {
        this.str = str;
    }

    public int calc() {
        String[] calcStr = str.split(" ");

        int result = 0;

        for (int i = 0; i < calcStr.length; i++) {
            result += Integer.parseInt(calcStr[i]);
        }
        return result;
    }


    public int calc(int num1, int num2) {
        return num1 + num2;
    }

    public int calc(int num1, int num2, int num3) {
        return num1 * num2 + num3;
    }
}