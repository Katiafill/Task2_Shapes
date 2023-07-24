package katiafill.task2;

import katiafill.task2.io.FileHelper;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class FileHelperTest {

    @Test
    void readFile() {
        String testFile = "resources\\circle.txt";
        try {
            List<String> result = FileHelper.readFile(testFile);
            assertEquals(result, List.of("CIRCLE", "10"));
        } catch (IOException ex) {
            fail(ex);
        }
    }

    @Test
    void writeFile() {
        String testFile = "resources\\result.txt";
        try {
            String text = "Test text \n2 line";
            FileHelper.writeFile(testFile, text);
        } catch (IOException ex) {
            fail(ex);
        }
    }
}