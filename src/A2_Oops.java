//class Atm{
//     private int Atmpin;
//     public void setAtmpin(int Atmpin1){
//         Atmpin = Atmpin1;
//     }
//     public int getAtmpin(){
//         return Atmpin;
//     }
//     public static void main(String[]args){
//         Atm a1 = new Atm();
//        a1.setAtmpin(12);
//        System.out.println(a1.getAtmpin());
//     }
//}

abstract class Atm{
    abstract public void setpin();
    public void cal(){
       System.out.println("good morning");
    }

    public static void main(String[]args){

        class hello extends Atm{
            @Override
            public void setpin() {
                System.out.println("pin has been set");
            }
        }
        hello h1 = new hello();
        h1.setpin();
    }


}

class A{

}