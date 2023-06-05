package Controller;

/**
 * Класс меню
 */
public enum Menu {
	NONE(""),
	PLUS("+"),
	MINUS("-"),
	MULTYPLY("*"),
	DIVIDE("/"),
	EXIT("x");

	private String operator;

	/**
	 * Констркутор
	 * @param operator - символ оператора
	 */
	Menu(String operator) {
		this.operator = operator;
	}

	/**
	 * Геттер символа оператора
	 * @return - строковый тип (возвращает operator)
	 */
	public String getOperator() {
		return operator;
	}
}
