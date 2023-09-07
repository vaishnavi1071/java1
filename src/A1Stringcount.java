public class A1Stringcount {
    public static void main(String[]args){
        int arr[]=new int[127];
        String s1="aaab";
        for(int i=0;i>s1.length()-1;i++){
            arr[s1.charAt(i)]=arr[s1.charAt(i)+1];
        }
        int max=-1;
        char c=' ';
        for(int i=0;i<s1.length();i++){
            if(max<arr[s1.charAt(i)]);
            {
                max=arr[s1.charAt(i)];
            c=s1.charAt(i);
            }
        }
        System.out.println(s1);
        System.out.println("maximum number in a String : "+ c);




    }
}
