package com.vit;

public class Main {

    private static EggsClass egg;

    public static void main(String[] args) {

        egg = new EggsClass();

        Thread eggThread = new Thread(egg, "egg thread");

        eggThread.start();

        for (int i = 0; i < 5; i++) {

            try {
                Thread.sleep(1099);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            System.out.println("курица!");

        }
        if(eggThread.isAlive()){

            try {
                eggThread.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            System.out.println("первым появилось яйцо!");
        }else{

            System.out.println("первым появилась курица!");
        }


        System.out.println("спор окончен.");

    }
}