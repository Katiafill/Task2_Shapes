package katiafill.task2;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;
import java.util.List;

public class Main {
    public static  final Logger logger = LoggerFactory.getLogger(Main.class.getName());

    public static void main(String[] args) {
        String file = "resources\\triangle.txt";
        String outputFile = "resources\\result.txt";
        try {
            List<String> params = FileHelper.readFile(file);
            ShapeParametersParser parser  = new ShapeParametersParser(params);
            ShapeFactory factory = ShapeFactory.getFactory(parser.type);
            ShapeDescriptionBuilder builder = factory.createBuilder(factory.createShape(parser.parameters));
            builder.build();
            FileHelper.writeFile(outputFile, builder.description());
        } catch (IllegalArgumentException ex) {
            logger.error("Ошибка создания фигуры, некорректные данные.", ex);
        } catch (IOException ex) {
            logger.error("Ошибка чтения данных и файла.", ex);
        }
    }
}