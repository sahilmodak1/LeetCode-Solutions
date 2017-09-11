/*
Implement a basic calculator to evaluate a simple expression string.

The expression string contains only non-negative integers, +, -, *, / operators and empty spaces . The integer division should truncate toward zero.

You may assume that the given expression is always valid.

Some examples:
"3+2*2" = 7
" 3/2 " = 1
" 3+5 / 2 " = 5
*/
class BasicCalculatorII {
    public int calculate(String s) {
    
    if(s==null || s.length()==0) 
        return 0;
    
    Stack<Integer> st = new Stack<Integer>();
    int num = 0;
    char operation = '+';
    
    for(int i=0;i<s.length();i++)
    {
        if(Character.isDigit(s.charAt(i)))
            num = num*10+s.charAt(i)-'0';   //For more than 1 digit numbers
            
        if((!Character.isDigit(s.charAt(i)) && s.charAt(i) != ' ') || i==s.length()-1)
        {
            //check with previous operation
            if(operation=='-')
                st.push(-num);
            
            if(operation=='+')
                st.push(num);
            
            if(operation=='*')
                st.push(st.pop()*num);
            
            if(operation=='/')
                st.push(st.pop()/num);
            
            operation = s.charAt(i);         //update next operation to do
            num = 0;
        }
    }

    int ans = 0;
    for(int i:st)
        ans += i;
    
    return ans;
    }
}