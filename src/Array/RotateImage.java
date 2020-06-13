package Array;

public class RotateImage {


    static int[][] rotate(int[][] input) {
        int N = input.length;
        for (int i = 0; i < N; i++) {
            for (int k = 0; k < i; k++) {
                int temp = input[i][k];
                input[i][k] = input[k][i];
                input[k][i] = temp;
            }
        }
/*
        for (int i = 0; i < N; i++) {
            for (int k = 0; k < N/2; k++) {
                int temp = input[i][k];
                input[i][k] = input[i][N-1-k];
                input[i][N-1-k] = temp;
            }
        }
  */
        return input;
    }

    static int[][] rotateleft(int[][] input) {
        int N = input.length;
        for (int i = 0; i < N; i++) {
            for (int k = 0; k < i; k++) {
                int temp = input[i][k];
                input[i][k] = input[k][i];
                input[k][i] = temp;
            }
        }


        for (int i = 0; i < N/2; i++) {
            for (int k = 0; k < N; k++) {
                int temp = input[i][k];
                input[i][k] = input[N-1-i][k];
                input[N-1-i][k] = temp;
            }
        }

        return input;
    }


    static int[][] rotate180(int[][] input) {
        int N = input.length;
        for (int i = 0; i < N; i++) {
            for (int k = 0; k < i; k++) {
                int temp = input[i][k];
                input[i][k] = input[k][i];
                input[k][i] = temp;
            }
        }


        for (int i = 0; i < N/2; i++) {
            for (int k = 0; k < N; k++) {
                int temp = input[i][k];
                input[i][k] = input[N-1-i][k];
                input[N-1-i][k] = temp;
            }
        }

        return input;
    }

    public static void main(String args[]) {
        int[][] input = new int[3][3];

        input[0][0] = 1;
        input[0][1] = 2;
        input[0][2] = 3;

        input[1][0] = 4;
        input[1][1] = 5;
        input[1][2] = 6;

        input[2][0] = 7;
        input[2][1] = 8;
        input[2][2] = 9;

        for (int i = 0; i < input.length; i++) {
            for (int j = 0; j < input.length; j++) {
                System.out.print(" " + input[i][j]);
            }
            System.out.println();
        }

/*
int[][] op = rotate(input);
        for (int i = 0; i < input.length; i++) {
            for (int j = 0; j < input.length; j++) {
                System.out.print(" " + op[i][j]);
            }
            System.out.println();
        }

        System.out.println();
        */

/*
    int[][] op2 = rotateleft(input);
        for (int i = 0; i < input.length; i++) {
            for (int j = 0; j < input.length; j++) {
                System.out.print(" " + op2[i][j]);
            }
            System.out.println();
    }
*/
}


}