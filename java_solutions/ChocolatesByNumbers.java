public class ChocolatesByNumbers {

class Solution {
    public int solution(int N, int M) {
        if (M > N) {
            M %= N;
        }
        int counter = 0;
        int[] a = new int[N];
        for (int i = 0; i < N; i++) a[i] = i;
        int j = 0;
        while (a[j] != -1) {
            counter += 1;
            a[j] = -1;
            j += M;
            if (j > (N - 1)) j %= N;
        }
        
        return counter;
    }
}
    
    public static void main(String[] args) {
        System.out.println(solution(10, 4));
        System.out.println();
        System.out.println(solution(12, 23));
        System.out.println(solution(12, 11));
    }

}
