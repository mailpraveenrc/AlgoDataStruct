public class Prime {
        public int countPrimes(int n) {
            if(n<=2) return 0;
            if(n==3) return 1;
            int res=2;
            boolean[] prev_prime_multi = new boolean[n];
            for(int i=2;i<n;i=i+2){
                prev_prime_multi[i] = true;
            }
            for(int i=3;i<n;i=i+3){
                if(i == 1 || prev_prime_multi[i]) continue;
                prev_prime_multi[i] = true;
            }
            for(int i=1;i<n;i=i+2){
                if(i == 1 || prev_prime_multi[i]) continue;
                res++;
                for(int j=i;j<n;j=j+i){
                    prev_prime_multi[j] = true;
                }
            }
            return res;
        }

}
