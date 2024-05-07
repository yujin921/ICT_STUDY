package Study_Group;

import java.util.*;

public class Solution {
    public String solution(String[][] id_pw, String[][] db) {
        Map<String, String> id_pw_map = new HashMap<>();
        for (String[] pair : id_pw) {
            id_pw_map.put(pair[0], pair[1]);
        }

        Map<String, String> db_map = new HashMap<>();
        for (String[] user : db) {
            db_map.put(user[0], user[1]);
        }

        for (Map.Entry<String, String> entry : id_pw_map.entrySet()) {
            String id = entry.getKey();
            String pw = entry.getValue();
            if (db_map.containsKey(id)) {
                if (db_map.get(id).equals(pw)) {
                    return "login";
                } else {
                    return "wrong pw";
                }
            }
        }
        return "fail";
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        String[][] id_pw = {{"meosseugi", "1234"}};
        String[][] db = {{"rardss", "123"}, {"yyoom", "1234"},{"meosseugi","1234"}};
        System.out.println(solution.solution(id_pw, db)); // Output: "login"
    }
}