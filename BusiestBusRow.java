public class BusiestBusRow {

    public static void busiestRow(int[][] grid) {
        int maxSum = 0;
        int bestRow = 0;

        for (int i = 0; i < grid.length; i++) {
            int rowSum = 0;

            for (int j = 0; j < grid[i].length; j++) {
                rowSum += grid[i][j];
            }

            if (rowSum > maxSum) {
                maxSum = rowSum;
                bestRow = i;
            }
        }

        System.out.println("Row " + bestRow + ", Total " + maxSum);
    }

    public static void main(String[] args) {
        int[][] grid = {
                {2, 0, 1},
                {3, 3, 1},
                {1, 1, 1}
        };

        busiestRow(grid);
    }
}
