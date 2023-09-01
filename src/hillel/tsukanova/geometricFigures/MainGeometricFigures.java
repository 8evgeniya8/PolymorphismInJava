package hillel.tsukanova.geometricFigures;

public class MainGeometricFigures {
    public static void main(String[]args){
        ParentGeometricFigures[] shapesFigures = new ParentGeometricFigures[3];
        shapesFigures[0] = new Circle(1);
        shapesFigures[1] = new Triangle(2, 2);
        shapesFigures[2] = new Square(3);

        for (ParentGeometricFigures shape : shapesFigures) {
            shape.calculateArea();
        }

        double totalArea = sumAllArea(shapesFigures);
        System.out.println("Загальна площа всіх фігур = " + totalArea);
    }

    public static double sumAllArea(ParentGeometricFigures[] shapes) {
        double totalArea = 0;
        for (ParentGeometricFigures shape : shapes) {
            totalArea += shape.getAllArea();
        }
        return totalArea;
    }
    }


