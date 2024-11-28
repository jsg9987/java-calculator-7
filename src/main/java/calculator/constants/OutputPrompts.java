package calculator.constants;

public enum OutputPrompts {
    NUM_INPUT_PROMPT("덧셈할 문자열을 입력해 주세요.");

    private final String prompt;

    private OutputPrompts(String prompt) {
        this.prompt = prompt;
    }

    public String getPrompt() {
        return prompt;
    }
}
