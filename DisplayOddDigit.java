public class DisplayOddDigit {
    public static void main(String[] args) {
        int num = 4576368;
        int res = 0;
        while (num!=0){
            int last_digit = num %10;
            if(last_digit % 2 != 0){
                res = res *10 + num % 10;
            }
            num = num/10;
        }
        System.out.println(reverseNumber(res)); //375
    }

    private static int reverseNumber(int n) {
        int final_result = 0;
        while(n!=0){
            final_result = final_result*10 + n%10;
            n = n/10;
        }

        return final_result; //573 (Expected Output :573 )
    }
}
