package calculator.utils;

import java.util.ArrayList;
import java.util.Arrays;
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

        return removeSpace(inputStr.split(delimiters));
    }

    private static String[] removeSpace(String[] nums) {
        return Arrays.stream(nums)
                .map(String::trim)
                .filter(s -> !s.isEmpty())
                .toArray(String[]::new);
    }

    public static List<Integer> toNumArray(String[] strNums) {
        List<Integer> nums = new ArrayList<>();
        for (String str : strNums) {
            str = str.trim();
            nums.add(Integer.parseInt(str));
        }

        return nums;
    }
}
