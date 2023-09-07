

public class A2stringreverse {
    public static void main(String args[]) {
        String s1 = "vaishnavi";
        String rev = "";
        // int arr[]=new int[127];

        for (int i = s1.length() - 1; i >= 0; i--) {

            rev = rev + s1.charAt(i);
        }
       if(s1.equals(rev)){
           System.out.println("string is palindrome");

       }
       else{
           System.out.println("string is not palindrome");
       }
        System.out.println("reverse string : "+ rev);

    }
}

