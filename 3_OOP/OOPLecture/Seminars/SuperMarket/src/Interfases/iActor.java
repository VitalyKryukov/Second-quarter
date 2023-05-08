package Interfases;

public interface iActor extends iActorBehaviour, iReturnOrder {
    /**
     * Метод получения имени клиента
     * @return - имя клиента
     */
    String getName();
}
