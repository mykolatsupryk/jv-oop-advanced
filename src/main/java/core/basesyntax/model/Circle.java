package core.basesyntax.model;

import core.basesyntax.model.enums.Color;

public class Circle extends Figure {

    private Integer radius;

    public Circle(Color color, Integer radius) {
        super(color);
        this.radius = radius;
    }

    @Override
    public Double calculateArea() {
        return radius * radius * Math.PI;
    }

    @Override
    public void draw() {
        System.out.println("Figure: circle, area: "
                + calculateArea() + " sq. units, radius: "
                + radius + " units, color: "
                + getColor().toString().toLowerCase());
    }
}