// https://leetcode.com/problems/kids-with-the-greatest-number-of-candies/description/
import java.util.ArrayList;
import java.util.List;

public class GreatestNumberOfCandies 
{
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) 
    {
        List<Boolean> result = new ArrayList<>();
        int maxCandies = 0;

        // Find the maximum number of candies any kid currently has
        for (int candy : candies) 
        {
            if (candy > maxCandies) 
            {
                maxCandies = candy;
            }
        }

        // Determine if each kid can have the greatest number of candies
        for (int candy : candies) 
        {
            if (candy + extraCandies >= maxCandies) 
            {
                result.add(true);
            } 
            else 
            {
                result.add(false);
            }
        }

        return result;
    }

    public static void main(String[] args) 
    {
        GreatestNumberOfCandies solution = new GreatestNumberOfCandies();
        
        int[] candies1 = {2, 3, 5, 1, 3};
        int extraCandies1 = 3;
        System.out.println(solution.kidsWithCandies(candies1, extraCandies1)); 

        int[] candies2 = {4, 2, 1, 1, 2};
        int extraCandies2 = 1;
        System.out.println(solution.kidsWithCandies(candies2, extraCandies2)); 

        int[] candies3 = {12, 1, 12};
        int extraCandies3 = 10;
        System.out.println(solution.kidsWithCandies(candies3, extraCandies3)); 
    }
}

