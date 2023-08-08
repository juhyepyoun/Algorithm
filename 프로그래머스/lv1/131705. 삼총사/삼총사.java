class Solution {
    public static int cnt = 0;
    public int solution(int[] number) {
        boolean[] visited = new boolean[number.length];
        combination(number, visited, 0, 3);
        return cnt;
    }
    
    public void combination(int[] arr, boolean[] visited, int start, int r) {
        if(r == 0) {
            count(arr, visited);
            return;
        } else {
            for(int i = start; i < arr.length; i++) {
                visited[i] = true;
                combination(arr, visited, i + 1, r - 1);
                visited[i] = false;
            }
        }
    }

    public void count(int[] arr, boolean[] visited) {
        int sum = 0;
        for(int i = 0; i < arr.length; i++) {
            if(visited[i]) {
                System.out.print(arr[i] + " ");
                sum += arr[i];
            }
        }
        if(sum == 0) {
            cnt++;
        }
        System.out.println();
    }
}