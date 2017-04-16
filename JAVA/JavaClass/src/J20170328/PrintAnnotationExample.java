package J20170328;

import java.lang.reflect.Method; 

public class PrintAnnotationExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// service
		Method[] declaredMethods = Service.class.getDeclaredMethods();

		// Method 객체를 하나씩 처리
		for (Method method : declaredMethods) {
			if (method.isAnnotationPresent(PrintAnnotation.class)) {
				PrintAnnotation printAnnotation = method.getAnnotation(PrintAnnotation.class);

				System.out.println("[" + method.getName() + "]");

				for (int i = 0; i < printAnnotation.number(); i++) {
					System.out.print(printAnnotation.value());
				}
				System.out.println();

				try {
					method.invoke(new Service());
				} catch (Exception e) {
				}
				System.out.println();

			}
		}
	}

}
