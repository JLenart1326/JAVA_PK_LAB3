package main.group.mainapp;
import java.util.ArrayList;
import java.util.List;
import main.group.shapes.*;
import main.group.color.*;

public class Main {
    public static void main(String[] args) {

        //Lab1
        Rectangle rect = new Rectangle(new Color(243,15,122,255),4, 6);
        Triangle triangle = new Triangle(new Color(126,231,122,255),6, 6, 6);

        List<ShapeExt> shapes = new ArrayList<>();
        shapes.add(triangle);
        shapes.add(rect);

        ShapeDescriber describer = new ShapeDescriber();
        ShapeRenderer renderer = new ShapeRenderer();
        describer.describe(rect);
        describer.describe(triangle);

        rect.getColorDescription();
        triangle.getColorDescription();

        renderer.render(rect);
        renderer.render(triangle);
        renderer.render(shapes);

        //Lab2
        Color color_1 = new Color();
        Color color_2 = new Color(145,255,15);
        Color color_3 = new Color(255,234,25,143);
        //Color color_4 = new Color(453,-14,-34,777);

        color_1.print();
        color_2.print();
        color_3.print();

    }
}