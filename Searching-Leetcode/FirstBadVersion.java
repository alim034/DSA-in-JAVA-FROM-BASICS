//https://leetcode.com/problems/first-bad-version/

class VersionControl 
{
    boolean isBadVersion(int version) 
    {
        return version >= 4; 
    }
}

public class FirstBadVersion extends VersionControl 
{
    public int firstBadVersion(int n) 
    {
        int low = 1;
        int high = n;
        int mid;
        int result = n;

        while (low <= high) {
            mid = low + (high - low) / 2; 
            if (isBadVersion(mid)) 
            {
                result = mid;
                high = mid - 1;
            } 
            else 
            {
                low = mid + 1;
            }
        }
        return result;
    }

    public static void main(String[] args) 
    {
        FirstBadVersion solution = new FirstBadVersion();
        int n = 5;
        int firstBad = solution.firstBadVersion(n);
        System.out.println("The first bad version is: " + firstBad);
    }
}
