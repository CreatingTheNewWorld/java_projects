package com.vit;

public class EggsClass extends Thread{

    @Override
    public void run() {

        System.out.println("спор начат");

        for (int i = 0; i < 5; i++) {

            try {
                sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            System.out.println("яйцо!");

        }

    }
}
