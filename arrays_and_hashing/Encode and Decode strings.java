//@hello@@ @world@
//8@@hello@@7@world@
class Solution {

    public String encode(List<String> strs) {
        String encoded_str = "";
        for(String str: strs){
            int len = str.length();
            encoded_str += (len + "@" + str);
        }
        return encoded_str;
    }

    public List<String> decode(String str) {
        int n = str.length();
        List<String> decoded_str = new ArrayList<>();
        int i = 0;
        while(i < n){
            String len = "";
            while( str.charAt(i) >= 0 && str.charAt(i) - '0' <= 9){
                len += str.charAt(i);
                i++;
            }
            int size = Integer.parseInt(len);
            i++;
            String st = "";
            int end = i + size;
            while( i < end && i < n){
                st += str.charAt(i);
                i++;
            }
            decoded_str.add(st);
        }
        return decoded_str;
    }
}