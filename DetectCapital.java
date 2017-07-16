public class DetectCapital {
    public boolean detectCapitalUse(String word) {
        if (word.toUpperCase().equals(word)) 
            return true;
        if (word.substring(1).toLowerCase().equals(word.substring(1))) 
            return true;
        
        return false;
}
}