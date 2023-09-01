package hillel.tsukanova.geometricFigures;

class Square implements ParentGeometricFigures {
    private int sideSquare;

    public Square(int side) {
        this.sideSquare = side;
        if (side <= 0) {
            throw new IllegalArgumentException("Помилка");
        }
    }

    @Override
    public void calculateArea() {
        double areaSquare = sideSquare * sideSquare;
        System.out.println("Площа квадрата = " + areaSquare);
    }

    @Override
    public double getAllArea() {
        return sideSquare * sideSquare;
    }
}
