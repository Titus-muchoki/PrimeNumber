public class PrimeNumber{
    public static void main(String[] args) {
        int num = 30;
        boolean number = false;
        for (int i =2; i < num / 2; i++) {
            if (num % i == 0) {
                number = true;
                break;
            }
        }
        if (number) {
            System.out.println(num + "it is a prime number");
        }else {
            System.out.println(num+ "not a prime number");
        }
    }
}
