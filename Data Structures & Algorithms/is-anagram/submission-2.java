class Solution {
    public boolean isAnagram(String s, String t) {
        char ch[]=s.toCharArray();
        Arrays.sort(ch);
        String st=new String(ch);
        char lb[]=t.toCharArray();
        Arrays.sort(lb);
        String str=new String(lb);
        if(st.equals(str))return true;
        else return false;
      
    }
}
