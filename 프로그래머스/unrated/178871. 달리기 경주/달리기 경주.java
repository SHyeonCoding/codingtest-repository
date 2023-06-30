import java.util.HashMap;
import java.util.Map;

class Solution {
    public String[] solution(String[] players, String[] callings) {
        Map<String, Integer> map = new HashMap();
        String[] answer = new String[players.length];
        
        for(int i = 0; i < players.length; i++) {
            map.put(players[i], i);
        }
        
        for(int i = 0; i < callings.length; i++) {
            int value = map.get(callings[i]);
            map.put(callings[i], value - 1);
            map.put(players[value - 1], value);
            
            String temp = players[value];
            players[value] = players[value - 1];
            players[value - 1] = temp;
        }
        
        for(Map.Entry<String, Integer> entry : map.entrySet()) {
            answer[entry.getValue()] = entry.getKey();
        }
        
        return answer;
    }
}