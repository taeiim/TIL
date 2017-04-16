package Java20170406;

public class Key {
public int number;
	
	public Key(int number){
		this.number = number;
	}
	
	@Override
	public boolean equals(Object obj){
		System.out.println("equals");
		if(obj instanceof Key){
			Key compareKey = (Key) obj;
			if(this.number == compareKey.number){
				return true;
			}
		}
		return false;
	}
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		System.out.println("hashCode : "+number);
		return number;
		
	}
}

