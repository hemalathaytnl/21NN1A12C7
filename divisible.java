
// input n=12  num=718
//output  4BA

import java.util.ArrayList;
import java.util.Collections;
class divisible {
    public static void main(String[] args) {
        int n = 12;
        int num = 718;
        int q = num;
        ArrayList<Character> rem = new ArrayList<>();
        while (q != 0) {
            int r = q % n;
            q = q / n;
            if (r < 10) {
                rem.add((char) (r + '0'));
            } else {
                rem.add((char) (r - 10 + 'A'));
            }
        }
        Collections.reverse(rem);
        for (char c : rem) {
            System.out.print(c);
        }
    }
}
