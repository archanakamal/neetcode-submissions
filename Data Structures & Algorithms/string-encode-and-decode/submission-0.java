class Solution {

    public String encode(List<String> strs) {
        StringBuilder res=new StringBuilder();
        for(int i=0;i<strs.size();i++){
            int size=strs.get(i).length();
            res.append(size);
            res.append("#");
            res.append(strs.get(i));
        }

        return res.toString();
    }

    public List<String> decode(String str) {
            List<String> res = new ArrayList<>();

    int i = 0;

    while (i < str.length()) {

        // Find the position of '#'
        int j = i;
        while (str.charAt(j) != '#') {
            j++;
        }

        // Get the length
        int len = Integer.parseInt(str.substring(i, j));

        // Move to the first character of the word
        int start = j + 1;

        // Extract the word
        String word = str.substring(start, start + len);

        // Add to answer
        res.add(word);

        // Move i to the next encoded string
        i = start + len;
    }

    return res;
    }
}
