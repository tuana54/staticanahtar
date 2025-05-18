package staticAnahtar;

public class player {
	public String name;
	public int id;
	//public static String game="stardoll";
	public static int count=0;
	
	public player(String name,int id) {
		this.name=name;
		this.id=id;
		//count++;
	}
	public void login(){
		count++;
	}
}
