package annotation;
import java.lang.annotation.*;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;
import java.util.Arrays;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@interface CacheResult {
}

class ExpensiveService {

    @CacheResult
    public int compute(int n) {
        System.out.println("Computing for input: " + n);
        try {
            Thread.sleep(2000); 
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return n * n;
    }
}

class CacheExecutor {

    private static final Map<String, Object> cache = new HashMap<>();

    public static Object execute(Object obj, String methodName, Object... args) throws Exception {

        Class<?> clazz = obj.getClass();
        Method method = clazz.getMethod(methodName, int.class);

        if (method.isAnnotationPresent(CacheResult.class)) {

            String key = methodName + Arrays.toString(args);

            if (cache.containsKey(key)) {
                System.out.println("Returning cached result for " + key);
                return cache.get(key);
            }

            Object result = method.invoke(obj, args);
            cache.put(key, result);
            return result;
        }

        return method.invoke(obj, args);
    }
}

public class CacheResultDemo {

    public static void main(String[] args) throws Exception {

        ExpensiveService service = new ExpensiveService();

        System.out.println("Result: " +
            CacheExecutor.execute(service, "compute", 5));

        System.out.println("Result: " +
            CacheExecutor.execute(service, "compute", 5)); // cached

        System.out.println("Result: " +
            CacheExecutor.execute(service, "compute", 6));
    }
}

