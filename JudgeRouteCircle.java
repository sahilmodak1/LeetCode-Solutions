/*
Initially, there is a Robot at position (0, 0). Given a sequence of its moves, judge if this robot makes a circle, which means it moves back to the original place.

The move sequence is represented by a string. And each move is represent by a character. The valid robot moves are R (Right), L (Left), U (Up) and D (down). The output should be true or false representing whether the robot makes a circle.

Example 1:
Input: "UD"
Output: true


Example 2:
Input: "LL"
Output: false
*/
public class JudgeRouteCircle {
    public boolean judgeCircle(String moves) {
        int[] a=new int[2];
        int name;
        
        for(char c:moves.toCharArray())
            name = c=='U'?a[0]++:(c=='D'?a[0]--:(c=='R'?a[1]++:a[1]--));
        
        return a[0]==0 && a[1]==0;
    }
}