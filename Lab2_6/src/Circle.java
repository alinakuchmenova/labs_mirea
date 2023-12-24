public class Circle {
    private int radius;
    public Circle(int radius){
        this.radius = radius;
    }
    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }
    public double circleSquare(){
        return 3.14*radius*radius;
    }
    public double circlePerimeter(){
        return 2*3.14*radius;
    }
    public boolean equal(Circle circle){
        return circle.radius == radius;
    }
}
