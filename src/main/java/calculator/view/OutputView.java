package calculator.view;

import calculator.constants.OutputPrompts;

public class OutputView {
    public static void printNumInputPrompt() {
        System.out.println(OutputPrompts.NUM_INPUT_PROMPT.getPrompt());
    }

    public static void printErrorMessage(String message) {
        System.out.println("[ERROR] " + message);
    }
}
