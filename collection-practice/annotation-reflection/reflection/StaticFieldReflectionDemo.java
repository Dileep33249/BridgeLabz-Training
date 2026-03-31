package Reflextion;

import java.lang.reflect.Field;

public class StaticFieldReflectionDemo {

    static class Configuration {
        private static String API_KEY = "DEFAULT_KEY";
    }


    public static void main(String[] args) throws Exception {

       Class<Configuration> clazz = Configuration.class;

           Field field = clazz.getDeclaredField("API_KEY");
           field.setAccessible(true);

             field.set(null, "NEW_SECRET_API_KEY");

         String updatedKey = (String) field.get(null);

         System.out.println("Updated API_KEY: " + updatedKey);
    }
}
