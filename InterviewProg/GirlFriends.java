package InterviewProg;
class GirlFriend1{
	String a="ramya";
	void loosu() {
		System.out.println("first meet at school and after 1 month");
	}
}

class GirlFriend2 extends GirlFriend1{
	String a="saranya";
	void kullachi() {
		System.out.println("first meet at collage and after 1 year");
	}
}

class GirlFriend3 extends GirlFriend2{
	String a="devavarnani";
	void ammu() {
		System.out.println("first meet at festival and next day");
	}
}
public class GirlFriends {
 public static void main(String args[]) {
	 GirlFriend1 GF = new GirlFriend1();
	 GF.loosu();
	 System.out.println(GF.a+" "+"proposed me");
	 
	 GirlFriend2 GF2 = new GirlFriend2();
	 GF2.kullachi();
	 System.out.println(GF2.a+" "+"proposed me");
		
	 GirlFriend3 GF3 = new GirlFriend3();
	 GF3.ammu();
	 System.out.println(GF3.a+" "+"proposed me");
	 
	 
	 
 }
}
