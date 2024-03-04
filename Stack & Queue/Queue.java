import java.util.Stack;
public class Queue {
    private Stack<Integer> stack1 = new Stack<>();
    private Stack<Integer> stack2 = new Stack<>();

    public Queue() {
        
    }
    
    public void push(int x) {
        stack1.push(x);
    }
    
    public int pop() {
        if (empty()) {
            return -1; 
        }
        if (stack2.isEmpty()) {
            while (!stack1.isEmpty()) {
                stack2.push(stack1.pop());
            }
        }
        return stack2.pop();
    }
    
    public int peek() {
        if (empty()) {
            return -1;
        }
        if (stack2.isEmpty()) {
            while (!stack1.isEmpty()) {
                stack2.push(stack1.pop());
            }
        }
        return stack2.peek();
    }
    
    public boolean empty() {
        return stack1.isEmpty() && stack2.isEmpty();
    }

public static void main(String[] args) {
        Queue myQueue = new Queue();
        
        myQueue.push(1);
        myQueue.push(2);
        System.out.println(myQueue.peek());  // Output: 1
        System.out.println(myQueue.pop());   // Output: 1
        System.out.println(myQueue.empty()); // Output: false
    }
}