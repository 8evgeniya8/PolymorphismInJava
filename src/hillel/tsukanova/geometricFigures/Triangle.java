package hillel.tsukanova.geometricFigures;

class Triangle implements ParentGeometricFigures {
    private int widthTriangle;
    private int heightTriangle;

    public Triangle(int width, int height) {
        this.widthTriangle = width;
        this.heightTriangle = height;
        if (width <= 0 || height <= 0) {
            throw new IllegalArgumentException("Помилка");
        }
    }

    @Override
    public void calculateArea() {
        double areaTriangle = (widthTriangle * heightTriangle) / 2.0;
        System.out.println("Площа трикутника = " + areaTriangle);
    }

    @Override
    public double getAllArea() {
        return (widthTriangle * heightTriangle) / 2.0;
    }
}
