class Solution {
    public boolean lemonadeChange(int[] bills) {
        Stack<Integer> five=new Stack<>();
        Stack<Integer> ten=new Stack<>();
        for(int i=0;i<bills.length;i++){
            if(bills[i]==5)
            five.push(5);
            else if(bills[i]==10){
                if(five.size()>0){
                    ten.push(10);
                    five.pop();
                }
                else{
                    return false;
                }
            }
            else if(bills[i]==20){
                if(ten.size()>0&&five.size()>0){
                    ten.pop();
                    five.pop();
                }
                else if(five.size()>=3){
                    five.pop();
                    five.pop();
                    five.pop();
                }
            
               else{
                return false;
            }
            }
            System.out.println(five.size()+"  "+ten.size());
        }
        return true;
    }
}