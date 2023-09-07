public class A2_Bubblesort {
    public static void main(String[]args){
        int[] a= {10,5,9,6,4};
        int temp;
        int flag=0;
        for(int i=0;i<a.length;i++)
        {
            for(int j=0;j<a.length-1-i;j++){
               if (a[j]>a[j+1]){
                      temp=a[j];
                      a[j]=a[j+1];
                      a[j+1]=temp;
                      flag=1;
                }
            }

            if(flag==0)
            break;
        }

        for(int i=0;i<a.length;i++)
        {
            System.out.print(a[i] + " ");
        }
    }
}
