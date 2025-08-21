class Solution {

    public String encode(List<String> strs) {
        String res = "";
        for(String str : strs) {
            int length = str.length();
            res += length + "#" + str; // delimeter to separate words with their length
        }
        System.out.println(res);

        return res;
    }

    public List<String> decode(String str) {
        List<String> res = new ArrayList<>();
        int prev = 0;
        int i = 0;
        while(i < str.length() && prev < str.length()) {
            if(str.charAt(i) == '#') {
                int num = Integer.parseInt(str.substring(prev, i));
                String word = str.substring(i + 1, i+1+num);
                res.add(word);
                prev = num + i + 1;
                i += num + 1;
            } else {
                i++;
            }
        }
        return res;
    }
  
}
