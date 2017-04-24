import java.util.StringTokenizer;

public class StringTokenizerExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String text = "홍길동/이수홍/박연수,박태임/앙기모,하하하 ";
	
		StringTokenizer st = new StringTokenizer(text,"/|,");
		int countTokens = st.countTokens();
		for(int i=0;i<countTokens;i++){
			String token = st.nextToken();
			System.out.println(token);
		}
		System.out.println();
		
		st = new StringTokenizer(text, "/");
		while(st.hasMoreTokens()){
			String token = st.nextToken();
			System.out.println();
		}
	}

}
 