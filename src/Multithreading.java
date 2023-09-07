//example of sleep method
public class Multithreading extends Thread {
    public void run(){
        try{
            for(int i = 0;i<=5; i++)
            {
                Thread.sleep(1000);
                System.out.println(i);
            }
        }
            catch(Exception e){
                    System.out.println(e);


            }

    }
    public static void main(String[]args){
        Multithreading t1 = new Multithreading();
        t1.start();
    }
}

class test extends Thread {
    public static void main(String[]args) throws InterruptedException{
        for(int i =0; i<=6;i++){
            Thread.sleep(1000);
            System.out.println(i);
        }
        System.out.println(currentThread().getName());
//        System.out.println(currentThread().getPriority());
    }
}


//example of yeild method
 class test1 extends Thread{
    public void run(){
       for(int i =0 ; i<=6;i++){
           System.out.println(currentThread().getName() +i);
       }
    }
    public static void main(String[]args){
        test1 t1 = new test1();
        t1.start();
        Thread.yield();
        for(int i =0 ; i<=5; i++){
         System.out.println(currentThread().getName() + i);
        }
    }
}

// Example of join method
class test2 extends Thread{
    public void run(){
        System.out.println(currentThread().getName());
        try{

        for(int i =5; i>=0 ; i--){
            sleep(1000);
            System.out.println(i);
        }
        }catch (Exception e){
            System.out.println(e);
        }

    }
    public static void main(String[]args)throws InterruptedException{
        test2 t = new test2();
        t.start();
        t.join();
        System.out.println(currentThread().getName());
        for(int i =0 ; i<=5; i++){
            sleep(1000);
            System.out.println(i);
        }
    }

}

// interrupt example
 class parent extends Thread{
    public void run(){
        try {
            for (int i = 5; i >= 0; i--) {
                sleep(1000);
                interrupt();
                System.out.println(i);
            }
        }catch (Exception e){
            System.out.println(e);
        }
    }
    public static void main(String[]args){
        parent p1 = new parent();
//        p1.interrupt();
        p1.start();

    }
 }

 class Medical extends Thread {
    public void run(){
        System.out.println("Your medical has been done go for driving");
    }
 }
 class Driving extends Thread {
    public void run(){
        System.out.println("You are ready for driving :");
    }
    public static void main(String[]args) throws InterruptedException{
        Medical m1 = new Medical();
        m1.start();


        Driving d1 = new Driving();
        d1.start();
    }
 }























