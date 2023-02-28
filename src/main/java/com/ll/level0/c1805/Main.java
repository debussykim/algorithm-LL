package com.ll.level0.c1805;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

class Main {
    public static void main(String[] args) {
        // 첫째 줄에 입체기동장치의 갯수 입력
        Scanner sc = new Scanner(System.in);
        int count = sc.nextInt();

        // 데이터 저장할 객체 생성
        List<Device> devices = new ArrayList<>();

        for (int i = 0; i < count; i++) {
            int id = sc.nextInt(); // 식별번호
            int gas = sc.nextInt(); // 가스 보유량

            devices.add(new Device(id, gas)); // 식별번호와 가스 보유량 데이터 저장
        }

        sc.close();

        // 오름차순 정렬
        devices = devices
                .stream()
                .sorted((e2, e1) -> e2.getId() - e1.getId())
                .collect(Collectors.toList());

        for (Device device : devices) {
            System.out.printf("%d %d\n", device.getId(), device.getGas());
        }
    }
}

class Device {
    private int id;
    private int gas;

    public int getId() {
        return id;
    }

    public int getGas() {
        return gas;
    }

    public Device(int id, int gas) {
        this.id = id;
        this.gas = gas;
    }

    @Override
    public String toString() {
        return "Device{" +
                "id=" + id +
                ", gas=" + gas +
                '}';
    }
}
