package check;

import constants.Constants;

public class Main {
    private static String lastname = "岩本";
	private static String firstname = "大河";
	
	
	public static void main(String[] args) {
		printName(lastname,firstname);
		
		Pet t= new Pet(Constants.CHECK_CLASS_JAVA,Constants.CHECK_CLASS_HOGE);
		Constants b = new Constants();
		
		t.introduce();
		
		RobotPet f = new RobotPet(Constants.CHECK_CLASS_R2D2,Constants.CHECK_CLASS_LUKE);
		
		f.introduce();
	
	}
	
	private static void printName (String lastname,String firstname) {
		//String fullname = lastname + firstname;
		
		System.out.println("printnameメソッド→" + lastname + firstname);
		
	}

}
