package katiafill.task2;

public class TriangleDescriptionBuilder extends ShapeDescriptionBuilder {

    TriangleDescriptionBuilder(Triangle shape) {
        super(shape);
    }

    @Override
    protected void buildSpecificDescription() {
        appendProperty("Стороны", "");

        Triangle s = (Triangle)shape;
        appendSideAndAngle(s.sideA, s.angleBCA());
        appendSideAndAngle(s.sideB, s.angleCAB());
        appendSideAndAngle(s.sideC, s.angleABC());
    }

    private void appendSideAndAngle(double side, double angle) {
        builder.append(String.format("%.2f %s - %.2f%s", side, Units.SIMPLE.getName(), angle, Units.DEGREES.getName()));
        builder.append(lineSeparator);
    }
}
