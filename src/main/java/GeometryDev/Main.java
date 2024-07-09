package GeometryDev;


public class Main {
    public static void main(String[] args) {

        Circle circle = new Circle(5);
        Rectangle rectangle = new Rectangle(1,2);
        CompareFigures.compareCirceAndRectangle(circle, rectangle);

        //Output:
        //Площадь круга минус площадь четырёхугольника: 76.53981633974483
        //Пермиетр круга минус периметр четырёхуголника: 25.41592653589793
    }
}