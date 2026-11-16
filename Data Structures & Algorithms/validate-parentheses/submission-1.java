class Solution {
    public boolean isValid(String s) {
        //convert strign to a char array 
        char[] chars= s.toCharArray();
        //creat a stack 
        Stack <Character> stack= new Stack<>();
        for(char c :chars)
        {
           if(c=='('||c=='{'||c=='[')
           {
            stack.push(c);
           }
           else
           {
            if(c==')')
            {
                if(stack.isEmpty()||stack.pop()!='(')
                {
                    return false;
                }
            }
           }

           //for []
            if(c==']')
            {
                if(stack.isEmpty()||stack.pop()!='[')
                {
                    return false;
                }
            }
            //for {}

             if(c=='}')
            {
                if(stack.isEmpty()||stack.pop()!='{')
                {
                    return false;
                }
            }
        
        }
    
        return stack.isEmpty();
        
    }
}
