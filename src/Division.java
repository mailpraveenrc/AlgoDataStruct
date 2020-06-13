import javafx.scene.media.SubtitleTrack;

public class Division {
    public int divide(int dividend, int divisor) {
        int res = 0;
        int operator = ((dividend < 0) ^ (divisor < 0)) ? -1 : 1;

        if (divisor == 1 && dividend == -2147483648 && operator == -1)
            return dividend;

        int originaldivisor = 0;
        if (!(divisor == -2147483648)) {
            originaldivisor = Math.abs(divisor);
        } else {
            originaldivisor = Math.abs(divisor - 1);
        }


        if (!(divisor == -2147483648)) {
            divisor = Math.abs(divisor);
        } else {
            divisor = Math.abs(divisor - 1);
        }

        if (!(dividend == -2147483648)) {
            dividend = Math.abs(dividend);
        } else {
            dividend = Math.abs(dividend - 1);
        }
        if (dividend == 0) return 0;

        if (divisor == 1) return dividend * operator;


        while (divisor <= dividend) {
            res++;
            divisor = divisor + originaldivisor;
        }
        return res * operator;
    }

    /**
     *
     * @param dividend
     * @param divisor
     * @return
     */
    public int divide2(int dividend, int divisor) {
    // handle special cases
        if(divisor ==0)
            return Integer.MAX_VALUE;
        if(divisor ==-1&&dividend ==Integer.MIN_VALUE)
            return Integer.MAX_VALUE;

        // get positive values
        long pDividend = Math.abs((long) dividend);
        long pDivisor = Math.abs((long) divisor);

        int result = 0;

        while(pDividend >=pDivisor) {
            // calculate number of left shifts
            int numShift = 0;
            while (pDividend >= (pDivisor << numShift)) {
                numShift++;
            }

            // dividend minus the largest shifted divisor
            result += 1 << (numShift - 1);
            pDividend -= (pDivisor << (numShift - 1));
        }

        if((dividend >0 && divisor >0)||(dividend< 0 && divisor< 0)){
            return result;
        } else {
            return -result;
        }

}

    public static void main(String[] args) {
        Division o = new  Division();
        System.out.println("-------"+o.divide(-2147483648,-1));


        System.out.println("-------"+o.divide2(5,1));
    }


}
