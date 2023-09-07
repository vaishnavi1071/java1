public class A2Insertion_sort {
    public static void printarray(int s[]){
        for(int i=0;i<s.length;i++){
System.out.print(s[i] +" ");
        }
System.out.println(" ");
    }

    public static void main(String[] args){
        int a[]={2,9,7,1,2,0};
        int s[]={7,9,90,8};
        printarray(s);
        
        int temp,j;
        for(int i=1;i<a.length;i++){

            temp=a[i];
            j=i;
            while(j>0 && a[j-1]>temp){
                a[j]=a[j-1];
                j=j-1;
            }
            a[j]=temp;
        }
        for(int i=0;i<a.length;i++){
            System.out.print(a[i]+" ");
        }

    }
}
