/*
Given an integer, write a function to determine if it is a power of two.
*/
public class PowerOfTwo {
    public boolean isPowerOfTwo(int n) {
        return (Math.log10(n)/Math.log10(2)%1 == 0);
    }
}