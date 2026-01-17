package annotation;
import java.lang.annotation.*;
import java.lang.reflect.Method;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@interface BugReports {
    BugReport[] value();
}

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@Repeatable(BugReports.class)
@interface BugReport {
    String description();
}
class Service {

    @BugReport(description = "Null pointer issue")
    @BugReport(description = "Performance slowdown on large input")
    public void process() {
        System.out.println("Processing service...");
    }
}
public class RepeatableAnnotationDemo {

    public static void main(String[] args) throws Exception {

        Method method = Service.class.getMethod("process");

        BugReport[] reports = method.getAnnotationsByType(BugReport.class);

        for (BugReport report : reports) {
            System.out.println("Bug: " + report.description());
        }
    }
}
