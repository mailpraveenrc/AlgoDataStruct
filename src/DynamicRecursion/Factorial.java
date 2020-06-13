package DynamicRecursion;

public class Factorial {
    public int fac(int input,int i){
        int res = 1;
// while i <= input
// res = res * i
// repeat
// return  input;
        while(i <= input){
            res = res *i;
            i++;
            fac(input,i);
        }
        return  res;
    }

    public int factorial(int input){
        if(input == 0) return 1;
        return input * factorial(input-1);
    }
    public static void main(String[] args) {
        Factorial o = new Factorial();
        System.out.printf("------------ "+o.fac(5,1));

        System.out.printf("------------ "+o.factorial(5));
    }
}
