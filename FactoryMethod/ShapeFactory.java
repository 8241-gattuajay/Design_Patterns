package FactoryMethod;

public class ShapeFactory {
    public Shape createShape(String shapeType){
        if(shapeType==null){
            return null;
        }
        if(shapeType.equalsIgnoreCase("Circle")){
            return new Circle();
        }
        else if(shapeType.equalsIgnoreCase("Square")){
            return new Square();
        }
        return null;
    }

    public static void main(String[] args) {
        ShapeFactory shapeFactory = new ShapeFactory();
        Shape shape1= shapeFactory.createShape("Circle");
        shape1.draw();
        Shape shape2 = shapeFactory.createShape("Square");
        shape2.draw();
    }
}
