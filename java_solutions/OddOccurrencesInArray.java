import java.util.Arrays;

public class OddOccurrencesInArray {

	public int solution(int[] A) {
		int element = 0;
		for (int i = 0; i < A.length; i++) {
			element ^= A[i];
		}
		return element;
	}
	
	public static void main(String[] args) {
		int[] A = {7, 5, 6, 6, 5};
		OddOccurrencesInArray oddOccurrencesInArray = new OddOccurrencesInArray();
		System.out.println(oddOccurrencesInArray.solution(A));
	}

}
