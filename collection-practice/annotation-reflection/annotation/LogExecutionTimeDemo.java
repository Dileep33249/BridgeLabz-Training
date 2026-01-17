package annotation;
import java.lang.annotation.*;
import java.lang.reflect.Method;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@interface LogExecutionTime {
}

class PerformanceTest {

    @LogExecutionTime
    public void fastMethod() {
        for (int i = 0; i < 1_000_000; i++) {
            int x = i * 2;
        }
    }

    @LogExecutionTime
    public void slowMethod() {
        for (int i = 0; i < 50_000_000; i++) {
            int x = i * 2;
        }
    }
}

public class LogExecutionTimeDemo {

    public static void main(String[] args) throws Exception {

        PerformanceTest obj = new PerformanceTest();
        Class<?> clazz = obj.getClass();

        for (Method method : clazz.getDeclaredMethods()) {

            if (method.isAnnotationPresent(LogExecutionTime.class)) {

                long start = System.nanoTime();
                method.invoke(obj);
                long end = System.nanoTime();

                long executionTime = end - start;

                System.out.println(method.getName() + " executed in " + executionTime + " ns"
                );
            }
        }
    }
}
