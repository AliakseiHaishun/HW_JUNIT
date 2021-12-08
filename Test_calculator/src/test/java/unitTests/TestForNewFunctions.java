package unitTests;

import com.it_academy.practice.junit_basics.Calculator;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ArgumentsSource;
import org.junit.jupiter.params.provider.ValueSource;
import prividers.ArgumentsProvider1;
import prividers.ExponentiationArgumentsProvider;
import prividers.SquareRootArgumentsProvider;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class TestForNewFunctions {

    @ParameterizedTest
    @ArgumentsSource(SquareRootArgumentsProvider.class)
    void squareTest (Calculator calculator) {

        float res = (float) calculator.squareRootMethod();
        assertEquals(res, calculator.squareRootMethod());
    }

    @ParameterizedTest
    @ArgumentsSource(ExponentiationArgumentsProvider.class)
    void exponentiationTest (Calculator calculator) {
        float res = calculator.exponentiationMethod();
        assertEquals(res, calculator.exponentiationMethod());
    }




}
