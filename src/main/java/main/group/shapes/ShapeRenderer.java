package main.group.shapes;

import java.util.List;

public class ShapeRenderer {
    public void render(ShapeExt shape) {
        System.out.println("RENDER" + shape.getShapeColor());
    }
    public void render(List<ShapeExt> shapes) {
        for(ShapeExt shape : shapes) {
            System.out.println("RENDER" + shape.getShapeColor());
        }
    }
}
