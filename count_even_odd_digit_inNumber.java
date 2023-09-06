import java.util.Scanner;

public class count_even_odd_digit_inNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number : ");
        int num  =  sc.nextInt();
        int odd = 0;
        int even = 0;
        while(num!= 0){
            int last_digit = num % 10;
            int check = (last_digit % 2 ==0) ? even++:odd++;
            num = num/10;
        }
        System.out.println("Even Digits: "+even);
        System.out.println("Odd Digits: "+odd);

    }
}
