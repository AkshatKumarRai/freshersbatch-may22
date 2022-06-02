package io.capgemini.junit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.Rule;
import org.junit.jupiter.api.Test;
import org.junit.rules.ExpectedException;

class MinMaxFinderTest {

    int[] array = new int[] {56,34,7,3,54,3,34,34,53};

    @Test
    public void shouldBeMaxValue() {
        int maxValue = MinMaxFinder.getMaxValue(array);
        assert(maxValue == 56);
    }

    @Test
    public void shouldBeMinValue() {
        int minValue = MinMaxFinder.getMinValue(array);
        assert(minValue == 3);
    }
   
    @Test
    public void shouldBeMaxValue1() {
        int maxValue = MinMaxFinder.getMaxValue(array);
        assert(maxValue == 229);
    }

    @Test
    public void shouldBeMinValue1() {
        int minValue = MinMaxFinder.getMinValue(array);
        assert(minValue == 1);
    }

    @Rule
    public ExpectedException exceptionRule = ExpectedException.none();

    @Test
    public void whenExceptionThrown_thenRuleIsApplied() {
        exceptionRule.expect(NumberFormatException.class);
}
}
