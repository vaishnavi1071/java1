import java.util.Scanner;
import java.util.StringJoiner;

public class A1string {
    public static void main(String[]args){
        String s1=("vaishnavi");
        if (s1.isEmpty()== true) {
            System.out.println("please enter validate name");
        } else {
            System.out.println("you are applicable");
        }

        //string input from user
        Scanner sc = new Scanner(System.in);
        System.out.println("enter any string");
        String word = sc.next();

        // first method length function count length op= int

        System.out.println("length "+word.length());

        // isEmpty function op is boolean
        System.out.println("isEmpty String "+word.isEmpty());

        //trim op = String
        System.out.println("trim method "+s1.trim());

        // Another program
       if( s1.trim().isEmpty()== true)
        {
            System.out.println("name is empty");
        }
        else {
            System.out.println("name is here");
       }
        //equal method = boolean
        System.out.println(s1.equals(word));

        //compareTo()= int convert it character into binary and then subtract each other
        String s3= ("a");
        String s4=("A");
        System.out.println(s3.compareTo(s4));

        //compareignoreto
        System.out.println(s3.compareToIgnoreCase(s4));

        //join method
        System.out.println(String.join(";",s3,s4));

        // subsequence = char
        System.out.println("Subsequence method : " + s1.subSequence(3,6));

        //substring
        System.out.println("Substring method : " + s1.substring(4));

        System.out.println("substring method o/p string :" + s1.substring(3,5));
        // update strings
        System.out.println("replace string : " + s1.replace("ai","was"));
        System.out.println("replaceFirst : " + s1.replaceFirst("vi","this"));
        System.out.println("replaceAll method : " + s1.replaceAll("ai(.)","vi"));

        // searching string
        System.out.println("indexof method : " + s1.indexOf("v"));
        System.out.println("latindexof method : " + s1.lastIndexOf("v"));
        System.out.println("contain method : "+ s1.contains("was"));// return boolean value
        System.out.println("charAt method : "+ s1.charAt(5));
        System.out.println("startsWith method : " +s1.startsWith("vai"));// return boolean value
        System.out.println("endsWith method : "+ s1.endsWith("bn"));

        //type conversion
        int a=10;
        System.out.println("valueof method : "+ s1.valueOf(a));
        String name= "parte";
        char [] c =name.toCharArray();
        System.out.println(c);





    }
}
