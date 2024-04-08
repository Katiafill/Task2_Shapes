package katiafill.task2.io;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

/// Вспомогательный класс для чтения и записи в файл
public class FileHelper {
    private static final Logger logger = LoggerFactory.getLogger(FileHelper.class.getName());

    public static List<String> readFile(String filePath) throws IOException {
        logger.info("Чтение данных из файла " + filePath + ".");
        return Files.readAllLines(Path.of(filePath));
    }

    public static void writeFile(String filePath, String text) throws IOException {
        Path path = Path.of(filePath);
        if(Files.exists(path)) {
            logger.info("Файл " + filePath + "существует. Удаляем старый.");
            Files.delete(path);
            Files.createFile(path);
            logger.info("Создали новый файл " + filePath + ".");
        }
        Files.write(path, List.of(text));
        logger.info("Записали данные в файл " + filePath + ".");
    }
}
