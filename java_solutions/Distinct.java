import java.util.Arrays;


public class Distinct {

	public int solution(int[] A) {
		Arrays.sort(A);
		int dublicated = 0;
		for (int i = 1; i < A.length; i++) {
			if (A[i] == A[i - 1]) dublicated += 1;
		}
		return A.length - dublicated;
	}

	public static void main(String[] args) {
		Solution s = new Solution();
		int[] A = {2, 1, 1, 2, 3, 1};
		System.out.println(s.solution(A));
	}

}
