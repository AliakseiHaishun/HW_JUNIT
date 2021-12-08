package unitTests;

import com.it_academy.practice.junit_basics.Calculator;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ArgumentsSource;
import prividers.ArgumentsProvider1;
import prividers.TwoZeroArgumentsProvider;

import static org.junit.jupiter.api.Assertions.*;

public class DividingTests {

    @ParameterizedTest
    @ArgumentsSource(ArgumentsProvider1.class)
    void DividingTest (Calculator calculator) {
        float res = calculator.getA() / calculator.getB();
        assertEquals(res, calculator.calculate('/'));
    }

    @ParameterizedTest
    @ArgumentsSource(TwoZeroArgumentsProvider.class)
    void DividingByZeroTest (Calculator calculator) {
        assertThrows(ArithmeticException.class, () -> {
            float a = calculator.getA();
            float b = calculator.getB();
            float res = calculator.calculate('/');
        } );
    }

}
