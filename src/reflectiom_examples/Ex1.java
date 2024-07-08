package reflectiom_examples;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Arrays;
import java.util.concurrent.Callable;

public class Ex1 {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchFieldException, NoSuchMethodException {
        Class employeeClass = Class.forName("reflectiom_examples.Employee");
//        Class employeeClass2 = Employee.class;
//        Employee emp = new Employee();
//        Class employeeClass3 = emp.getClass();


        Field someField = employeeClass.getField("id");
        System.out.println("Tipe og id field = " + someField.getType());
        Field[] fields = employeeClass.getFields();
        for (Field field : fields) {
            System.out.println("Type of " + field.getName() + " = " + field.getType());
        }

        System.out.println("*******************************");
        Field[] allFields = employeeClass.getDeclaredFields();

        for (Field field : allFields) {
            System.out.println("Type of " + field.getName() + " = " + field.getType());
        }
        System.out.println("============================================");

        employeeClass.getMethod("increaseSalary");
        Method someMethod1 = employeeClass.getMethod("increaseSalary");
        System.out.println("Return type of method increaseSalary = " +
                someMethod1.getReturnType() + ", parametrs types = " +
                Arrays.toString(someMethod1.getParameterTypes()));
        System.out.println("============================================");

        Method someMethod2 = employeeClass.getMethod("setSalary", double.class);
        System.out.println("Return type of method setSalary = " +
                someMethod2.getReturnType() + ", parametrs types = " +
                Arrays.toString(someMethod2.getParameterTypes()));


        System.out.println("============================================");
        System.out.println("============================================");
        Method[] methods = employeeClass.getMethods();
        for (Method method : methods) {
            System.out.println("Name of method = " + method.getName() + ", return type = " + method.getReturnType() + "parametrs types = " +
                    Arrays.toString(someMethod2.getParameterTypes()));
        }
        System.out.println("============================================");
        System.out.println("============================================");
        Method[] allMethods = employeeClass.getDeclaredMethods();
        for (Method method : allMethods) {
            System.out.println("Name of method = " + method.getName() +
                    ", return type = " + method.getReturnType() +
                    "parametrs types = " +
                    Arrays.toString(someMethod2.getParameterTypes()));
        }


        System.out.println("============================================");

        Method[] allMethods2 = employeeClass.getDeclaredMethods();
        for (Method method : allMethods2) {
            if (Modifier.isPublic(method.getModifiers()))                         //непонял
                System.out.println("Name of method = " + method.getName() +
                        ", return type = " + method.getReturnType() +
                        "parametrs types = " +
                        Arrays.toString(someMethod2.getParameterTypes()));
        }


        System.out.println("============================================");
        Constructor constructor1 = employeeClass.getConstructor();
        System.out.println(constructor1);
        System.out.println("Condtructor has " + constructor1.getParameterCount()
                + " parametrs, their types are: " +
                Arrays.toString(constructor1.getParameterTypes()));
        System.out.println("****************************");
        Constructor constructor2 = employeeClass.getConstructor(int.class, String.class, String.class);

        System.out.println("Condtructor has " + constructor2.getParameterCount()
                + " parametrs, their types are: " +
                Arrays.toString(constructor2.getParameterTypes()));

        Constructor[] constructors = employeeClass.getConstructors();
        for (Constructor constructor:constructors){
            System.out.println("Constructor " + constructor.getName() +
                    " has " + constructor.getParameterCount() +
                    " parametrs, their types are: " +
                    Arrays.toString(constructor.getParameterTypes()));
        };
    }

}
