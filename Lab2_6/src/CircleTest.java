class CircleTest{
    static public void main(String[] args){
        Circle c1 = new Circle(10);
        Circle c2 = new Circle(10);
        System.out.println(c1.equal(c2));
        System.out.println(c1.getRadius());
        c2.setRadius(20);
        System.out.println(c1.equal(c2));
        System.out.println(c2.circlePerimeter());
        System.out.println(c2.circleSquare());
    }
}