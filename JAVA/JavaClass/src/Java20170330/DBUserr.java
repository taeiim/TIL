package Java20170330;

interface inter{
	void Oracle(String connetion,String run,String commit);
	void DB2(String login, String use,String save);
}

class interImp1 implements inter{
	@Override
	public void Oracle(String connetion,String run, String commit){
		
	}
	
	@Override
	public void DB2(String login, String use,String save){
		
	}
}
public class DBUserr {

	public static void main(String[] args) {
		inter face = new interImp1();
		
		face.Oracle();
		face.DB2();
	}

}
