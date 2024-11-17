package main.group.shapes;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ShapeDescriber{
    //Pole Loggera
    private static final Logger logger = LoggerFactory.getLogger(ShapeDescriber.class);

    public void describe(ShapeExt shape){
        logger.info("Opis figury:");
        logger.info("Typ figury: {}", shape.getClass().getSimpleName());
        logger.info("Kolor figury: {}", shape.getShapeColor());
        logger.info("Pole figury: {}", shape.getArea());
        logger.info("Obwód figury: {}", shape.getPerimeter());
    }
}
