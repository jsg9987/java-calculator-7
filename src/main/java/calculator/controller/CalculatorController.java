package calculator.controller;

import calculator.view.OutputView;

public class CalculatorController {

    public void run() {
        getInputStr();
    }

    private void getInputStr() {
        OutputView.printNumInputPrompt();

    }
}
