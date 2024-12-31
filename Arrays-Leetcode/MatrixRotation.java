// https://leetcode.com/problems/determine-whether-matrix-can-be-obtained-by-rotation/description/

public class MatrixRotation 
{
    public static void main(String[] args) 
    {
        int[][] mat = {
            {0, 1},
            {1, 0}
        };
        int[][] target = {
            {1, 0},
            {0, 1}
        };
        
        MatrixRotation solution = new MatrixRotation();
        boolean result = solution.findRotation(mat, target);
        System.out.println(result);
    }

    public boolean findRotation(int[][] mat, int[][] target) 
    {
        if (equal(mat, target)) return true;
        for (int i = 0; i < 3; i++) 
        {
            mat = rotate(mat);
            if (equal(mat, target)) return true;
        }
        return false;
    }
    

    private int[][] rotate(int[][] mat) 
    {
        int n = mat.length;
        int[][] rotated = new int[n][n];
        for (int i = 0; i < n; i++) 
        {
            for (int j = 0; j < n; j++) 
            {
                rotated[j][n - 1 - i] = mat[i][j];
            }
        }
        return rotated;
    }
    
    private boolean equal(int[][] mat, int[][] target) 
    {
        int n = mat.length;
        for (int i = 0; i < n; i++) 
        {
            for (int j = 0; j < n; j++) 
            {
                if (mat[i][j] != target[i][j]) return false;
            }
        }
        return true;
    }
}
