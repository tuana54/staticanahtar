package staticAnahtar;

public class Course {
	public String name;
	public String code;
	public int note;
	
	public Course(String name,String code,int note) {
		this.name=name;
		this.code=code;
		this.note=note;
	}
	public static void avarage(int[]notes) {
		double total=0;
		for(int i:notes) {
			total+=i;
		}
		double avar=total/notes.length;
		System.out.println("ortalamanız:"+avar);
	}
}
