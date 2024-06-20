class MyQueue {
 List<Integer> arr;
 int f;
 int l;
    public MyQueue() {
      arr=new ArrayList<>();
      f=0;
      l=0;  
    }
    
    public void push(int x) {
     arr.add(l,x);
     l++;   
    }
    
    public int pop() {
      f++;
      return(arr.get(f-1));  
    }
    
    public int peek() {
      return(arr.get(f));  
    }
    
    public boolean empty() {
      if(f>=l)
      return true;
      return false;  
    }
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */