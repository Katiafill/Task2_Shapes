package katiafill.task2;

import katiafill.task2.io.ArgumentsParser;
import katiafill.task2.io.OutputType;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ArgumentsParserTest {

    @Test
    void onlyInputFileName() {
        String[] args = new String[] {"circle.txt"};
        checkParserResult(args,"circle.txt", OutputType.CONSOLE, null);
    }

    @Test
    void inputFileAndConsole() {
        String[] args = new String[] {"circle.txt", "-c"};
        checkParserResult(args, "circle.txt", OutputType.CONSOLE, null);
    }

    @Test
    void inputFileAndOutputFile() {
        String[] args = new String[] {"rect.txt", "-f", "result.txt"};
        checkParserResult(args, "rect.txt", OutputType.FILE, "result.txt");
    }

    @Test
    void noArguments() {
        checkErrors(new String[0], "Invalid command arguments. Should be input filename.");
    }

    @Test
    void invalidCommand() {
        checkErrors(new String[]{"text.txt", "c"}, "Invalid command arguments. Should be -c or -f.");
    }

    @Test
    void invalidCommandParameter() {
        checkErrors(new String[]{"text.txt", "-f"}, "Invalid command arguments. After command -f should be output filename.");
    }

    private void checkParserResult(String[] args, String inputFile, OutputType type, String outputFile) {
        ArgumentsParser parser = new ArgumentsParser(args);
        assertEquals(parser.getInputFileName(), inputFile);
        assertEquals(parser.getOutputType(), type);
        assertEquals(parser.getOutputFileName(), outputFile);
    }

    private void checkErrors(String[] args, String actual) {
        try {
            new ArgumentsParser(args);
            fail();
        } catch (IllegalArgumentException ex) {
            assertEquals(ex.getMessage(), actual);
        } catch (Exception ex) {
            fail(ex);
        }
    }
}