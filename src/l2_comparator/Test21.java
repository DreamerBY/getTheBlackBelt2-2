package l2_comparator;

import java.util.*;

public class Test21 {
    public static void main(String[] args) {
        List<Employee2> list2 = new ArrayList<>();
        Employee2 emp1 = new Employee2(100, "Zaur", "Tregulov", 12345);
        Employee2 emp2 = new Employee2(15, "Ivan", "Petrov", 6542);
        Employee2 emp3 = new Employee2(123, "Ivan", "Sidorov", 8542);

        list2.add(emp1);
        list2.add(emp2);
        list2.add(emp3);
        System.out.println("Before sorting \n" + list2);
        //Collections.sort(list2, new NameComparator());
        Collections.sort(list2, new SalaryComparator());
        //Collections.sort(list2);
        System.out.println("After sorting \n" + list2);
    }
}

class Employee2 implements Comparable<Employee2> {
    Integer id;
    String name;
    String surname;
    int salary;

    public Employee2(Integer id, String name, String surname, int salary) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee2{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", salary=" + salary +
                '}';
    }

    @Override
    public int compareTo(Employee2 anotherEmp) {
        if (this.id == anotherEmp.id) {
            return 0;
        } else if (this.id < anotherEmp.id) {
            return -1;
        } else {
            return 1;
        }

    }


}

//class IdComparator implements Comparator<Employee2> {
//@Override
//
//    public int compare(Employee2 emp1, Employee2 emp2) {
//        if (emp1.id == emp2.id) {
//            return 0;
//        } else if (emp1.id < emp2.id) {
//            return -1;
//        } else {
//            return 1;
//        }
//    }
//}

class NameComparator implements Comparator<Employee2> {
    @Override
    public int compare(Employee2 emp1, Employee2 emp2) {
        return emp1.name.compareTo(emp2.name);
    }
}

class SalaryComparator implements Comparator<Employee2> {
    @Override
    public int compare(Employee2 emp1, Employee2 emp2) {
        return emp1.salary - emp2.salary;
    }
}




