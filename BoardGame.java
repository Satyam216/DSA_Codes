import java.util.*;

public class BoardGame {

    static class Cell {
        int row, col, dist;
        Cell(int row, int col, int dist) {
            this.row = row;
            this.col = col;
            this.dist = dist;
        }
    }

    static int[][] getDirections(int[] moveRule) {
        int dx = moveRule[0], dy = moveRule[1];
        return new int[][] {
            {dx, dy},      // forward
            {dy, -dx},     // right
            {-dy, dx},     // left
            {-dx, -dy}     // back
        };
    }

    public static int minMoves(int[][] grid, int[] source, int[] dest, int[] moveRule) {
        int m = grid.length;
        int n = grid[0].length;
        boolean[][] visited = new boolean[m][n];

        Queue<Cell> queue = new LinkedList<>();
        queue.offer(new Cell(source[0], source[1], 0));
        visited[source[0]][source[1]] = true;

        while (!queue.isEmpty()) {
            Cell curr = queue.poll();

            if (curr.row == dest[0] && curr.col == dest[1]) {
                return curr.dist;
            }

            for (int[] dir : getDirections(moveRule)) {
                int newRow = curr.row + dir[0];
                int newCol = curr.col + dir[1];

                if (newRow >= 0 && newRow < m && newCol >= 0 && newCol < n &&
                        grid[newRow][newCol] == 0 && !visited[newRow][newCol]) {
                    visited[newRow][newCol] = true;
                    queue.offer(new Cell(newRow, newCol, curr.dist + 1));
                }
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int m = sc.nextInt();
        int n = sc.nextInt();

        int[][] grid = new int[m][n];
        for (int i = 0; i < m; i++)
            for (int j = 0; j < n; j++)
                grid[i][j] = sc.nextInt();

        int[] source = new int[2];
        source[0] = sc.nextInt();
        source[1] = sc.nextInt();

        int[] dest = new int[2];
        dest[0] = sc.nextInt();
        dest[1] = sc.nextInt();

        int[] moveRule = new int[2];
        moveRule[0] = sc.nextInt();
        moveRule[1] = sc.nextInt();

        System.out.println(minMoves(grid, source, dest, moveRule));
    }
}
