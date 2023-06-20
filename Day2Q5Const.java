package basic.exercise;

public class Day2Q5Const {
	public int id;
	public String name;
	public long phonenumber;
	public String country;

	public Day2Q5Const() {

	}

//	public static void main(String[] args) {

	public Day2Q5Const(int id, String name, long phonenumber, String country) {
		System.out.println("4 parameter constructor called");
		this.id = id;
		this.name = name;
		this.phonenumber = phonenumber;
		this.country = country;
	}

}
