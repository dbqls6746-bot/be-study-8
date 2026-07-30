package be_study.quiz;

import java.util.HashMap;

public class Quiz54 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] participant1 = {
		"leo", "kiki", "eden"
		};
		String[] completion1 = {
		"eden", "kiki"
		};

		String[] participant2 = {
		"marina", "josipa", "nikola", "vinko", "filipa"
		};
		String[] completion2 = {
		"marina", "josipa", "nikola", "filipa"
		};


		String[] participant3 = {
		"mislav", "stanko", "ana", "mislav"
		};
		String[] completion3 = {
		"mislav", "stanko", "ana"
		};

		String result1 = solution(participant1, completion1); //leo
		String result2 = solution(participant2, completion2); //vinko
		String result3 = solution(participant3, completion3); //mislav

		System.out.println(result1);
		System.out.println(result2);
		System.out.println(result3);
		}
	
	public static String solution(String[] participant, String[] completion){
		String loser = "";
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		
		for(String player : participant) {
			map.put(player, map.getOrDefault(player, 0)+1);
		}
		
		for(String player : completion) {
			map.put(player, map.get(player)-1);
		}
		
		for(String key : map.keySet()) {
			if(map.get(key) != 0) {
	            loser = key;
	            break;
			}
		}
		
		return loser;
	}

}
