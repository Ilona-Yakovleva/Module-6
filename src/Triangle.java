public class Triangle extends Parallelogram{ // как это ни странно
    private static String nameFigure= " Треугольника ";
    private int sideC;

    public Triangle(int a, int b, int c, double an, String name) {super(a,b,an, name); this.sideC = c;}
    @Override
    public int getPerimeter() {
        perimeter = sideA+sideB+this.sideC;
        return perimeter;
    }
    @Override
    public double getArea() {
        area = sideA*sideB*Math.sin(Math.toRadians(angle))/2;
        return area;
    }
}