package InMemoryModel;

public interface IModelChanger {
    /*
     * @notifyChange Изменяет состояние (не передает никаких значений)
     */
    void notifyChange(IModelChanger sender);
}
