class LongArraySum {
    public int findmaxlength(int[] input, int sum) {
        // initialize counter = 0
        // while iterate the input i stays @ first position move j till j = or > sum
        // as j increments increment response
        // now increase i and subtract i till i = < sum compare resp length
        // repeat the above steps till i and j reach the max size  sum compare resp length
        int finalres = 0;
        int resp = 0;
        int i = 0;
        int j = 0;

        while (i < input.length) {
                if (input[i] + input[j] <= sum) {
                    if(i !=j) {
                        resp = resp + 1;
                    }
                    j++;
                } else {
                    if (finalres < resp) {
                        finalres = resp;
                    }
                    i++;
                    if (input[j] - input[j] <= sum) {
                        if(i !=j) {
                            resp = resp - 1;
                        }
                    }
                }
        }
        return finalres;

    }

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 0, 0, 0, 9, 8, 7, 6, 5};
        int[] array2 = {1, 1, 1, 1, 1, 5, 6, 7, 7, 8};
        LongArraySum obj = new LongArraySum();
        System.out.printf("-------------" + obj.findmaxlength(array2, 5));
    }
}
