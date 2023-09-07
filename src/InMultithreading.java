/*public class InMultithreading extends Thread {
    public void run(){
        System.out.println(interrupted());
       // System.out.println(currentThread().isInterrupted());
        try {
            for (int i = 0; i <= 4; i++) {
                sleep(1000);
                System.out.println(i);


            }
        }catch(InterruptedException e){
            System.out.println(e);
        }
    }
    public static void main(String[]args){
        InMultithreading t1 = new InMultithreading();
        t1.start();
        t1.interrupt();
    }
}*/


 class BookmyTicket {
     int total_seats = 10;

     synchronized void bookseat(int seats) {
         if (total_seats >= seats) {
             System.out.println(seats + " seats booked successfully ");
             total_seats = total_seats - seats;
             System.out.println("seats left :" + total_seats);
         } else {
             System.out.println("u cant booked seats " + total_seats);
         }
     }

     static class Moviebook extends Thread {
         static BookmyTicket b;
         int seats;

         public void run() {

             b.bookseat(seats);
         }

         public static void main(String[] args) {
             b = new BookmyTicket();
             Moviebook p1 = new Moviebook();
             p1.seats = 5;
             p1.start();

             Moviebook p2 = new Moviebook();
             p2.seats = 1;
             p2.start();


         }
     }
 }

 class demo extends Thread{
     int total =0;
     public void run(){
         synchronized (this){
     for(int i=0; i<=10; i++){
         total = total+100;
          this.notify();

     }
         }
 }
 public static void main(String[]args) throws InterruptedException{
         demo m1 = new demo();
         m1.start();
         synchronized (m1){
             m1.wait();
             System.out.println(m1.total);
         }

 }
 }





