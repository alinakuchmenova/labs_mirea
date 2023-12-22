import javax.swing.*;
import java.awt.*;
import java.util.Random;

public class Main {
    public static void main(String[] args){
        JFrame jFrame = new JFrame("Random Shapes");
        jFrame.setSize(1280, 720);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        RandomShapes randomShapes = new RandomShapes();
        jFrame.add(randomShapes);
        jFrame.setVisible(true);
    }
    public static class RandomShapes extends JPanel{
        Random random = new Random(System.nanoTime());
        Shape[] shape = new Shape[20];
        public RandomShapes(){
            for (int i = 0; i < 20; i++){
                int x = random.nextInt(1280)-100;
                int y = random.nextInt(720)-100;
                Color color = new Color(random.nextInt(256), random.nextInt(256), random.nextInt(256));
                if (random.nextInt(2) == 0){
                    int radius = random.nextInt(100) + 50;
                    shape[i] = new Circle(color, x, y, radius);
                }
                else {
                    int width = random.nextInt(200) + 100;
                    int height = random.nextInt(200) + 100;
                    shape[i] = new Rectangle(color, x, y, width, height);
                }
            }
        }
        @Override
        protected void paintComponent(Graphics g){
            super.paintComponent(g);
            for (Shape shape : shape){
                shape.draw(g);
            }
        }
    }
}