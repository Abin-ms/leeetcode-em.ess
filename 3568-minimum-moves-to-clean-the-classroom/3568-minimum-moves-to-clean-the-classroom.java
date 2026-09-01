class Solution {
    public int minMoves(String[] classroom, int energy) {

        int m = classroom.length;
        int n = classroom[0].length();

        int startRow = 0;
        int startCol = 0;

        
        List<int[]> litter = new ArrayList<>();

        
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {

                char ch = classroom[i].charAt(j);

                if (ch == 'S') {
                    startRow = i;
                    startCol = j;
                }

                if (ch == 'L') {
                    litter.add(new int[]{i, j});
                }
            }
        }

        int k = litter.size();

        if (k == 0) {
            return 0;
        }

        
        int[][] litterId = new int[m][n];

        for (int[] row : litterId) {
            Arrays.fill(row, -1);
        }

        for (int i = 0; i < k; i++) {
            int r = litter.get(i)[0];
            int c = litter.get(i)[1];

            litterId[r][c] = i;
        }

        
        int target = (1 << k) - 1;

        
        Queue<int[]> queue = new LinkedList<>();

        queue.offer(new int[]{
            startRow,
            startCol,
            energy,
            0,
            0
        });

        
        boolean[][][][] visited =
                new boolean[m][n][energy + 1][1 << k];

        visited[startRow][startCol][energy][0] = true;

        
        int[][] directions = {
            {-1, 0},
            {1, 0},
            {0, -1},
            {0, 1}
        };

        while (!queue.isEmpty()) {

            int[] current = queue.poll();

            int r = current[0];
            int c = current[1];
            int currentEnergy = current[2];
            int mask = current[3];
            int moves = current[4];

            
            if (mask == target) {
                return moves;
            }

            
            if (currentEnergy == 0) {
                continue;
            }

            
            for (int[] dir : directions) {

                int nr = r + dir[0];
                int nc = c + dir[1];

                
                if (nr < 0 || nr >= m || nc < 0 || nc >= n) {
                    continue;
                }

                
                if (classroom[nr].charAt(nc) == 'X') {
                    continue;
                }

                
                int newEnergy = currentEnergy - 1;

               
                if (classroom[nr].charAt(nc) == 'R') {
                    newEnergy = energy;
                }

                
                int newMask = mask;

                if (litterId[nr][nc] != -1) {
                    int id = litterId[nr][nc];

                    newMask = mask | (1 << id);
                }

                
                if (visited[nr][nc][newEnergy][newMask]) {
                    continue;
                }

                visited[nr][nc][newEnergy][newMask] = true;

                queue.offer(new int[]{
                    nr,
                    nc,
                    newEnergy,
                    newMask,
                    moves + 1
                });
            }
        }

        return -1;
    }
}