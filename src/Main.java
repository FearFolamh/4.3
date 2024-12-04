public class Main {
    public static void main(String[] args) {
        Point p1 = new Point(5, 8);
        Point p2 = new Point(4, 0);
        Point p3 = new Point(0, 3);
        double area = Point.triangleArea(p1, p2, p3);
        p1.distanseTo(p2);
        System.out.println("Площадь треугольника: " + area);

        Point3D p4 = new Point3D(0, 0, 0);
        Point3D p5 = new Point3D(10, 0, 0);
        Point3D p6 = new Point3D(0, 10, 3);
        Point3D p7 = new Point3D(0, 5, 1);
        double volume = Point3D.tetrahedronVolume(p4, p5, p6, p7);
        System.out.println("Объем тетраэдра: " + volume);

        System.out.println(p1.distanseTo(p2)+ " Расстояние между двумя точками"+"\n"+ p7.distanseTo(p6)+" Расстояние между двумя точками");
    }
}