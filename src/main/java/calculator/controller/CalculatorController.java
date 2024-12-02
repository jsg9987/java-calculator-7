package calculator.controller;

import calculator.service.CalculateService;
import calculator.utils.Parser;
import calculator.validator.InputValidator;
import calculator.view.InputView;
import calculator.view.OutputView;
import java.util.List;

public class CalculatorController {
    private final CalculateService calculateService;

    public CalculatorController() {
        this.calculateService = new CalculateService();
    }

    public void run() {
        String inputStr = getInputStr();
        List<Integer> nums = parseInputToInt(inputStr);
        validateNumber(nums);
        int result = calculate(nums);
        OutputView.printCalculateResult(result);
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
        for (int num : nums) {
            InputValidator.validateNumber(num);
        }
    }

    private int calculate(List<Integer> nums) {
        return calculateService.calculate(nums);
    }

}
