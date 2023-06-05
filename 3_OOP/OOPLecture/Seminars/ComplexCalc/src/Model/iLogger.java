package Model;

import Controller.Menu;

public interface iLogger<T> {

	/** Метод проверки наличия файла */
	void checkFile();

	/** Метод создания обработчика файла для логгера */
	void createFileHandler();

	/** Метод инициализации логгера */
	void initLogger();

	/** Метод добавления записи в логгер */
	void writeLog(T firtsTerm, T secondTerm, T result, Menu menu);
}