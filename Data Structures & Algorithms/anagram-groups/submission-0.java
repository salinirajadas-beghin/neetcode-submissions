class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        if(1<=strs.length && strs.length <= 1000) {
            HashMap<String,List<String>> map = new HashMap<String,List<String>>();
            for(String s: strs) {
                char [] key = s.toCharArray();
                Arrays.sort(key);
                 String stringValue = String.valueOf(key);
                if(!map.containsKey(stringValue)) {
                    ArrayList<String> values = new ArrayList<>();
                    values.add(s);
                    map.put(stringValue, values);
                } else {
                    map.get(stringValue).add(s);
                }
            }
            return new ArrayList<>(map.values());
        }
      return  new ArrayList<List<String>>(Arrays.asList(Arrays.asList(strs)));
}
}
