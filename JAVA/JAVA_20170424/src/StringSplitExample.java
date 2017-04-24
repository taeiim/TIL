
public class StringSplitExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String text = "홍길동 &이수홍,박연수,김자바-최명호,,김수연,박박이,이이이,이율곡|이순신?세종 ";
		 
		String[] names = text.split("&|,|-|,박|\\||\\?");
		
		for(String name : names){
			System.out.println(name);
		}
	}

}
