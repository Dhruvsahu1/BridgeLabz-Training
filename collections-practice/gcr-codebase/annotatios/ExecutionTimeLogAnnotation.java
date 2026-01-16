
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.reflect.Method;


@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@interface LogExecutionTime {}

class Calculator{
	@LogExecutionTime
	public void compute() {
		for(int i=0;i<500000;i++) {
			
		}
	}
}
public class ExecutionTimeLogAnnotation {

	public static void main(String[] args) throws Exception {
		Calculator calculate = new Calculator();
		Method main = Calculator.class.getMethod("compute");		
		if(main.isAnnotationPresent(LogExecutionTime.class)) {
			long start = System.nanoTime();
			main.invoke(calculate);
			long end = System.nanoTime();
			System.out.print("Execution time: "+(end -start)+" ns");
		}

	}

}