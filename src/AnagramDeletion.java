public class AnagramDeletion {
    public int findCount(String a,String b){
        a = a.toLowerCase();
        b = b.toLowerCase();
        int count =0;
        int[] a_alphabet = new  int[26];
        int[] b_alphabet = new  int[26];
        for(int i=0;i<a.length();i++){
            a_alphabet[(int)a.charAt(i) - 'a']++;
        }
        for(int i=0;i<b.length();i++){
            b_alphabet[(int)b.charAt(i) - 'a']++;
        }


        for(int i=0;i<a_alphabet.length;i++){
            count+=Math.abs(a_alphabet[i]-b_alphabet[i]);
         }

        return count;
    }
    public static void main(String[] args) {
        AnagramDeletion obj = new AnagramDeletion();
        System.out.println("????????????"+obj.findCount("abcx","dcbazpojhgt"));
    }
    }
