package Array;

public class MergeArray {
    public int[] merge(int[] a,int[] b){
        if(a == null && b== null) return null;
        if(a== null & b!= null) return b;
        if(b== null & a!= null) return a;
        int[] c = new int[a.length+b.length];
        int i =0;
        int j=0;
        int k=0;
        while(i < a.length && j < b.length){
            if(a[i] < b[j]){
                c[k] = a[i];
                i++;
            }else{
                c[k] = b[j];
                j++;
            }
            k++;
        }
        while(i < a.length){
          c[k] = a[i];
          i++;
          k++;
        }
        while(j < b.length){
            c[k] = b[j];
            j++;
            k++;
        }

        return c;
    }

    public static void main(String args[]){
        MergeArray o = new MergeArray();
        int[] a = {1,2,3,4,5};
        int[] b = {6,7,8,9,10};
        int[] c = o.merge(a,b);
        for(int i=0;i<c.length;i++){
            System.out.println(c[i]);
        }
    }
}
