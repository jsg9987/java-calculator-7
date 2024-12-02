package calculator.service;

import java.util.List;

public class CalculateService {
    public int calculate(List<Integer> nums) {
        int sum = 0;
        for (int num : nums) {
            sum += num;
        }

        return sum;
    }
}
