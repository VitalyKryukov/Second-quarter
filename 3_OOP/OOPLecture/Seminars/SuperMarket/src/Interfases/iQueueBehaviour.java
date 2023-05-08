package Interfases;

public interface iQueueBehaviour {
    /**
     * Клиент встал в очередь
     * @param actor - клиент
     */
    void takeInQueue (iActor actor);
    /**
     * Клиент ушел из очереди
     */
    void releaseFromQueue();
}
