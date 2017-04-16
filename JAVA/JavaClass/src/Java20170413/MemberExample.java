package Java20170413;

public class MemberExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Member original = new Member("blue","홍길동","12345",25,true);
		
		Member cloned = original.getMember();
		
		System.out.println("[복제 객체의 필드값]");
		System.out.println("id: "+cloned.id);
		System.out.println("name: "+cloned.name);
		System.out.println("password: "+cloned.password);
		System.out.println("age: "+cloned.adult);
		
		System.out.println();
		
		System.out.println("[원본 객체의 필드값]");
		System.out.println("id: "+original.id);
		System.out.println("name: "+original.name);
		System.out.println("password: "+original.password);
		System.out.println("age: "+original.age);
		System.out.println("adult: "+original.adult);
		
	}

}
