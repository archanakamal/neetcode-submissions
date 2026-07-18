class Solution {
    public String func(String word){
        int freq[]=new int[26];
        StringBuilder key=new StringBuilder();
        for(char ch: word.toCharArray()){
            freq[ch-'a']++;
        }
        for(int i=0;i<26;i++){
            key.append(freq[i]+"#");
        }
        return key.toString();
    }
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String,List<String>> map=new HashMap<>();
        List<List<String>> res=new ArrayList<>();
        for(int i=0;i<strs.length;i++){
            String hash=func(strs[i]);
            if(map.containsKey(hash)){
                map.get(hash).add(strs[i]);
            }
            else{
                List<String> list = new ArrayList<>();
                list.add(strs[i]);
                map.put(hash, list);
            }
        }
        res.addAll(map.values());
        return res;

    }
}
