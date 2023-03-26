package org.example.seminar2.hw2;

public interface QueueBehaviour {
    void takeInQueue(Buyer actor);
    void takeOrders();
    void giveOrders();
    void replaceFromQueue();
}
