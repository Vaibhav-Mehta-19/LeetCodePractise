class Solution {
    public List<String> letterCombinations(String digits) {
        List<String> al = new ArrayList<String>();
        if(digits.length()==0)
        {
            return al;
        }
        al.add("");
        String vals[]= {"0","1","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
        for(int i=0;i<digits.length();i++)
        {
            List<String> temp = new ArrayList<String>();
            String val = vals[digits.charAt(i)-'0'];
            for(int c=0;c<val.length();c++)
            {
                for(String x : al)
                {
                    temp.add(x + val.charAt(c));
                }
            }
            al = temp;
        }
        return al;
    }
}