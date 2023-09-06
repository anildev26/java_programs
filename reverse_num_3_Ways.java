import java.util.Scanner;

public class reverse_num_3_Ways {
    public static void main(String[] args) {
//      int num1 = 1234;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number : ");
        int num  =  sc.nextInt();
        int rev = 0;


        //Method 1 - Logical way without inbuilt method
        while(num!=0) {
            rev = rev * 10 + num % 10;
            num = num / 10;
        }

        //Method 2 - StringBuffer
        StringBuffer sb = new StringBuffer(String.valueOf(num));
        StringBuffer sbRev = sb.reverse();
        System.out.println("Reverse Number : " +sbRev);


        //Method 3 - StringBuilder
        StringBuilder sbl = new StringBuilder();
        sbl.append(num);
        StringBuilder sblRev = sbl.reverse();
        System.out.println("Reverse Number : " +sblRev);
    }
}