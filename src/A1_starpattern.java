public class A1_starpattern {
    public static void main(String[]args){

      for(int i =1;i<=4;i++){
          for(int j =4;j>i;j--){
              System.out.print(" ");
          }
          for(int k =0;k<i;k++){

              System.out.print(" * ");
          }
          System.out.println("");
      }
      for(int i =0 ;i<=4;i++){
          for (int j =0; j<i;j++){
              System.out.print(" ");
          }

          for (int k=4;k>i;k--){
              System.out.print(" * ");
          }
          System.out.println("");
      }

    }
}

class star{
    public static void main(String[]args){
        for(int i =1; i<=5; i++){
            for (int j=0;j<i; j++){
                if(i>=2 && j<i-1){
                    System.out.print(" ");
                }else {
                    System.out.print( " * ");
                }
            }
            System.out.println("");
        }


    }
}
























