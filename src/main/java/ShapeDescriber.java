import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ShapeDescriber {
    private static final Logger logger = LoggerFactory.getLogger(ShapeDescriber.class);

    public void describe(Shape shape) {
        logger.info("--- Szczegóły figury ---");
        logger.info("Nazwa: {}", shape.getName());
        logger.info("Pole: {}", shape.getArea());
        logger.info("Kolor: {}", shape.getColorDescription());
        logger.info("-----------------------");
    }
}