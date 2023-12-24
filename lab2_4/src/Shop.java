import java.util.ArrayList;
public class Shop {
    private ArrayList<Integer> computers = new ArrayList<Integer>();
    private ArrayList<String> names = new ArrayList<String>();
    public void addComputer(int num, String name){
        computers.add(num);
        names.add(name);
    }
    public void removeComputer(int num){
        for (int x = 0; x < computers.size(); x++){
            if (computers.get(x) == num){
                computers.remove(x);
                names.remove(x);
                break;
            }
        }
    }
    public String findComputer(int num){
        for (int x = 0; x < computers.size(); x++){
            if (computers.get(x) == num){
                return names.get(x);
            }
        }
        return "Not Found";
    }
}
