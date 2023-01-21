package TLC.CompilerWhile.ErrorsTest;
import TLC.CompilerWhile.Errors.ErrorG;
import TLC.CompilerWhile.Errors.ErrorSender;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class ErrorSenderTest {
    @Test
    public void testSendError() {
        String errorMessage = "Test error message";
        ErrorG error = new ErrorG(errorMessage);

        // capture System.out to check the output of sendError()
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        ErrorSender.sendError(error, false);

        // check if the error message is printed in red
        assertTrue(outContent.toString().contains("\033[0;31m" + errorMessage + "\033[0m"));
    }

}
