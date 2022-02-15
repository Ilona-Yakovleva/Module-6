public class Main {
    public static void main(String[] args) {
        Rectangle rec = new Rectangle(5,6, "Прямоугольник");
        rec.getInfo();
        Square square = new Square(5, "Квадрат");
        square.getInfo();
        Triangle triangle = new Triangle(3,8, 5, 30.0, "Треугольник");
        triangle.getInfo();
        Parallelogram parallelogram = new Parallelogram(4,7, 30.0, "Параллелограмм");
        parallelogram.getInfo();
    }
}