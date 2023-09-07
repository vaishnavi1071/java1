interface Mobile{
    public void call();
    public void message();
}
interface Ipad{
    public void bigScreen();
}
 class Phone implements Mobile {
     public void call() {
         System.out.println("call the jonny ");
     }

     @Override
     public void message(){
         System.out.println("message john");
     }
class Nokia extends Phone implements Ipad{
         public void bigScreen(){
             System.out.println("big visualization");
         }
}
    public static void main(String []args){
        Phone t1= new Phone();
        t1.call();


    }
}
