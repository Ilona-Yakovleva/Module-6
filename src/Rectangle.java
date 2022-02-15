public class Rectangle extends Parallelogram {
    public static String nameFigure= " Прямоугольника ";
    public Rectangle(int a, int b, String name) {
        super(a,b, name);
    }
    @Override
    public double getArea() {
        area = sideA*sideB;
        return area;
    }
}