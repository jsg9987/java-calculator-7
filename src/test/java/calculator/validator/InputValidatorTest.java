package calculator.validator;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThatCode;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

public class InputValidatorTest {

    @DisplayName("inputValidate 메소드 성공 테스트")
    @Test
    public void InputValidate_Success() {
        // given
        String[] numArray = {"1", "2", " 3", " "};
        //when, then
        assertThatCode(() -> InputValidator.inputValidate(numArray)).doesNotThrowAnyException();
    }

    @DisplayName("inputValidate 메소드 음수 예외 처리 성공 테스트")
    @Test
    public void When_InputContainsNegativeNumber_Then_ThrowIllegalArgumentException() {
        // given
        String[] numArray = {"1", "-2", " 3", " "};

        // when, then
        assertThatThrownBy(() -> InputValidator.inputValidate(numArray))
                .hasMessage("입력값으로 음수를 사용할 수 없습니다.")
                .isInstanceOf(IllegalArgumentException.class);
    }

    @DisplayName("inputValidate 메소드 구분자 아닌 문자 포함 시 예외 처리 성공 테스트")
    @Test
    public void When_InputContainsNonDelimiter_Then_ThrowIllegalException() {
        String[] numArray = {"1", "[2", " 3", " "};

        assertThatThrownBy(() -> InputValidator.inputValidate(numArray))
                .hasMessage("입력값에 구분자가 아닌 문자가 포함되어 있습니다.")
                .isInstanceOf(IllegalArgumentException.class);
    }

}
