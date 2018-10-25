package lecture09.task06;

import java.lang.annotation.Annotation;
import java.lang.reflect.*;

public class ClassAnalyzer {

    public void analyze(Object instanceOfClass) {

        Class classInstance = instanceOfClass.getClass();
        Package pack = classInstance.getPackage();
        Method[] methods = classInstance.getDeclaredMethods();
        Type[] interfaces = classInstance.getInterfaces();
        Field[] fields = classInstance.getDeclaredFields();
        Constructor[] constructors = classInstance.getConstructors();
        int mods = classInstance.getModifiers();

        System.out.println("Имя класса: " + classInstance.getSimpleName());
        System.out.print("Мофификаторы класса: ");
        if (Modifier.isPublic(mods)) {
            System.out.println("public");
        }
        if (Modifier.isAbstract(mods)) {
            System.out.println("abstract");
        }
        if (Modifier.isFinal(mods)) {
            System.out.println("final");
        }
        if (Modifier.isStatic(mods)) {
            System.out.println("static");
        }

        if (pack.getName() != null) {
            System.out.println("Имя пакета: " + pack.getName());
        }
        if (interfaces.length > 0) {
            for (Type intf : interfaces)
                System.out.println("Имплементирует: " + intf + "\n");
        }


        System.out.println("Класс имеет " + constructors.length + " конструктора");
        for (Constructor constructor : constructors) {
            Class[] paramTypes = constructor.getParameterTypes();
            if (paramTypes.length == 0) {
                System.out.println("Конструктор по умолчанию");
            }
            for (Class paramType : paramTypes) {
                System.out.println("Параметризовынный конструктор принимает параметр(ы) типа: "+paramType.getSimpleName());

            }
        }


        System.out.println("\n");
        for (Field field : fields) {
            Class fieldType = field.getType();
            System.out.println("Поле класса - " + field.getName() + " || Тип " + fieldType.getName());
        }

        for (Method method : methods) {
            System.out.println("\n" + "--------- Имя метода " + method.getName() + "---------");
            if (method.getReturnType().getName().equals("void")) {
                System.out.println("Ничего не возвращает");
            } else {
                System.out.println("Возврашает параметр типа " + method.getReturnType().getName());
            }
            Class[] paramTypes = method.getParameterTypes();
            for (Class paramType : paramTypes) {
                System.out.println("Принимает  параметр(ы) типа - " + paramType.getName());
            }
            Annotation[] annotations = method.getAnnotations();
            {
                for (Annotation annotation : annotations)
                    // System.out.println("Аннотация: " + annotation.annotationType().getSimpleName() + "\n");
                    System.out.println(annotation.toString());
            }
        }


    }


}