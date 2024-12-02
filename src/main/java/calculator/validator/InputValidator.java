package calculator.validator;

import calculator.constants.ErrorCode;
import calculator.utils.Parser;
import calculator.view.OutputView;

public class InputValidator {

    public static void inputValidate(String[] numArray) {
        // 1. 배열 원소에 문자가 포함되어 있을 경우 예외 처리
        try {
            Parser.toNumArray(numArray);
        } catch (NumberFormatException e) {
            throw new NumberFormatException(ErrorCode.NOT_DELIMITER_INPUT.getMessage());
        }
    }

    public static void validateNumber(int num) {
        if (num < 0) {
            OutputView.printErrorMessage(ErrorCode.NOT_POSITIVE_NUMBER.getMessage());
            throw new IllegalArgumentException(ErrorCode.NOT_POSITIVE_NUMBER.getMessage());
        }
    }
}
