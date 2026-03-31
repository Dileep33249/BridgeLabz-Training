package Reflextion;

import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.Map;

public class CustomObjectMapperDemo {

    public static <T> T toObject(Class<T> clazz, Map<String, Object> properties) {
        try {
            T obj = clazz.getDeclaredConstructor().newInstance();

            for (Map.Entry<String, Object> entry : properties.entrySet()) {
                Field field = clazz.getDeclaredField(entry.getKey());
                field.setAccessible(true);
                field.set(obj, entry.getValue());
            }

            return obj;
        } catch (Exception e) {
            throw new RuntimeException("Object mapping failed", e);
        }
    }

    // ===== Sample POJO =====
    static class User {
        private int id;
        private String name;
        private String email;

        @Override
        public String toString() {
            return "User{id=" + id + ", name='" + name + "', email='" + email + "'}";
        }
    }
    
    public static void main(String[] args) {

        Map<String, Object> data = new HashMap<>();
        data.put("id", 101);
        data.put("name", "Dileep");
        data.put("email", "dileep@gmail.com");

        User user = toObject(User.class, data);

        System.out.println(user);
    }
}

