public class MinPerimeterRectangle {

    private static int solution(int N) {
        int a = 1;
        int e = N;
        int min = 2 * (a + e);
        int currentMin = 0;
        if (isPrime(N)) {
                return min;
            } else {
                while (a <= e) {
                    if (a * e == N) {
                        currentMin = 2 * (a + e);
                        if (currentMin < min) min = currentMin;
                    }
                    a += 1;
                    if (N % a == 0) e = N / a;
                }
                return min;
            }
    }

    public static boolean isPrime(int number) {
        boolean prime = true;
        for (int i = 2; i <= number; i++) {
            if (number % 2 == 0)
                return false;
        }
        return prime;
    }
    
    public static void main(String[] args) {
        System.out.println(solution(30));
        System.out.println(solution(34));
        System.out.println(solution(36));
        System.out.println(solution(1));
        System.out.println(solution(2));
        System.out.println(solution(4));
        System.out.println(solution(24));
    }

}
