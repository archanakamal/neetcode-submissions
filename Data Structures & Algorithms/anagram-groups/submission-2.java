class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> res=new ArrayList<>();
        HashMap<String,List<String>> map=new HashMap<>();

        for(int i=0;i<strs.length;i++){
            String word=strs[i];
            char[] arr=word.toCharArray();
            Arrays.sort(arr);
            String key=String.valueOf(arr);

            if(!map.containsKey(key)){
                map.put(key,new ArrayList<>());
                map.get(key).add(word);
            }
            else{
                map.get(key).add(word);
            }
        }
        
        for(List<String> val:map.values()){
            res.add(val);
        }

        return res;
    }
}
