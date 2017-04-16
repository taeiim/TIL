package Java20170330;

public class DBUser1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Oracle user = new Oracle();
		
		user.connetion();
		user.runTransaction();
		user.commit();
		
	}

}