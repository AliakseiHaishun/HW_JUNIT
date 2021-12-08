package unitTests;

import com.it_academy.practice.junit_basics.Calculator;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ArgumentsSource;
import prividers.ArgumentsProvider1;
import prividers.TwoZeroArgumentsProvider;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class SubtractionTests {

    @ParameterizedTest
    @ArgumentsSource(ArgumentsProvider1.class)
    void SubtractionTest (Calculator calculator) {
        float res = calculator.getA() - calculator.getB();
        assertEquals(res, calculator.calculate('-'));
    }

    @ParameterizedTest
    @ArgumentsSource(TwoZeroArgumentsProvider.class)
    void twoZeroSubtractionTest (Calculator calculator) {
        assertEquals(0, calculator.calculate('-'));
    }
}

