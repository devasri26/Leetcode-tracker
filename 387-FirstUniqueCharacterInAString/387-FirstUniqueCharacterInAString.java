// Last updated: 7/9/2026, 9:14:55 AM
class Solution {
    public int firstUniqChar(String s) {
        char st[]=s.toCharArray();
      HashMap<Character,Integer>map=new HashMap<>();
      for(char c:st){
        map.put(c,map.getOrDefault(c,0)+1);
      }
        for (int i = 0; i < st.length; i++) {
            if (map.get(st[i]) == 1) {
                return i;
            }
        }
        return -1;
    }
}
        
    