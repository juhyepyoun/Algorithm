class Solution {
    public int solution(int n, int[][] computers) {
        int answer = 0;
        
        boolean[] visited = new boolean[computers.length];
        
        for(int i = 0; i < computers.length; i++) {
            if(visited[i] == false) {
                dfs(i, visited, computers);
                answer++;
            }
        }
        
        return answer;
    }
    
    public void dfs(int node, boolean[] visited, int[][] computers) {
        visited[node] = true;
        
        for(int i = 0; i < computers.length; i++) {
            if(i != node && visited[i] == false && computers[node][i] == 1) {
                dfs(i, visited, computers);
            }
        }
    }
}