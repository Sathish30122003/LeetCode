class MyStack {
   int i;
   List<Integer> arr;
    public MyStack() {
       arr=new ArrayList<>();  
      i=0;
    }
    
    public void push(int x) {
      arr.add(i,x);
      i++;  
    }
    
    public int pop() {
        i--;
        return arr.get(i);
    }
    
    public int top() {
      return arr.get(i-1);  
    }
    
    public boolean empty() {
      if(i>0)
      {System.out.println(arr.size());
      return false;}
      return true;  
    }
}

/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */