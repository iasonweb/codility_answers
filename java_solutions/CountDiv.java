/**
 *
 *  CountDiv
 *
 * */

public class CountDiv {

    public static int solution(int A, int B, int K) {
        if (A%K==0)
            return B/K - A/K + 1;
        return B/K - A/K;
    }


    public static void main(String[] args) {
        Solution s = new Solution();

        System.out.println(s.solution(0, 1, 11));
        System.out.println(s.solution(6, 11, 2));

    }

}
