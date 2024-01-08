import java.io.*;
import java.util.*;
import java.lang.Math;

public class Main {
    public static class Player implements Comparable<Player> {
        int level;
        String name;
        boolean check;
        
        Player(int level, String name) {
            this.level = level;
            this.name = name;
        }

        @Override
        public int compareTo(Player p1) {
            return name.compareTo(p1.name);
        }
    }
    
    public static void main(String args[]) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine());
        int p = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        Player[] players = new Player[p];
        
        for(int i = 0; i < p; i++) {
            st = new StringTokenizer(br.readLine());
            int level = Integer.parseInt(st.nextToken());
            String name = st.nextToken();
            players[i] = new Player(level, name);
        }
        
        for(int i = 0; i < p; i++) {
            ArrayList<Player> room = new ArrayList<>();
            if(!players[i].check) {
                for(int j = i; j < p; j++) {
                    if(room.size() == m) {
                        break;
                    }
                    if(!players[j].check && Math.abs(players[i].level - players[j].level) <= 10) {
                        players[j].check = true;
                        room.add(players[j]);
                    }
                }
                
                Collections.sort(room);
                sb.append(room.size() == m ? "Started!" : "Waiting!").append('\n');
                for(Player player : room) {
                    sb.append(player.level).append(" ").append(player.name).append('\n');
                }
            }
        }
        
        System.out.println(sb);
    }
}