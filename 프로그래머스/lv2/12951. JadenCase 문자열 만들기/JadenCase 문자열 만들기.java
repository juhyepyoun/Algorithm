class Solution {
    public String solution(String s) {
        String[] strArr = s.split(" ", -1);
        for(int i = 0; i < strArr.length; i++) {
            String str = strArr[i];
            if(str.length() == 0) {
                continue;
            }
            str = str.toLowerCase();
            char[] chArr = str.toCharArray();
            chArr[0] = Character.toUpperCase(chArr[0]);
            strArr[i] = new String(chArr);
        }
        String answer = String.join(" ", strArr);
        return answer;
    }
}