public class Parallelogram {
    protected int sideA;
    protected int sideB;
    protected double angle;
    protected int perimeter;
    protected double area;
    protected String nameFigure;

    public Parallelogram(int a, int b, double an, String name) {
        sideA = a;
        sideB = b;
        angle = an;
        nameFigure = name;
    }
    public Parallelogram(int a, int b, String name) {
        sideA = a;
        sideB = b;
        nameFigure = name;
    }
    public Parallelogram(int a, String name) {
        sideA = a;
        nameFigure = name;
    }

    /*protected int getSideA() {
        return sideA;
    }

    protected void setSideA(int sideA) {
        this.sideA = sideA;
    }

    protected int getSideB() {
        return sideB;
    }

    protected void setSideB(int sideB) {
        this.sideB = sideB;
    }

    public int getSideС() {
        return sideС;
    }

    public void setSideС(int sideС) {
        this.sideС = sideС;
    }
    public double getAngle() {
        return angle;
    }

    public void setAngle(int angle) {
        this.angle = angle;
    }*/

    public int getPerimeter() {
        perimeter = 2*(sideA+sideB);
        return perimeter;
    }

    public double getArea() {
        area = sideA*sideB*Math.sin(Math.toRadians(angle));
        return area;
    }

    public void getInfo() {
        System.out.println("Периметр "+this.nameFigure+"а = " + getPerimeter());
        System.out.println("Площадь "+this.nameFigure+"а = " + getArea() + "\n");
    }

}