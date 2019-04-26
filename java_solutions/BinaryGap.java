/**
 *
 *  Binary Gap solution
 *
 * */


public class BinaryGap {

    public int solution(int N) {
        String binaryString = Integer.toBinaryString(N);
        int binaryGap = 0, maxBinaryGap = 0;
        boolean canBeGap = false;
        int zeroCounter = 0;
        for (int i = 0; i < binaryString.length(); i++) {
            if (binaryString.charAt(i) == '1') {
                canBeGap = true;
                binaryGap = zeroCounter;
                if (binaryGap > maxBinaryGap) {
                    maxBinaryGap = binaryGap;
                }
                zeroCounter = 0;
            } else if (binaryString.charAt(i) == '0' && canBeGap) {
                    zeroCounter += 1;
            }
        }
        return maxBinaryGap;
    }

    public static void main(String[] args) {
        BinaryGap bGap = new BinaryGap();
        System.out.println(bGap.solution(3));
        System.out.println(bGap.solution(334));
    }

}
