import java.math.*;
class Solution {
    public String multiply(String num1, String num2) {
      BigInteger a=new BigInteger(num1);
      BigInteger b=new BigInteger(num2);
     // System.out.println();
      return String.valueOf(a.multiply(b));  
    }
}