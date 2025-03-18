class Solution {
    public boolean isPalindrome(int x) {
        int digit = 0;
        int res = 0;
        int temp = x;
		while(x>0) {
			digit = x % 10;
			res = res*10+digit;
			x = x / 10;
		}
		if(temp == res) {
			return(true);
		}
		else {
			return(false);
		}
    }
}