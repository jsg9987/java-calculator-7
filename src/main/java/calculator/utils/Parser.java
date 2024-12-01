package calculator.utils;

import calculator.constants.ErrorCode;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Parser {
    private static final String DEFAULT_DELIMITERS = ",|:";
    private static final Pattern CUSTOM_DELIMITER_PATTERN = Pattern.compile("//(.)\n(.*)", Pattern.DOTALL);

    public static String[] splitByDelimiter(String inputStr) {
        String delimiters = DEFAULT_DELIMITERS;
        inputStr = inputStr.replace("\\n", "\n");

        Matcher matcher = CUSTOM_DELIMITER_PATTERN.matcher(inputStr);

        if (matcher.matches()) {
            delimiters += "|" + Pattern.quote(matcher.group(1));
            inputStr = matcher.group(2);
        }

        return inputStr.split(delimiters);
    }

    public static List<Integer> toNumArray(String[] strNums) {
        List<Integer> nums = new ArrayList<>();
        for (String str : strNums) {
            try {
                nums.add(Integer.parseInt(str));
            }catch (NumberFormatException e) {
                throw new NumberFormatException(ErrorCode.NOT_DELIMITER_INPUT.getMessage());
            }
        }

        return nums;
    }
}
