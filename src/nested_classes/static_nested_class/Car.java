package nested_classes.static_nested_class;

public class Car {
    String cvet;
    int doorCount;
    Engine engine;
    static int a;

    void method() {
        System.out.println(Engine.countOfObjects);
        Engine e = new Engine(200);
        System.out.println(e.horsePower);
    }

    public Car(String cvet, int doorCount, Engine engine) {
        this.cvet = cvet;
        this.doorCount = doorCount;
        this.engine = engine;
    }

    @Override
    public String toString() {
        return "My car: {" +
                "cvet='" + cvet + '\'' +
                ", doorCount=" + doorCount +
                ", engine=" + engine +
                '}';
    }

    interface I {
    };

    public static class Engine {
        private int horsePower;
        static int countOfObjects;

        public Engine(int horsePower) {
            System.out.println(a);
//            System.out.println(doorCount);
            this.horsePower = horsePower;
            countOfObjects++;
        }

        @Override
        public String toString() {
            return "My Engine: {" +
                    "horsePower=" + horsePower +
                    '}';
        }
    }
}

class Test {
    public static void main(String[] args) {
        Car.Engine engine = new Car.Engine(256);
        System.out.println(engine);
        Car car = new Car("red", 2, engine);
        System.out.println(car);
    }
}

class Z extends Car.Engine {
    Z() {
        super(200);
    }
}









