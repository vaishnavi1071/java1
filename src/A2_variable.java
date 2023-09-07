//public class A2_variable {
//    void add(int a , int b)
//    {
//        int c = a + b;
//       System.out.print(c);
//    }
//    public static void main(String[]args){
//
//        A2_variable s1 = new A2_variable();
//
//        s1.add(8,9);
//    }
//}

//variables
// class variable{
//    int d = 3;
//    static int e = 6;

//
//
//    void mul(int a ,int b){
//        int c = a*b;
//        System.out.print(c);
//    }
//
//    public static void main(String []args){
//
//
//
//        variable s1 = new variable();
//        s1.mul(8,9);
//
//    }
//}
class constructor{
    String name;
    int age;
    String hobby;
    constructor( String name, int age){
        this.name = name;
        this.age =age;
        System.out.println("my name is " + name + " age is "+ age);
    }
    private constructor(String name, int age, String hobby){
        this.hobby=  hobby;
        System.out.println("my name is " + name+ " fav hobby is " + hobby);

    }
    static class student{
        int rollno;
        student(int rollno){
            this.rollno= rollno;
            System.out.println("my rollno is " + rollno);


        }


    }

    public static void main(String args[]){
        constructor c1 = new constructor("vaishnavi", 23);
        constructor c2 = new constructor("neha" , 24);
        constructor c3 = new constructor("om", 12,"kho-kho");
        student s1 = new student(8);


    }
}

















