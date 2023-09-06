import java.util.Scanner;

public class count_number_digit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number : ");

        // Similar method to reverse/swap num just del 1 num at a time by dividing and increment whenever num get deleted
        int num  =  sc.nextInt();
        int count = 0;
        while(num > 0){
            num  = num / 10;
            count++;
        }
        System.out.println("Number of Digits: " +count);
        //Note: This Method won't work if num start from zero, it will ignore that num coz of loop condition and return the count

    }
}
