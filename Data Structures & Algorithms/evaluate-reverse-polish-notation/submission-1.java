class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> stack= new Stack();
        for( String s: tokens){
            
            if(s.equals("+")||s.equals("-")||s.equals("/")||s.equals("*")){
            int temp2=stack.pop();
            int temp1=stack.pop();
            switch (s){
            case "+":
                stack.push(temp1+temp2);
                break;
            case "-":
                stack.push(temp1-temp2);
                break;
            case "*":
                stack.push(temp1*temp2);
                break;
            case "/":
                stack.push(temp1/temp2);
                break;
            default:
                break;
            }
            }
            else{
                stack.push(Integer.parseInt(s));
            }

        }
        return stack.pop();
    }
}
