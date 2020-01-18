package day2.refleksje;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Main {

    public static void main(String[] args) throws InvocationTargetException, IllegalAccessException, ClassNotFoundException {
        Class clazz = Class.forName("day2.refleksje.Adnotacje");
//        Class clazz = Adnotacje.class;

        Method[] methods = clazz.getDeclaredMethods();

        for(Method m : methods) {
            if(m.isAnnotationPresent(MojaAdnotacja.class)) {
                Adnotacje a = new Adnotacje();
                a.setName(m.getAnnotation(MojaAdnotacja.class).name());
                m.invoke(a);
            }
        }
    }
}
