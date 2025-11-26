package kadai_018;

public abstract class Kato_Chapter18 {
	//フィールド作成
	public String familyName = "加藤";
	public String givenName;
	public String address = "住所は東京都中野区〇×です";
	
	public void setGivenName(String name) {
		this.givenName = name;
	}
	
	
	//メソッド　共通の紹介（名前と住所の出力)
	public void commonIntroduce() {
		System.out.println("名前は" + familyName + givenName + "です");
		System.out.println(address);
	}
	
	//抽象メソッド　個々の紹介
	public abstract void eachIntroduce();
	
	
	//紹介の実行
	public void execIntroduce() {
		commonIntroduce();
		eachIntroduce();
	}
}
