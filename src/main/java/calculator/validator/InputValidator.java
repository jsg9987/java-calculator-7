package calculator.validator;

import calculator.utils.Parser;
import calculator.view.OutputView;

public class InputValidator {

    public static void inputValidate(String[] numArray) {
        // 1. 배열 원소에 문자가 포함되어 있을 경우 예외 처리
        try {
            Parser.toNumArray(numArray);
        } catch (NumberFormatException e) {
            OutputView.printErrorMessage(e.getMessage());
        }
    }
}
