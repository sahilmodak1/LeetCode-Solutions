/*
Count the number of segments in a string, where a segment is defined to be a contiguous sequence of non-space characters.

Please note that the string does not contain any non-printable characters.

Example:

Input: "Hello, my name is John"
Output: 5
*/
public class NumberOfSegmentsInAString {
    public int countSegments(String s) {
       if(s.trim().length() == 0)
            return 0;
       return s.trim().split("\\s+").length; 
    }
}