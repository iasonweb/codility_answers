
//  Passing Cars
    public int solution(int[] A) {
        int countElements = 0;
        int countOnes = 0;
        int countZeros = 0;
        int pairs = 0;
        for (int i = A.length - 1; i >= 0; i--) {
            countElements++;
            if (A[i] == 1) countOnes++;
            else {
                countZeros++;
                pairs += countElements - countZeros;
                if (pairs > 1000000000) return -1;
            }
        }
        return pairs;
    }

