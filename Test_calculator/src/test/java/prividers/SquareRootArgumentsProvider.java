package prividers;

import com.it_academy.practice.junit_basics.Calculator;
import org.junit.jupiter.api.extension.ExtensionContext;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.ArgumentsProvider;

import java.util.stream.Stream;

public class SquareRootArgumentsProvider implements ArgumentsProvider {
    @Override
    public Stream<? extends Arguments> provideArguments(ExtensionContext extensionContext) throws Exception {
        return Stream.of(
                Arguments.of(new Calculator(2, 3)),
                Arguments.of(new Calculator(Integer.MIN_VALUE, 1)),
                Arguments.of(new Calculator(Integer.MAX_VALUE, -2)),
                Arguments.of(new Calculator(1, 0)),
                Arguments.of(new Calculator(2, 0)),
                Arguments.of(new Calculator(-100, 43)),
                Arguments.of(new Calculator(16, -4))
                );
    }
}
