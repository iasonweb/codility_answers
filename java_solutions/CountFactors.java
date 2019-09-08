public class CountFactors {

    private static int solution(int N) {
        int a = 1;
        int e = N;
        int count = 0;
        while (a <= e) {
            if (a * e == N) {
                if (a != e) {
                    count += 2;
                } else {
                    count += 1;
                }
            }
            a += 1;
            if (N % a == 0) e = N / a;
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(solution(23));
        System.out.println(solution(34));
        System.out.println(solution(36));
        System.out.println(solution(1));
        System.out.println(solution(2));
        System.out.println(solution(4));
        System.out.println(solution(24));
    }

}
