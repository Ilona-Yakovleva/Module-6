public class Square extends Parallelogram {
    private static String nameFigure= " Квадрата ";
    public Square(int a, String name) {super(a, name);}
    @Override
    public double getArea() {
        area = sideA*sideA;
        return area;
    }
    @Override
    public int getPerimeter() {
        perimeter = 4*sideA;
        return perimeter;
    }
}