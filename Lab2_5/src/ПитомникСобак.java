import java.util.ArrayList;
public class ПитомникСобак {
    private ArrayList<Dog> dogs = new ArrayList<>();
    public void newDog(String name, int age){
        dogs.add(new Dog(name, age));
    }
}
