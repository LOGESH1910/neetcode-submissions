

public class Solution{
    public static List<List<String>> groupAnagrams(String[] strs) {
        
        Map<String, List<String>> map = new HashMap<>();

        for (String s : strs) {
           
            char[] chars = s.toCharArray();
            Arrays.sort(chars);
            String key = new String(chars);

            
            map.computeIfAbsent(key, k -> new ArrayList<>()).add(s);
        }

       
        return new ArrayList<>(map.values());
    }

   
    public static void main(String[] args) {
        String[] strs1 = {"act","pots","tops","cat","stop","hat"};
        String[] strs2 = {"x"};
        String[] strs3 = {""};

        System.out.println(groupAnagrams(strs1));
        System.out.println(groupAnagrams(strs2));
        System.out.println(groupAnagrams(strs3));
    }
}
