import java.util.Scanner;

public class palindrome_num {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number: ");
        int num = sc.nextInt();

        int og_num = num;

        // Same logic of swap two num, first swap the number then check og = swap num
        int rev = 0;
        while (num!=0) {
            rev = rev * 10 + num % 10;
            num = num /10;
        }

        System.out.println("Reversed Number: " +rev);
        if (og_num == rev){
            System.out.println(og_num + " is a Palindrome Number");
        }else {
            System.out.println(og_num + " Its Not a Palindrome Number");

        }
    }
}
