package Demo;
import java.lang.reflect.Field;


public class Injector 
{

    public static void inject(Object obj) {

        try {

            Class<?> cls = obj.getClass();

            Field[] fields = cls.getDeclaredFields();

            for (Field field : fields) {

                if (field.isAnnotationPresent(Inject.class)) {

                    Object dependency =
                            field.getType()
                                 .getDeclaredConstructor()
                                 .newInstance();

                    field.setAccessible(true);

                    field.set(obj, dependency);

                    System.out.println(
                            "Injected : "
                            + dependency.getClass().getSimpleName()
                    );
                }
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}