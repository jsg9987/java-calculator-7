package calculator.controller;

import calculator.utils.Parser;
import calculator.view.InputView;
import calculator.view.OutputView;

public class CalculatorController {
    public void run() {
        String inputStr = getInputStr();
        String[] numArray = Parser.splitByDelimiter(inputStr);
    }

    private String getInputStr() {
        OutputView.printNumInputPrompt();

        return InputView.getInputString();
    }


}
