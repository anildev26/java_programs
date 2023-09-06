import java.util.Scanner;

public class palindrome_string {
    public static void main(String[] args) {
        System.out.print("Enter a String: ");
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String rev = "";
        String og =  str;
        int len = str.length();
        for(int i= len-1; i>=0; i--){
            rev =  rev + str.charAt(i);
        }
        if (og.equals(rev)){
            System.out.println(og + " It is a Pallindrome String");
        }else {
            System.out.println(og + " It's not a Pallindrome String");
        }
    }
}
