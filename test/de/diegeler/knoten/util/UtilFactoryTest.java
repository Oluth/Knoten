package de.diegeler.knoten.util;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Answers;
import org.mockito.ArgumentCaptor;

import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

public class UtilFactoryTest {
    private UtilFactory testTarget;

    @Test
    public void test_createLogger_nullClass_throwsException() {

        // act
            testTarget = new UtilFactory();

        // assert
        assertThrows(RuntimeException.class, () -> {
            testTarget.createLogger( null, System.out );
        });
    }

    @Test
    public void test_createLogger_existingClass_validateLine() {

        // assert
        PrintStream output = mock(PrintStream.class, Answers.RETURNS_DEEP_STUBS);
        ArgumentCaptor<String> outputString = ArgumentCaptor.forClass(String.class);
        final String testMsg = "Test";

        // act
        testTarget = new UtilFactory();
        Logger logger = testTarget.createLogger(Integer.class, output);
        logger.log(testMsg);

        // assert
        verify(output).println(outputString.capture());
        assertEquals("[" + Integer.class.getName() + "]: " + testMsg, outputString.getValue());
    }
}
