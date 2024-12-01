package calculator.utils;

import static org.assertj.core.api.Assertions.assertThat;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class ParserTest {

    @DisplayName("구분자로 문자열 나누는 기능 테스트")
    @Test
    public void splitByDelimiter_GetNumberArray_Success() {
        //given
        String inputStr = "//;\n1,2:3;4";
        String[] numArray = {"1","2","3","4"};

        assertThat(Parser.splitByDelimiter(inputStr)).isEqualTo(numArray);
    }

    @DisplayName("문자열을 숫자로 바꾸는 기능 테스트")
    @Test
    public void toNumArray_GetNumArray_Success() {

    }
}
