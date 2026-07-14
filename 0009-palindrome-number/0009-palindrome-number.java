class Solution {
    public boolean isPalindrome(int x) {
        int dup = x;
        int reverse = 0;
        if(x<0){
            return false;
        }
        while(x>0){
            int lastdigit = x%10;
            if (reverse > Integer.MAX_VALUE / 10 ||
    (reverse == Integer.MAX_VALUE / 10 && lastdigit > 7)) {
    return false;
}
            reverse = reverse*10+lastdigit;
            x=x/10;
        }
        if(dup==reverse){
            return true;
        }
        else{
            return false;
        }
        
    }
}