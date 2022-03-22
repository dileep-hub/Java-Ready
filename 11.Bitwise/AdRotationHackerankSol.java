

public class AdRotation {

    public static void main(String[] args) {
        int res = biwisecomp(100);
        System.out.println(res);
    }

    public static int biwisecomp(int n) {

        String bin = Integer.toBinaryString(n);

        System.out.println(bin.length());

        System.out.println(bin);

//        char c = 'w';
//
//        bin.replace('1', '0')

        char[] c = bin.toCharArray();

        for(int i=0; i<bin.length(); i++) {
            if(c[i] == '1') {
                c[i] = '0';
            } else {
                c[i] = '1';
            }
        }

        String sf  = String.copyValueOf(c);

        int res = Integer.parseInt(sf, 2);

        System.out.println(String.copyValueOf(c));

        System.out.println(Arrays.toString(c));

        return res;

    }

}
