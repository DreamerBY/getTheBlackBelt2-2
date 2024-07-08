package stream;

import java.util.ArrayList;
import java.util.List;

public class ParallelStream {

    //1234 ... 1000000000
// 1 250.000000
// 250.000001 500.000000
// 500.000001 750.000000
//750.0000001 1000000000
    public static void main(String[] args) {
        List<Double> list = new ArrayList<>();
        list.add(10.0);
        list.add(5.0);
        list.add(1.0);
        list.add(0.25);

//        double sumResult = list.stream()
//                .reduce((accumulator, element) -> accumulator + element).get();
//        System.out.println("sum result = " + sumResult);
//
//        double sumResult = list.parallelStream()
//                .reduce((accumulator, element) -> accumulator + element).get();
//        System.out.println("sum result = " + sumResult);


        double divisionResult = list.parallelStream()
                .reduce((accumulator, element) -> accumulator / element).get();
        System.out.println("division result = " + divisionResult);

    }


}

