

public class prime1 {
    public static void main(String args[]){
        int a=0;
        int b =1;
        int c;
        System.out.println(a);
        System.out.println( b );
        for(int i =1; i<=10;i++){
            c= a+b;
            System.out.println(c);
            a=b;
            b=c;
        }
    }
}

class armstrong{
    public static void main(String args[]){
        int n =15;int ans =0;int r;
        int temp =n;
        while (n>0){
           r =n%10;
            ans= ans + r *r*r;
            n = n/10;



        }
        System.out.println(ans);
        if(temp==ans){
            System.out.println("number is armstrong ");
        }
        else{
            System.out.println("number is not armstrong");
        }

    }
}

class prime{
    public static void main(String args[]){
        int no=8;int temp=0;
        for(int i= 1;i<=no;i++){
            if(no%i==0){
                temp =temp+1;
            }

        }
        if(temp==2){
            System.out.println("number is  prime");
        }
        else{
            System.out.println("number is not prime");
        }

    }
}

class seriesprime{
    public static void main(String args[]){

        for(int i =1;i<=10;i++){
            int temp=0;
            for(int j =1 ; j<=10;j++){
                if(i%j==0){
                    temp =temp +1;
                }

            }
            if(temp==2){
                System.out.println(i);
            }else{
                temp=0;
            }
        }

    }
}

class swap{
    public static void main(String args[]){
        int a =2;
        int b=9;

        a=a*b;
        b=a/b;
        a=a/b;
        System.out.print(a + " " + b);



    }
}
class fibonacci{

    public  static void main(String args[]){
        int a=0;
        int b=1;
        int c;

        System.out.println(a);
        System.out.println(b);

        for(int i=1; i<=10;i++){
            c= a+b;
            System.out.println(c);
            a=b;
            b=c;

        }
    }
}

 class string1 {
     public static void main(String args[]) {
         String s1 = "vaishu";
         String rev=" ";
         for (int i = s1.length()-1; i >=0; i--) {
             rev = rev+ s1.charAt(i);
         }
         System.out.println(rev);
     }

 }
class rev{
    public  static void main(String args[]){
        for(int i=10;i>=1;i--){
            System.out.println(i);
        }
    }
}

class multipication{
    public static void main(String args[]){
        int no=31;int table ;
        for(int i =1; i<=10;i++){
            table= no*i;
            System.out.println(table);
        }

    }
}

class factorial{
    public static void main(String args[]){
        int no=3;int fact =1;
        for(int i =1; i<=no; i++){
            fact = fact *i;

        }
        System.out.println(fact);

    }
}






























