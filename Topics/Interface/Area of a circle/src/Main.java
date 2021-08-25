class Circle implements Measurable {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }



    @Override
    public double area() {
        return Math.pow(radius, 2) * Math.PI;
    }
}

// do not change the interface
interface Measurable {
    double area();
}