import java.util.ArrayList;
import java.util.Comparator;
import java.util.Random;
public class Main implements Comparator<Student> {
    static int len = 20;
    public static void main(String[] args) {
        ArrayList<Student> iDNumber = new ArrayList<>();
        setArray(iDNumber);
        System.out.println("First array");
        outArray(iDNumber);
        iDNumber = quicksort(iDNumber);
        System.out.println("Sorted by fast array");
        outArray(iDNumber);
        setArray(iDNumber);
        System.out.println("Second array");
        outArray(iDNumber);
        iDNumber = mergesort(iDNumber);
        System.out.println("Sorted by merge array");
        outArray(iDNumber);
        setArray(iDNumber);
        System.out.println("Third array");
        outArray(iDNumber);
        iDNumber = quicksortByName(iDNumber);
        System.out.println("Sorted by fast array by name");
        outArray(iDNumber);
        setArray(iDNumber);
        System.out.println("Fourth array");
        outArray(iDNumber);
        iDNumber = mergesortByName(iDNumber);
        System.out.println("Sorted by merge array by name");
        outArray(iDNumber);
        ArrayList<Student> iDNumber2 = new ArrayList<>();
        setArray(iDNumber);
        setArray(iDNumber2);
        ArrayList<Student> iDNumber0 = mergeStudents(iDNumber, iDNumber2);
        System.out.println("Merged and Sorted two Arrays");
        outArray(iDNumber0);
    }
    public static void setArray(ArrayList<Student> iDNumber){
        iDNumber.clear();
        Random random = new Random(System.nanoTime());
        for (int i=0;i<len;i++){
            iDNumber.add(new Student("Name_"+random.nextInt(100), "Surname_"+random.nextInt(100), "Speciality_"+random.nextInt(100), random.nextInt(1, 5), random.nextInt(1, 5), random.nextInt(100)));
        }
    }
    public static ArrayList<Student> quicksort(ArrayList<Student> iDNumber){
        if(iDNumber.size()>=2) {
            ArrayList<Student> list1 = new ArrayList<>();
            ArrayList<Student> list2 = new ArrayList<>();
            Main main = new Main();
            if(main.compare(iDNumber.get(0),iDNumber.get(1))<0){
                list1.add(iDNumber.get(0));
                list2.add(iDNumber.get(1));
            }
            else {
                list1.add(iDNumber.get(1));
                list2.add(iDNumber.get(0));
            }
            for (int x =2 ;x<iDNumber.size();x++){
                if (main.compare(iDNumber.get(x),list1.get(0))<0){
                    list1.add(iDNumber.get(x));
                }
                else {
                    list2.add(iDNumber.get(x));
                }
            }
            list1 = quicksort(list1);
            list2 = quicksort(list2);
            list1.addAll(list2);
            return list1;
        }
        else return iDNumber;
    }
    public static ArrayList<Student> mergesort(ArrayList<Student> iDNumber){
        if(iDNumber.size()>1){
            ArrayList<Student> list1 = new ArrayList<>();
            ArrayList<Student> list2 = new ArrayList<>();
            for (int i=0;i<iDNumber.size();i++){
                if(i%2==0)list1.add(iDNumber.get(i));
                else list2.add(iDNumber.get(i));
            }
            list1 = mergesort(list1);
            list2 = mergesort(list2);
            ArrayList<Student> newList = new ArrayList<>();
            int a = 0;
            int b = 0;
            Main main = new Main();
            while(list1.size()>a && list2.size()>b){
                if(main.compare(list1.get(a), list2.get(b))>=0){
                    newList.add(list2.get(b));
                    b++;
                }
                else{
                    newList.add(list1.get(a));
                    a++;
                }
            }
            while (list1.size()>a){
                newList.add(list1.get(a));
                a++;
            }
            while (list2.size()>b){
                newList.add(list2.get(b));
                b++;
            }
            return newList;
        }
        else{
            return iDNumber;
        }
    }
    public static ArrayList<Student> quicksortByName(ArrayList<Student> iDNumber){
        if(iDNumber.size()>=2) {
            ArrayList<Student> list1 = new ArrayList<>();
            ArrayList<Student> list2 = new ArrayList<>();
            Main main = new Main();
            if(main.compareByName(iDNumber.get(0),iDNumber.get(1))<0){
                list1.add(iDNumber.get(0));
                list2.add(iDNumber.get(1));
            }
            else {
                list1.add(iDNumber.get(1));
                list2.add(iDNumber.get(0));
            }
            for (int x =2 ;x<iDNumber.size();x++){
                if (main.compareByName(iDNumber.get(x),list1.get(0))<0){
                    list1.add(iDNumber.get(x));
                }
                else {
                    list2.add(iDNumber.get(x));
                }
            }
            list1 = quicksortByName(list1);
            list2 = quicksortByName(list2);
            list1.addAll(list2);
            return list1;
        }
        else return iDNumber;
    }
    public static ArrayList<Student> mergesortByName(ArrayList<Student> iDNumber){
        if(iDNumber.size()>1){
            ArrayList<Student> list1 = new ArrayList<>();
            ArrayList<Student> list2 = new ArrayList<>();
            for (int i=0;i<iDNumber.size();i++){
                if(i%2==0)list1.add(iDNumber.get(i));
                else list2.add(iDNumber.get(i));
            }
            list1 = mergesortByName(list1);
            list2 = mergesortByName(list2);
            ArrayList<Student> newList = new ArrayList<>();
            int a = 0;
            int b = 0;
            Main main = new Main();
            while(list1.size()>a && list2.size()>b){
                if(main.compareByName(list1.get(a), list2.get(b))>=0){
                    newList.add(list2.get(b));
                    b++;
                }
                else{
                    newList.add(list1.get(a));
                    a++;
                }
            }
            while (list1.size()>a){
                newList.add(list1.get(a));
                a++;
            }
            while (list2.size()>b){
                newList.add(list2.get(b));
                b++;
            }
            return newList;
        }
        else{
            return iDNumber;
        }
    }
    public static ArrayList<Student> mergeStudents(ArrayList<Student> s1, ArrayList<Student> s2){
        s1.addAll(s2);
        return quicksort(s1);
    }
    public static void outArray(ArrayList<Student> iDNumber){
        for (Student student : iDNumber) {
            System.out.println(student);
        }
    }
    @Override
    public int compare(Student o1, Student o2) {
        return -Integer.compare(o1.GPA, o2.GPA);
    }
    public int compareByName(Student o1, Student o2){
        return o1.name.compareTo(o2.name);
    }
}