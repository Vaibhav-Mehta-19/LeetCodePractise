class Solution {
    public int myAtoi(String s) {
        String ss = s.trim();
        char c=' ';
        
        if(ss.length()<=0)
        {
            return 0;
        }
        if(ss.charAt(0)=='+' || ss.charAt(0)=='-')
        {
            c = ss.charAt(0);
            ss = ss.substring(1);
        }
        int i=0;
        String ans="";
        while(i<ss.length() && '0'<=ss.charAt(i) && ss.charAt(i)<='9')
        {
            ans+=ss.charAt(i);
            i++;
        }
        double n = 0;
        int j=0;
        while(j<ans.length())
        {
            n = n*10 + (ans.charAt(j) - '0');
            j++;
        }
        if(c=='-')
        {
            n = -n;
        }
        if(n>Integer.MAX_VALUE)
        {
            n = Integer.MAX_VALUE;
        }
        if(n<Integer.MIN_VALUE)
        {
            n = Integer.MIN_VALUE;
        }
        return (int) n;
    }
}