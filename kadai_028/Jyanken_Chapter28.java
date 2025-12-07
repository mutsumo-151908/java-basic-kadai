package kadai_028;

import java.util.HashMap;
import java.util.Scanner;

public class Jyanken_Chapter28 {
	//自分のじゃんけんの手を入力する
	public String getMyChoice() {
		 Scanner scanner = new Scanner(System.in);
		 while(true) {
			 System.out.println("自分のじゃんけんの手を入力しましょう");
			 System.out.println("グーはrockのrを入力しましょう");
			 System.out.println("チョキはscissorsのsを入力しましょう");
			 System.out.println("パーはpaperのpを入力しましょう");
			 
			 String hand =scanner.next(); 
			 if(hand.equals("r") || hand.equals("s") || hand.equals("p")) {
				 scanner.close();
				 
				 return hand;
			 }
				 System.out.println("グーならrを、チョキならsを、パーならpを入力してください。");
				 continue;
		 }
	 }
	
	public String getRandom() {
		String[] cpus = {"r", "s", "p"};
		
		double num = Math.random() * 3;
		int index = (int)Math.floor(num);
		System.out.println(cpus[index]);
		return cpus[index];
	}
	
	public void playGame() {
		HashMap<String,String> hands = new HashMap<String,String>();
		hands.put("r","グー");
		hands.put("s","チョキ");
		hands.put("p","パー");
		
		String myHand = getMyChoice();
		String cpuHand = getRandom();
		
		System.out.println("自分の手は" + hands.get(myHand) + "、対戦相手の手は" + hands.get(cpuHand));
		
		if(myHand.equals(cpuHand)) {
			System.out.println("あいこです");
		}
		else if(
				(myHand.equals("r") && cpuHand.equals("s")) ||
				(myHand.equals("s") && cpuHand.equals("p")) ||
				(myHand.equals("p") && cpuHand.equals("r"))
				) {
			System.out.println("自分の勝ちです");
		}
		else {
			System.out.println("自分の負けです");
		}
	}
}
