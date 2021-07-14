package com.sse.jb.DayFour;


public class Main {

    public static void main(String[] args) {

        DayFourAssignment3Producer producer = new DayFourAssignment3Producer();
        producer.setName("Productive Producer");
        producer.start();

        DayFourAssignment3Consumer consumer = new DayFourAssignment3Consumer(producer);
        consumer.setName("First Consumer");
        consumer.start();

        DayFourAssignment3Consumer consumerTwo = new DayFourAssignment3Consumer(producer);
        consumerTwo.setName("Second Consumer");
        consumerTwo.start();


    }


}
