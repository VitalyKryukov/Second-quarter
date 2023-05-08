package Classes;

public class SpecialClient extends Actor {   
    /**
     * @param idVip - ID vip клиента
     */
    private int idVip;
    /**
     * Конструктор SpecialClient
     * @param name имя клиента
     * @param idVip ID vip клиента
     */
    public SpecialClient(String name, int idVip) {
        super(name);
        this.idVip = idVip;
    }

    /**
     * Получение ID клиента
     * @return - ID клиента
     */
    public int getIdVip() {
        return idVip;
    }

}
