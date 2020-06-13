package Array;

public class LongturbArray {
        public int maxTurbulenceSize(int[] A) {
            if(A ==null || A.length == 0) return 0;
            if(A.length == 1) return 1;
            if(A.length == 2  && A[0] == A[1]) return 1;

            int maxturb = 1;
            int curr_maxturb = 0;
            boolean turb = false;
            for(int i=0;i< A.length;i++){
                if(i ==0){
                    if((A[i+1] > A[i]) || (A[i+1] < A[i])){
                        curr_maxturb =  1;
                    }
                }
                else if(i == A.length-1){
                    if((A[i-1] > A[i]) || (A[i-1] < A[i]) && turb == true){
                        System.out.println("--------"+A[i]);
                        System.out.println("--------");
                        curr_maxturb =  curr_maxturb+1;
                    }
                }
                else{
                    if((A[i-1] > A[i] && A[i] < A[i+1]) || (A[i-1] < A[i] && A[i] > A[i+1])){
                        System.out.println("--------"+A[i]);
                        curr_maxturb =  curr_maxturb+1;
                        turb = true;
                    }else{
                        turb = false;
                        curr_maxturb = 2;
                    }

                }
                maxturb = Math.max( curr_maxturb, maxturb);
            }
            return  maxturb;
        }

    public static void main(String args[]){
        int[] arr = new int[]{9,4,2,10,7,8,8,1,9};
        LongturbArray o = new LongturbArray();
        o.maxTurbulenceSize(arr);

    }
    }