class Solution {
    public String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = new String[n];
        for(int i = 0; i < n; i++) {
            String bin = Integer.toBinaryString(arr1[i] | arr2[i]);
            bin = String.format("%0"+n+"d", Long.parseLong(bin));
            answer[i] = bin.replace('1', '#').replace('0', ' ');
        }
        return answer;
    }
}