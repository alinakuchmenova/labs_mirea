public class Circle {
    private Point center;
    private int radius;
    public Circle(int x, int y, int r){
        center = new Point(x, y);
        radius = r;
    }
    public void setCenter(int x, int y){
        center.setX(x);
        center.setY(y);
    }
}