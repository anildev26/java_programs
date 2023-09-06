import java.util.Scanner;

public class swap_string_3_Ways {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your Name: ");
        String name = sc.nextLine();
        String revString = "";


        // Method 1 : Reverse Looping

        int len = name.length();
        for(int i = len-1; i>=0; i--){
            revString = revString + name.charAt(i);
        }
        System.out.println("Reverse Name: " +revString);

        // Method 2 : Converting String to Character Array and Reverse looping

        char [] a = name.toCharArray();
        int len1 = a.length;

        for (int i = len1-1; i>=0; i--){
            revString = revString + a[i];
        }
        System.out.println("Reverse Name: " +revString);

        // Method 3 : Using StringBuffer

        StringBuffer sb = new StringBuffer(name);
        StringBuffer rev = sb.reverse();
        System.out.println("Reverse Name: " +rev);

    }
}
