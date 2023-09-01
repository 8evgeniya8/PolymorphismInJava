package hillel.tsukanova.geometricFigures;

class Circle implements ParentGeometricFigures {
    private int radiusCircle;

    public Circle(int radius) {
        this.radiusCircle = radius;
        if (radius <= 0) {
            throw new IllegalArgumentException("Помилка");
        }
    }

    @Override
    public void calculateArea() {
        double areaCircle = Math.PI * Math.pow(radiusCircle, 2);
        System.out.println("Площа кола = " + areaCircle);
    }

    @Override
    public double getAllArea() {
        return Math.PI * Math.pow(radiusCircle, 2);
    }
}
