import java.util.Vector;

public class collection_vector  {
    public static void main(String[]args){
      Vector v1 = new Vector();
      v1.addElement(100);
      v1.addElement(90);//method of vector class

      v1.add(0);//method of listIterator

      System.out.println(v1.lastElement());
      System.out.println(v1.capacity());
      System.out.println(v1.firstElement());
      System.out.println(v1);
      System.out.println(v1.remove(0));

      System.out.println(v1.contains(100));
      System.out.println(v1.removeElement(100));
      System.out.println(v1);
      v1.removeElementAt(0);
      System.out.println(v1.removeAll(v1));
        System.out.println(v1);
    }
}
