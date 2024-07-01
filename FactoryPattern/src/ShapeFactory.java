import Shapes.Circle;
import Shapes.Rectangle;
import Shapes.Shape;
import Shapes.Square;

import java.util.Objects;

public class ShapeFactory {
    public Shape getShape(String shape){
        if(Objects.equals(shape, "square")){
            return new Square();
        }
        else if(Objects.equals(shape, "rectangle")){
            return new Rectangle();
        }
        else{
            return new Circle();
        }
    }
}
