package katiafill.task2;

import katiafill.task2.builder.ShapeDescriptionBuilder;
import katiafill.task2.factory.ShapeFactory;
import katiafill.task2.io.ArgumentsParser;
import katiafill.task2.io.FileHelper;
import katiafill.task2.io.OutputType;
import katiafill.task2.io.ShapeParametersParser;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;
import java.util.List;

public class Main {
    public static  final Logger logger = LoggerFactory.getLogger(Main.class.getName());

    public static void main(String[] args) {
        try {
            ArgumentsParser parser = new ArgumentsParser(args);
            ShapeDescriptionBuilder builder = getShapeDescriptionBuilder(parser.inputFileName);

            if (parser.outputType == OutputType.CONSOLE) {
                System.out.println(builder.description());
            } else {
                FileHelper.writeFile(parser.outputFileName, builder.description());
            }
        } catch (IllegalArgumentException ex) {
            logger.error("Неправильные данные.", ex);
        } catch (IOException ex) {
            logger.error("Ошибка чтения данных и файла.", ex);
        }
    }

    private static ShapeDescriptionBuilder getShapeDescriptionBuilder(String inputFileName) throws IOException {
        List<String> params = FileHelper.readFile(inputFileName);
        ShapeParametersParser parser  = new ShapeParametersParser(params);
        ShapeFactory factory = ShapeFactory.getFactory(parser.type);
        return factory.createBuilder(factory.createShape(parser.parameters));
    }


}