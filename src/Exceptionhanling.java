import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class Exceptionhanling {
    /*public static void main(String[]args){
        int a=10, b=0, c;
        try{
            c=a/b;
            System.out.println(c);
        }
        catch (Exception e){
            System.out.println(e.getMessage());
            System.out.println(e);
            System.out.println(e.toString());
            e.printStackTrace();

        }
        finally {
            System.out.println("executed finally block");
        }
  System.out.println("hello world");
     }*/
    static class th {
        void readFile() throws FileNotFoundException {

            FileInputStream f1 = new FileInputStream("abc.txt");
        }
        void writeFile() throws FileNotFoundException{
            FileOutputStream f2 = new FileOutputStream("xyz.txt");
        }
    }

    public static void main(String args[]) {
       th t1 = new th();

        try {
            t1.readFile();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
            System.out.println("successful");
        }
System.out.println("program succesfully completed for throws keyword");
    }
}