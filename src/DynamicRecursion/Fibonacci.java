package DynamicRecursion;

public class Fibonacci {

    public int fibonacci(int input){
        // 0112358
        //
        if (input == 0) {
            return 0;
        }
        if (input == 1 || input == 2) {
            return 1;
        }
        return fibonacci(input-2) + fibonacci(input-1);

    }
    public static void main(String[] args) {
        Fibonacci o = new Fibonacci();

        System.out.printf("------------ "+o.fibonacci(7));
    }
}
