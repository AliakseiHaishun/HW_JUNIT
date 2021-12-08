package prividers;

import com.it_academy.practice.junit_basics.Calculator;
import org.junit.jupiter.api.extension.ExtensionContext;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.ArgumentsProvider;

import java.util.stream.Stream;

public class ArgumentsProvider1 implements ArgumentsProvider {
    @Override
    public Stream<? extends Arguments> provideArguments(ExtensionContext context) {
        return Stream.of(
                Arguments.of(new Calculator(20, 100)),
                Arguments.of(new Calculator(119, 1)),
                Arguments.of(new Calculator(0, Integer.MAX_VALUE)),
                Arguments.of(new Calculator(0, Integer.MIN_VALUE)),
                Arguments.of(new Calculator(-199, -200))

        );
    }

}
