public class PowerOfFour {
    public boolean isPowerOfFour(int num) {
        if(Math.log(num)/Math.log(4) == (int)(Math.log(num)/Math.log(4)))
            return true;
        
        return false;
    }
}