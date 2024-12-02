package calculator.service;

import java.util.List;
import static org.assertj.core.api.Assertions.assertThat;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class CalculateServiceTest {
    @DisplayName("덧셈 계산 기능 테스트")
    @Test
    public void calculate() {
        // given
        CalculateService calculateService = new CalculateService();
        List<Integer> nums = List.of(1,2,3);

        // when, then
        assertThat(calculateService.calculate(nums))
                .isEqualTo(6);
    }
}
