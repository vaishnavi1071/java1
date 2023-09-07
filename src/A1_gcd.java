//import java.util.Scanner;
//
//public class A1_gcd {
//    public static void main(String[] args) {
//        int g = 0;
//        Scanner sc = new Scanner(System.in);
//        System.out.println("enter a no :-");
//        int a = sc.nextInt();
//        int b = sc.nextInt();
//
//        for (int i = 1; i <= a; i++) {
//            if (a % i == 0 && b % i == 0) {
//                System.out.println(i);
//                g=i;
//            }
//
//        }
//        System.out.println("GCD of two number : " + g );
//
//    }
//}
// class pattern{
//  public static void main(String[]vaishu){
//      for (int i=1 ; i<=5 ; i++){
//          for (int j =1; j<=5; j++)
//          if(i>=2 && j>=2 && i<=4) {
//              System.out.print(" ");
//          }else{
//          System.out.print(" * ");
//          }
//          System.out.println(" ");
//      }
//
//  }
//}
//import java.util.Stack;
//class stack{
//    public static void main(String[]args){
//        Stack s1 = new Stack();
//        s1.push("ravi");
//        s1.push(99);
//        s1.push("sana");
//        s1.push('v');
//     System.out.println( s1.pop());
//        System.out.println( s1.pop());
//        System.out.println( s1.pop());
//        System.out.println( s1.pop());
//        System.out.println(s1);
//    }
//}
//import java.util.ArrayList;
//import java.util.HashSet;
//import java.util.Iterator;
//
//class hello{
//    public static void main(String []bav){
//        ArrayList al = new ArrayList();
//        al.add("shashi");
//        al.add("sanu");
//        al.add(10);
//     HashSet h1 = new HashSet();
//     h1.add("sona");
//     h1.add(3);
//     h1.add(78);
//     h1.addAll(al);
//     System.out.println(h1);
//        Iterator itr = h1.iterator();
//        while(itr.hasNext()){
//            System.out.println(itr.next());
//
//        }
//    }
//
//}

//class c {
//    c(){
//        System.out.println("construtcor of c ");
//    }
//}
//class A1 extends c{
//    void m1(){
//        System.out.println("hello");
//    }
//    A1(int a ){
//        System.out.println("constructor A1 " + a);
//    }
//}
//class B extends A1{
//    B(){
//        super(8);
//        System.out.println("constructor B");
//    }
//    static public void main(String []args){
//        B b1 = new B();
//        b1.m1();
//    }
//}
import javax.swing.text.html.HTMLDocument;

import java.util.ArrayList;
import java.util.Scanner;

//class palindrome{
//    public static void main(String[]ars){
//   int n =101;
//   int temp =n;
//   int rev =0 ;
//   int r;
//   while (n>0){
//       r = n%10;
//       rev = rev*10+r;
//       n = n/10;
//   }
//   System.out.println(rev);
//   if(temp==rev){
//       System.out.println("number is palindrome ");
//   }
//   else {
//       System.out.println("number is not pslindrome ");
//   }
//
//
//
//    }
//}
import java.util.Iterator;
import java.util.TreeSet;
class treeset{
    public static void main(String[]args){
        ArrayList al = new ArrayList();
        al.add(34);
        al.add(45);



        TreeSet ts = new TreeSet();
        ts.add(10);
        ts.add(80);
        ts.add(90);
        ts.add(0);
        ts.add(50);

        ts.addAll(al);


        System.out.println(ts);
        Iterator itr = ts.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}
















