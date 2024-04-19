class Rectangle extends Shape {
    public static void main(String[] args) {
        Rectangle r = new Rectangle();
        r.width = 5;
        r.height = 10;
        System.out.println("Area: " + r.getArea());
        System.out.println("Perimeter: " + r.getPerimeter());
    }
}
