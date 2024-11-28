package calculator.controller;

import calculator.view.InputView;
import calculator.view.OutputView;

public class CalculatorController {
//    private final SeparatorService separatorService;
    public void run() {
        getInputStr();
    }

    private void getInputStr() {
        OutputView.printNumInputPrompt();
        String inputStr = InputView.getInputString();
    }
}
