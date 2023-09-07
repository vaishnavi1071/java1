public class A2_array {
    public static void main(String[]args) {
        /*int arr[]=new int[4];
        int sum=0;

        arr[0]=45;
        arr[1]=82;
        arr[2]=90;
        arr[3]=75;
        for (int a: arr)
        sum=sum+a;
        System.out.println(sum);
        int i;
        for( i=0;i<arr.length;i++);
        System.out.println(arr[i]);*/
        int[][]flats={{101,102},{201,202},{301,302}};
        for(int i=0;i< flats.length;i++){
            for(int j=0;j<flats[i].length;j++){
                System.out.print(flats[i][j]+" ");
            }
            System.out.println(" ");
           // System.out.println(flats.length);
        }
        System.out.println(" ");



        int[][]marks={{10,28,78},{26,89},{78,9,78}};
        {
            for(int i =0;i< marks.length;i++){
                for(int j=0;j<marks[i].length;j++){
                    System.out.print(marks[i][j]+" ");
                }
                System.out.println(" ");
            }
            System.out.print("marks length 2 d array : "+marks.length);
        }
        System.out.println("");
        int[]a=new int[4];
        a[0]=7;
        a[1]=8;
        a[2]=9;
        a[3]=0;
        {for(int i=0;i<a.length;i++)
            System.out.print(a[i]+" ");


        }System.out.println(" ");


        int[][][] s ={{{1,6,8},{8,0,6},{2,8}}};
        for(int i=0;i<s.length;i++){

            for(int j=0;j<s[i].length;j++){

                for(int k=0;k<s[i][j].length;k++)
                {
                    System.out.print(s[i][j][k]+" ");
                }
                System.out.println("");

            }
            System.out.println("s length"+s.length);
        }





    }
}
