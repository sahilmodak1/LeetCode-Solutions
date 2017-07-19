public class GuessNumberHigherOrLower extends GuessGame {
    public int guessNumber(int n) {
        int low = 1;
        int high = n;
        while (low <= high) 
        {
            int mid = low + (high - low) / 2;
            int x = guess(mid);
            
            if (x == -1)
                high = mid - 1;
            else if(x == 1)
                low = mid + 1;
            else if (x == 0)
                return mid;
        }
        return 0;
    }
}