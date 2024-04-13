package lambda;

import java.util.*;
import java.util.function.Predicate;
import java.util.function.Function;

public class StudentInfo {

    void testStudents(ArrayList<Student> al, Predicate<Student> pr) {
        for (Student s : al) {
            if (pr.test(s)) {
                System.out.println(s);
            }
        }
    }
}

class Test {
    public static void main(String[] args) {
        Student st1 = new Student("Ivan", 'm', 22, 3, 8.3);
        Student st2 = new Student("Nikolay", 'm', 28, 2, 6.4);
        Student st3 = new Student("Elena", 'f', 19, 1, 8.9);
        Student st4 = new Student("Petr", 'm', 35, 4, 7.0);
        Student st5 = new Student("Mariya", 'f', 23, 3, 9.1);
        ArrayList<Student> students = new ArrayList<>();
        students.add(st1);
        students.add(st2);
        students.add(st3);
        students.add(st4);
        students.add(st5);

        StudentInfo info = new StudentInfo();


//        info.testStudents(students, (Student p) -> {
//            return p.avgGrade > 8;
//        });
//
//        info.testStudents(students, p -> {
//            System.out.println("hello");
//            return p.avgGrade > 8;
//        });
//
//        info.testStudents(students, s -> s.age < 30);
//
//        Predicate<Student> p1 = student  ->  student.avgGrade > 7.5;
//        Predicate<Student> p2 = student  ->  student.sex == 'm';
//


//        info.testStudents(students, p1.negate());


//        info.testStudents(students, (Student p) -> {
//            return p.avgGrade > 8;
//        });
//
//        System.out.println("---------------------------");
//        info.testStudents(students, (Student s) -> {
//            return s.age > 20 && s.avgGrade < 9.3 && s.sex == 'f';
//        });

        Function<Student, Double> f = student -> 3.14;
        double res = avgOfSmth(students, student -> student.avgGrade);
        double res1 = avgOfSmth(students, student -> (double)student.age);
        System.out.println(res1);

    }

    private static double avgOfSmth(List<Student> list, Function<Student, Double> f) {
        double result = 0;
        for (Student st : list) {
            result += f.apply(st);
        }
        result = result / list.size();
        return result;

    }

}

//interface StudentChecks {
//    boolean check(Student s);
//}

//class CheckOverGrade implements StudentChecks {
//    @Override
//    public boolean check(Student s) {
//        return s.avgGrade > 8;
//    }
//}
