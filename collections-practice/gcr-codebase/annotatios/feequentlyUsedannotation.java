package annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.reflect.Method;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@interface ImportantMethod{
	String level() default "HIGH";
}

class Service {
	@ImportantMethod 
	public void processData() {}
	
	@ImportantMethod(level ="LOW")
	public void cleanData() {}
}
public class feequentlyUsedannotation {

	public static void main(String[] args) {
		
		for(Method main : Service.class.getDeclaredMethods()) {
			if(main.isAnnotationPresent(ImportantMethod.class)) {
				
			
			ImportantMethod im = main.getAnnotation(ImportantMethod.class);
			System.out.println(main.getName()+ " - Level: "+ im.level());
			}
		}
	}

}