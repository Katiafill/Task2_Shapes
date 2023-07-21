package katiafill.task2;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;

public class Main {
    public static  final Logger logger = LoggerFactory.getLogger(Main.class.getName());

    public static void main(String[] args) {
        ShapeFactory factory = new CircleShapeFactory();
        ShapeDescriptionBuilder builder = factory.createBuilder(factory.createShape(List.of(1.0)));
        builder.build();

        System.out.println(builder.description());
    }
}