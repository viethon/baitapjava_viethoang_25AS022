public class Rectangle {
    private float length;
    private float width;

    public Rectangle() {
        this.length = 1.0F;
        this.width = 1.0F;
    }

    public Rectangle(float length, float width) {
        this.length = length;
        this.width = width;
    }

    public float getLength() {
        return this.length = this.length;
    }

    public void setLength(float length) {
        this.length = length;
    }

    public float getWidth() {
        return this.width = this.width;
    }

    public void setWidth(float width) {
        this.width = width;
    }

    public double getArea() {
        return (double)(this.width * this.length);
    }

    public double getPerimeter() {
        return (double)(2.0F * (this.width + this.length));
    }

    public String toString() {
        return "Rectangle[length=" + this.length + "width=" + this.width
    }
