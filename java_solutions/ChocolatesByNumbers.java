public class ChocolatesByNumbers {

    public int solution(int N, int M) {
        int i = 0;
        int counter = 0;
        int[] arr = new int[N];
        while (arr[i] == 0) {
            arr[i] = 1;
            counter += 1;
            i = (i + M) % N;
        }
        return counter;
    }

    public static void main(String[] args) {
        ChocolatesByNumbers cbn = new ChocolatesByNumbers();
        cbn.solution(10, 4);
    }
}
