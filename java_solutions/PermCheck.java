/**
 *
 *  PermCheck
 *  Check whether array A is a permutation.
 *
 * */

import java.util.Arrays;


public class PermCheck {

    public int solution(int[] A) {
        Arrays.sort(A);
        for (int i = 0; i < A.length; i++) {
            if (A[i] != (i + 1)) {
                return 0;
            }
        }
        return 1;
    }

    public static void main(String[] args) {
        PermCheck permCheck = new PermCheck();
        int[] a = {3, 2, 1, 4, 5};
        int[] b = {2, 1, 3, 4, 6};

        System.out.println(permCheck.solution(a));
        System.out.println(permCheck.solution(b));
    }
    
}
