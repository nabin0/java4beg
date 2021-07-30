public class add_two_matrix {
    public static void main(String[] args) {
        int n = 3;
        int m = 3;
        int[][] m1 = { { 2, 4, 6 },
                       { 1, 7, 5 },
                       { 5, 3, 3 } };
                       
        int[][] m2 = { { 3, 2, 1 },
                       { 7, 9, 9 },
                       { 11, 6, 4 } };
        int[][] res = new int[3][3];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                res[i][j] = m1[i][j] + m2[i][j];
            }
        }

        // Printing result
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(res[i][j] + " ");
            }
            System.out.print("\n");
        }
    }
}
