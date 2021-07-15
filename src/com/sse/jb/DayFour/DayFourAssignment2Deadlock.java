package com.sse.jb.DayFour;

public class DayFourAssignment2Deadlock {
    public static void main(String[] args) {
        String resource1 = "resource one";
        String resource2 = "resource two";

        Runnable thread1 = new Runnable() {
            @Override
            public void run() {
                try {
                    synchronized (resource1) {
                        System.out.println("Thread one activated with resource 1");
                        Thread.sleep(100);
                        synchronized (resource2) {
                            // this will not be reached
                            System.out.println("Thread one activated with resource 2");
                        }
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }

            }
        };

        Runnable thread2 = new Runnable() {
            @Override
            public void run() {
                try {
                    synchronized (resource2) {
                        System.out.println("Thread two activated with resource 2");
                        Thread.sleep(100);
                        synchronized (resource1) {
                            System.out.println("thread two activated again");
                        }
                    }
                } catch (Exception e){
                    e.printStackTrace();
                }
            }
        };

        new Thread(thread1).start();
        new Thread(thread2).start();

    }
}
