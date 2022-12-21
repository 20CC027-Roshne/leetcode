class Solution {
    public String reverseString(String s) 
    {
    		int n = s.length();
    		char c;
    		StringBuffer m = new StringBuffer();
    		for (int i = n-1;i>-1;i--)
    		{
    			c = s.charAt(i);
    			m.append(c);
    		}
    		s=m.toString();
    		return s;        
    }
}
