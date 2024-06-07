/** 
 * Forward declaration of guess API.
 * @param  num   your guess
 * @return 	     -1 if num is higher than the picked number
 *			      1 if num is lower than the picked number
 *               otherwise return 0
 * int guess(int num);
 */

public class Solution extends GuessGame {
    public int guessNumber(int n) {
     int st=1,en=n;
     while(st<=en){
        int mid=st+(en-st)/2;
        System.out.println(mid);
        if(guess(mid)==0)
        return mid;
        else if(guess(mid)==-1)
        en=mid-1;
        else
        st=mid+1;
     }   
     return 0;
    }
}