package annotation;
import java.lang.annotation.*;
import java.lang.reflect.Method;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@interface TaskInfo {
    int priority();
    String assignedTo();
}

class TaskManager {

    @TaskInfo(priority = 1, assignedTo = "Dileep")
    void completeTask() {
        System.out.println("Task completed");
    }
}

public class CustomAnnotation {

    public static void main(String[] args) throws Exception {

        Class<TaskManager> clazz = TaskManager.class;

           Method method = clazz.getDeclaredMethod("completeTask");

        if (method.isAnnotationPresent(TaskInfo.class)) {
              TaskInfo info = method.getAnnotation(TaskInfo.class);

            System.out.println("Priority: " + info.priority());
                System.out.println("Assigned To: " + info.assignedTo());
        }
          TaskManager manager = new TaskManager();
       manager.completeTask();
    }
}
