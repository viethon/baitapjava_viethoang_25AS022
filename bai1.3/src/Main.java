

public class Main {
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle(1.2F, 3.4F);
        System.out.println(r1);
        Rectangle r2 = new Rectangle();
        System.out.println(r2);
        r1.setLength(5.6F);
        r1.setWidth(7.8F);
        System.out.println(r1);
        System.out.println("length is: " + r1.getLength());
        System.out.println("width is: " + r1.getWidth());
        System.out.printf("area is: %.2f%n", r1.getArea());
        System.out.printf("perimeter is: %.2f%n", r1.getPerimeter());
    }
}