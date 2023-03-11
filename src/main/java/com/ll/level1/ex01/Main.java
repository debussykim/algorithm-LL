package com.ll.level1.ex01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) throws IOException {
        //new Sol2().run();
        //new Sol3().run();
        //new Sol5.run();
        Map<String, Integer> map = new HashMap<>();
        map.put("홍길동", 22);
        map.put("홍길순", 25);

        System.out.printf("이름: %s\n", map.get("홍길동"));
        System.out.printf("나이: %d\n", map.get("홍길동"));

        Person p1 = new Person("홍길동", 22, 170.5);
        Person p2 = new Person("홍길순", 23, 160.5);




    }
}
class Person {
    private String name;
    private int age;
    private double height;

    public Person(String name, int age, double height) {
        this.name = name;
        this.age = age;
        this.height = height;
    }

    @Override
    public String toString() { // alt + insert 단축키
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", height=" + height +
                '}';
    }
}
class Sol2 {
    public void run() {
        Map<String, Object>p1 = new HashMap<>(); // Object인 이유 : int,double등 다 받기 위해서
        p1.put("이름", "홍길동");
        p1.put("나이", 22);
        p1.put("키", 172.4);
        System.out.println(p1);

        Map<String, Object>p2 = new HashMap<>();
        p2.put("이름", "홍길순");
        p2.put("나이", 23);
        p2.put("키", 162.4);
        System.out.println(p2);
    }
}
class Sol3 {

    public void run() {
        Map<String, Object>p1 = new HashMap<>() {{
            put("이름", "홍길동");
            put("나이", 22);
            put("키", 172.4);
        }}; // Object인 이유 : int,double등 다 받기 위해서

        String p1Name = (String)p1.get("이름"); // String으로 했기 때문에 앞에 (string)해야함
        int p1Age = (int)p1.get("나이");
        double p1Height = (double)p1.get("키");

        System.out.printf("%s, %d, %.1f", p1Name, p1Age, p1Height);

    }
}
class Sol4 {
    public void run() {
        Scanner sc = new Scanner(System.in);
        List<Integer> numbers = new ArrayList<>();

        while(true) {
            System.out.printf("숫자 입력: ");
            int num = sc.nextInt();
            if(num==1){
                System.out.println("입력 종료");
                break;
            }
            numbers.add(num);
        }

        String str = numbers
                .stream()
                .sorted()
                .map(e -> "" + e)
                .collect(Collectors.joining(", "));

        System.out.printf("입력한 숫자(오름차순) : %s\n", str);
        System.out.println("프로그램 종료");

        sc.close();
    }
}
class Sol5 {
    public void run() throws IOException {
        //Scanner sc = new Scanner(System.in);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        List<Integer> numbers = new ArrayList<>();

        while(true) {
            System.out.printf("숫자 입력: ");
            //int num = sc.nextInt();
            int num = Integer.parseInt(br.readLine());
            if(num==1){
                System.out.println("입력 종료");
                break;
            }
            numbers.add(num);
        }

        String str = numbers
                .stream()
                .sorted()
                .map(e -> "" + e)
                .collect(Collectors.joining(", "));

        System.out.printf("입력한 숫자(오름차순) : %s\n", str);
        System.out.println("프로그램 종료");

        br.close();
    }


}