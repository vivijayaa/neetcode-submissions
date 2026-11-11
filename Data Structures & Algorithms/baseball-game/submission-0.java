class Solution {
    public int calPoints(String[] operations) {
        Stack<Integer> stack= new Stack<>();
        for(String s:operations)
        {
            if(s.equals("+"))
            {
                int top_element=stack.pop();
                 int sum=top_element + stack.peek();
                stack.push(top_element);
                stack.push(sum);
            }
            else if(s.equals("C"))
            {
                stack.pop();
            }
            else if(s.equals("D"))
            {
                stack.push(2*stack.peek());
            }
            else
            {
                stack.push(Integer.parseInt(s));
            }
        }
        
       int sum =0;
        for( int stk:stack)
        {
            sum+=stk;
        }
        return sum;
    }
}