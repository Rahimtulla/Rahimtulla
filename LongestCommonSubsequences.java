package practicejava;

public class LongestCommonSubsequences {
    public static void main(String[] args) {
        String text1= "abcde";
        String text2= "ace";
        int n = text1.length();
        int m = text2.length();
        int[][] dpGrid = new int[n + 1][m + 1];
        StringBuilder stringBuilder= new StringBuilder();
        stringBuilder.length();

        for (int row = n - 1; row >= 0; row--) {
            for (int col = m - 1; col >= 0; col--) {
                if (text1.charAt(row) == text2.charAt(col)) {
                    dpGrid[row][col] = 1 + dpGrid[row + 1][col + 1];
                } else {
                    dpGrid[row][col] = Math.max(dpGrid[row + 1][col], dpGrid[row][col + 1]);
                }
            }
        }
        System.out.println(dpGrid[0][0]);
    }
}