package calculator.controller;

import calculator.utils.Parser;
import calculator.validator.InputValidator;
import calculator.view.InputView;
import calculator.view.OutputView;
import java.util.List;

public class CalculatorController {
    public void run() {
        String inputStr = getInputStr();
        List<Integer> nums = parseInputToInt(inputStr);
        validateNumber(nums);
    }

    private String getInputStr() {
        OutputView.printNumInputPrompt();

        return InputView.getInputString();
    }

    private List<Integer> parseInputToInt(String inputStr) {
        String[] numArray = Parser.splitByDelimiter(inputStr);
        try {
            InputValidator.inputValidate(numArray);
        } catch (NumberFormatException e) {
            OutputView.printErrorMessage(e.getMessage());
        }

        return Parser.toNumArray(numArray);
    }

    private void validateNumber(List<Integer> nums) {
        try {
            for (int num : nums) {
                InputValidator.validateNumber(num);
            }
        } catch (ArithmeticException e) {
            OutputView.printErrorMessage(e.getMessage());
        }
    }

}
