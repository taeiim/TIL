package J20170328;

import java.lang.annotation.*;
import java.lang.reflect.*;

@Retention(RetentionPolicy.RUNTIME);
@Target(ElementType.FIELD)
@interface PrintToString{
		
}

class ToStringHelper{
	public static String toString(Object obj){
		StringBuffer sb = new StringBuffer();
		Class clazz = obj.getClass();
		for(Field field : clazz.getDeclaredFields()){
			if(field.isAnnotationPresent(PrintToString.class))
			{
				String fieldName = field.getName();
				fieldName = "get"+
				fieldName.substring(0, 1).toUpperCase()+
				fieldName.substring(1);
				
				Method method = null;
					try{
						method = clazz.getMethod(fieldName, null)
					}catch(NoSuchMethodException | SecurityException e){
						e.printStackTrace();
					}
				Object value = null;
					try{
						value = method.invoke(obj);
					}catch(IllegalAccessException | IllegalArgumentException | InvocationTargetException e){
						e.printStackTrace();
					}
				
				sb.append(field.getName()).append("=").append(value);
			}
		}
		return sb.toString();
	}
}



class Person{
	@PrintToString
	private String name;
	
	private int age;
	
	@PrintToString
	private String remark;
	
	public String toString(){
		return ToStringHelper.toString(this);
	}
	
	
}


public class annotationEx2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person person = new Person();
		person.setName("길동씨 ");
		person.setAge(26);
		person.setRemark("오늘은 수일이에용 장미한소이? ^,^");
		System.out.println(person);
	}

}

