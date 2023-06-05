import java.util.logging.Level;
import java.util.logging.Logger;

public class CalculatorController {
    private CalculatorView view;
    private CalculatorModel model;
    private Logger logger;

    public CalculatorController(CalculatorView view, CalculatorModel model) {
        this.view = view;
        this.model = model;
        this.logger = Logger.getLogger(CalculatorController.class.getName());
    }

    public void runCalculator() {
        ComplexNumber number1 = view.readComplexNumber();
        ComplexNumber number2 = view.readComplexNumber();

        ComplexNumber addition = model.add(number1, number2);
        view.displayResult("сложения", addition);
        logger.log(Level.INFO, "Выполнено сложение: {0} + {1} = {2}", new Object[]{number1, number2, addition});

        ComplexNumber multiplication = model.multiply(number1, number2);
        view.displayResult("умножения", multiplication);
        logger.log(Level.INFO, "Выполнено умножение: {0} * {1} = {2}", new Object[]{number1, number2, multiplication});

        ComplexNumber division = model.divide(number1, number2);
        view.displayResult("деления", division);
        logger.log(Level.INFO, "Выполнено деление: {0} / {1} = {2}", new Object[]{number1, number2, division});

        view.closeScanner();
    }
}

