
public class StringMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1 = "SDS Ltd";
		String str2 =  "SAMSUNG";
		String str3 = " dsm ";
		String str4 = "자바 프로그래밍";
		String str5 = String.valueOf(10.5);
		
		System.out.println(str1.substring(4));
		System.out.println(str3.trim());
		System.out.println(str1.substring(0,3));
		System.out.println(str2.concat(str1));
		System.out.println(str2.indexOf("S"));
		System.out.println(str2.lastIndexOf("S"));
		System.out.println(str2.toLowerCase());
		System.out.println(str3.toUpperCase());
		System.out.println(str4.replace("자바","JAVA"));
		System.out.println(str4.charAt(3));
		System.out.println(str5);
		
		if(str1.compareTo(str2)>0){
			System.out.println("SDS Ltd가 더 크다 ");
		}
		else{
			System.out.println("SAMSUNG이 더 크다 ");
		}
		
		System.out.println("");
		String[] arr = str1.split(" ");
		System.out.println("분리된 문자열은 ");
		for(int i=0;i<arr.length;i++){
			System.out.println(arr[i]);
		}
	}

}
