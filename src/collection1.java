//
//import java.util.ArrayList;
//import java.util.Iterator;
//import java.util.List;

//class collection1{
//    public static void main(String[]args){
//        List l1 = new ArrayList();
//        l1.add(100);
//        l1.add(200);
//        l1.add(300);
//        System.out.println(l1);
//        Iterator itr = l1.iterator();
//        while (itr.hasNext()){
//            System.out.println(itr.next());
//        }
//
//
//
//    }
//}

// listIterator
//
//import java.util.ArrayList;
//
//import java.util.List;
//import java.util.ListIterator;
//
//class collection1{
//    public static void main(String[]args){
//        List l1 = new ArrayList();
//        l1.add(100);
//        l1.add(200);
//        l1.add("vaishnavi");
//        l1.add('v');
//        System.out.println(l1);
//        ListIterator itr = l1.listIterator();
//        while(itr.hasNext()){
//            System.out.println(itr.next());
//        }
//
//    }
//}
//
//import java.util.HashSet;
//import java.util.Iterator;
//
//import java.util.Set;
//
//// iteratoration of set
//class collection1{
//    public static void main(String[]args){
//        Set s1 = new HashSet();
//        s1.add(100);
//        s1.add(200);
//        s1.add("sani");
//        s1.add("b");
//        s1.add("b");
//        s1.add(null);
//        s1.add(null);
//
//        Iterator itr = s1.iterator();
//        while (itr.hasNext()){
//            System.out.println(itr.next());
//        }
//
//    }
//}



import java.util.LinkedList;
class colletcion2{
    public static void main(String[]args){
        LinkedList l1 = new LinkedList<>();
        l1.add(100);
        l1.add("vaishnavi");
        l1.add('c');
        l1.add(5.7);
        l1.add('c');// can store duplicate values
        l1.add(null);//linkelist can stored multiple null values
        l1.add(null);
        l1.remove(2);
        l1.set(1 ,"sana");
        l1.get(1);
        System.out.println(l1);

    }
}




















