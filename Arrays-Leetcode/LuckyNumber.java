// https://leetcode.com/problems/lucky-numbers-in-a-matrix/description/
import java.util.ArrayList;
import java.util.List;

public class LuckyNumber 
{
    public static void main(String[] args) 
    {
        int[][] matrix = {
            {3,7,8},
            {9,11,13},
            {15,16,17}};

        System.out.println(luckynumber(matrix));
    }

    public static List<Integer> luckynumber (int[][] matrix)
    {
        List<Integer> arr = new ArrayList<>();
        for(int i=0; i<matrix.length; i++)
        {
            int minindx = 0;
            int min = 99999999;
            for(int j=0; j<matrix[i].length; j++)
            {
                if(matrix[i][j]<min)
                {
                    min = matrix[i][j];
                    minindx = j;
                }
            }
            boolean istrue = true;
            for(int j=0; j<matrix.length; j++)
            {
                if(matrix[i][minindx] < matrix[j][minindx])
                {
                    istrue = false;
                    break;
                }
            }
            if (istrue) 
            {
                arr.add(matrix[i][minindx]);    
            }
        }
        return arr;
    }
}
