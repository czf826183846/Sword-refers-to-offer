public class Solution {
    public String replaceSpace(StringBuffer str) {
    	for(int i = 0 ; i < str.length() ; i++){
            if(str.charAt(i) == ' '){
                str.deleteCharAt(i);
                str.insert(i,"%20");
                i = i + 2;
            }
            else continue;
        }
        return str.toString();
    }
}
