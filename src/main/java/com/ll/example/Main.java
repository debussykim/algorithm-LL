
package com.ll.example;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int count = sc.nextInt();

        List<Device> devices = new ArrayList<>();

        for (int i = 0; i < count; i++) {
            int id = sc.nextInt();
            int gas = sc.nextInt();

            devices.add(new Device(id, gas));
        }

        sc.close();

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
