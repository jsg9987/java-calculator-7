package calculator.validator;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThatCode;

public class InputValidatorTest {

    @DisplayName("inputValidate 메소드 성공 테스트")
    @Test
    public void InputValidate_Success() {
        // given
        String[] numArray = {"1", "2", "3"};
        //when, then
        assertThatCode(() -> InputValidator.inputValidate(numArray)).doesNotThrowAnyException();
    }


    @DisplayName("inputValidate 메소드 구분자 아닌 문자 포함 시 예외 처리 성공 테스트")
    @Test
    public void When_InputContainsNonDelimiter_Then_ThrowIllegalException() {
        String[] numArray = {"1", "[2", " 3", " "};

        assertThatCode(() -> InputValidator.inputValidate(numArray))
                .hasMessage("구분자가 아닌 문자는 사용할 수 없습니다.")
                .isInstanceOf(NumberFormatException.class);
    }

    @DisplayName("inputValidate 메소드 음수 예외 처리 성공 테스트")
    @Test
    public void When_InputContainsNegativeNumber_Then_ThrowIllegalArgumentException() {
        // given
        int num = -1;

        // when, then
        assertThatCode(() -> InputValidator.validateNumber(num))
                .hasMessage("음수를 입력할 수 없습니다.")
                .isInstanceOf(ArithmeticException.class);
    }

}
