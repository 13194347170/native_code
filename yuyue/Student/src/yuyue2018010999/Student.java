package yuyue2018010999;

public class Student {
	private int id;
	private String name;
	private String birDate;
	private String gender;
	public int getId(){
		return this.id;
	}
	public String getName(){
		return this.name;
	}
	public String getBirDate(){
		return this.birDate;
	}
	public String getGender(){
		return this.gender;
	}
	public Student(){
		super();
	}
	
	public Student(int id,String name,String birDate,String gender){
		super();
		this.id=id;
		this.name=name;
		this.birDate=birDate;
		this.gender=gender;
	}
}
