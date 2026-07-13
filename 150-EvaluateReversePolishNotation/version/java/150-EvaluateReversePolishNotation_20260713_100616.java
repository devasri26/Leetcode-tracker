// Last updated: 7/13/2026, 10:06:16 AM
1
2import java.util.Stack;
3
4class Solution {
5    public int evalRPN(String[] tokens) {
6        Stack<Integer> stack = new Stack<>();
7
8        for (String token : tokens) {
9            switch (token) {
10                case "+":
11                    stack.push(stack.pop() + stack.pop());
12                    break;
13
14                case "-":
15                    int b = stack.pop();
16                    int a = stack.pop();
17                    stack.push(a - b);
18                    break;
19
20                case "*":
21                    stack.push(stack.pop() * stack.pop());
22                    break;
23
24                case "/":
25                    b = stack.pop();
26                    a = stack.pop();
27                    stack.push(a / b); // Truncates toward zero
28                    break;
29
30                default:
31                    stack.push(Integer.parseInt(token));
32            }
33        }
34
35        return stack.pop();
36    }
37}