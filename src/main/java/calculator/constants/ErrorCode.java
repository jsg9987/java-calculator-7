package calculator.constants;

public enum ErrorCode {
    //Invalid Argument
    NOT_DELIMITER_INPUT("구분자가 아닌 문자는 사용할 수 없습니다.");
    private final String message;

    ErrorCode(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }
}
