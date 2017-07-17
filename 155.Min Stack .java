public class MinStack {
    private List<Integer> head;
    private List<Integer> mIntegers;

    /** initialize your data structure here. */
    public MinStack() {
        head = new LinkedList<>();
        mIntegers = new LinkedList<>();
    }
    
    public void push(int x) {
        head.add(0,x);
        if(mIntegers.isEmpty() || x <= getMin()){
        	mIntegers.add(0,x);
        }
    }
    
    public void pop() {
    	if(!head.isEmpty()){
    		if(head.get(0) == getMin())
    			mIntegers.remove(0);
    		head.remove(0);
    	}
    }
    
    public int top() {
        return head.get(0);
    }
    
    public int getMin() {
        return mIntegers.get(0);
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(x);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */