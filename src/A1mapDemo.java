import java.util.HashMap;
import java.util.Map;

public class A1mapDemo {
    public static void main(String[]args)
    {
        Map map = new HashMap();
        map.put(101, "veena");
        map.put(102, "sana");
        map.put(103, "hema");
        map.put(104, "kirti");
        System.out.println(map);
//        map.clear();
        System.out.println(map);
        System.out.print(map.isEmpty());


    }
}
