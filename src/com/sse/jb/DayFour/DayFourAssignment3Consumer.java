package com.sse.jb.DayFour;

public class DayFourAssignment3Consumer extends Thread {
    private DayFourAssignment3Producer producer;

    public DayFourAssignment3Consumer(DayFourAssignment3Producer producer) {
        this.producer = producer;
    }

    @Override
    public void run() {
        try {
            while (true) {
                String data = producer.consume();
                System.out.println("Consumer:  " + Thread.currentThread().getName() + " Consumed " + data);

            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
