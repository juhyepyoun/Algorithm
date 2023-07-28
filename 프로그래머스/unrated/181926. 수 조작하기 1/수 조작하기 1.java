class Solution {
    public int solution(int n, String control) {
        int answer = n;
        String[] array = control.split("");
        for(String str : array) {
            switch(str) {
                case "w": 
                    answer++;
                    break;
                case "s":
                    answer--;
                    break;
                case "d":
                    answer+=10;
                    break;
                case "a":
                    answer-=10;
                    break;
            }
        }
        return answer;
    }
}