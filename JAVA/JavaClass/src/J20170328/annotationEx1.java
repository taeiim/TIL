package J20170328;

import java.lang.annotation.*;
import java.lang.reflect.*;

@Retention(RetentionPolicy.RUNTIME)
@interface maker {
	int num();
	String name();
	String id();
	String date() default "2077-7";
}

@maker(id="111", num=1,name="Dominica")
public class annotationEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(Annotation a : annotationEx1.class.getAnnotations()){
			System.out.println(" "+a);
		}
		
		System.out.println("String 생성자");
		for(Constructor c : String.class.getConstructors()){
			System.out.println(c);
		}
		
		System.out.println("String 메서드");
		for(Method m : String.class.getMethods()){
			System.out.println(m);
		}
		
		System.out.println("String 필드");
		for(Field f:String.class.getFields()){
			System.out.println(f);
		}
		
	}

}
