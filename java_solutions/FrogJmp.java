// For more information about the task see codility.com
// Frog Jump


class Solution {

    public int solution(int X, int Y, int D) {
        if (X == Y) {
            return 0;
        } else {
            int distance = Y - X;
            if (distance % D == 0) {
                return (int)(distance / D);
            } else {
                return (int)(distance / D + 1);
            }
        }
    }

}
