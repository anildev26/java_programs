public class swap_nums_5_Ways {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        int temp;
        System.out.println("Before Swapping values : " +a+ " " +b);

        //Method 1 : Using 3rd Variable

        temp = a;
        a = b;
        b = temp;

        System.out.println("After Swapping values using 3 rd variable : " +a+ " " +b);

        //Method 2 : Using Addition & Subtraction

        a = a+b;
        b = a-b;
        a = a-b;

        System.out.println("After Swapping values using Addition - Subtraction : " +a+ " " +b);

        //Method 3 : Using Multiplication and Divisible

        a = a*b;
        b = a/b;
        a = a/b;

        System.out.println("After Swapping values using Multiplication and Divisible : " +a+ " " +b);

        //Method 4 : Using BitWise Operator

        a = a^b;
        b = a^b;
        a = a^b;

        System.out.println("After Swapping values using BitWise Operator : " +a+ " " +b);

        //Method 5: Single Statement

        b = a+b - (a=b);

        System.out.println("After Swapping values using Single Statement : " +a+ " " +b);


    }
}
