package kadai_021;
import java.util.HashMap;

public class Dictionary_Chapter21 {
	
	public static void main(String[] args) {
	
	HashMap<String,String> word = new HashMap<String,String>();
	
		word.put("apple","りんご");
		word.put("peach","桃");
		word.put("banana","バナナ");
		word.put("lemon","レモン");
		word.put("pear","梨");
		word.put("kiwi","キウイ");
		word.put("strawberry","いちご");
		word.put("grape","ぶどう");
		word.put("muscat","マスカット");
		word.put("cherry","さくらんぼ");
			
		String[] search = {"apple","banana","grape","orange"};
		
		for(String key : search) {
			if(word.containsKey(key)) {
				System.out.println(key + "の意味は" + word.get(key));
			}else {
				System.out.println(key + "は辞書には存在しません");
		}

     }
   }
}