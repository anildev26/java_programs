import java.util.Scanner;

public class count_sumOf_digits_inNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number : ");
        int num  =  sc.nextInt();
        int sum = 0;
        while(num!=0){
            sum = sum + num%10;
            num = num/10;
        }
        System.out.println("Addition of all digits in number: " +sum);
    }
}
