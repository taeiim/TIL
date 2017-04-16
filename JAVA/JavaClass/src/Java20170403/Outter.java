package Java20170403;

public class Outter {
	String field = "Outter-field";
	
	void method(){
		System.out.println("Outter-method");
	}
	
	class Nested{
		String field = "Nasted-field";
		
		void method(){
			System.out.println("Nested-method");
		}
		
		void print(){
			//중첩 객체 참조 
			System.out.println(this.field);
			this.method();
			//만약method2 이면 걍method2() 하면 됨.
			
			//바깥 객체 참조 
			System.out.println(Outter.this.field);
			Outter.this.method();
		}
	}
}
