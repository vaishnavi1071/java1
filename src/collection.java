import java.util.ArrayList;
public class collection {
    public static void main(String[]args){
        ArrayList a1 = new ArrayList();
        a1.add("savita");
        a1.add(6);
        a1.add('v');
        System.out.println(a1);
        System.out.println(a1.add("sanu"));
        System.out.println(a1.isEmpty());
        System.out.println(a1.size());
        System.out.println(a1.contains("uvh"));
        System.out.println(a1.remove(0));
        System.out.println(a1);

        ArrayList a2 = new ArrayList();
        a2.add(100);
        a2.add(200);
        a2.add(300);
        System.out.println(a2);
        a1.addAll(a2);
        System.out.println(a1);
        a1.removeAll(a2);
        System.out.println(a1);



    }

}
