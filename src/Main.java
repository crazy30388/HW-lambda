import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Main {
    public static void main(String[] args) {
        Predicate<Integer> predicate1 = new Predicate<Integer>() {
            @Override
            public boolean test(Integer integer) {
                if (integer < 0) {
                    return false;
                }
                return true;
            }
        };

        Predicate<Integer> predicate2 = x -> x > 0;
    }

    Consumer<String> consumer1 = new Consumer<String>() {
        @Override
        public void accept(String a) {
            System.out.println("Hello " + a + "!");
        }
    };

    Consumer<String> consumer2 = a -> System.out.println("Hello " + a + "!");;

    Function<Double, Long> function1 = new Function<Double, Long>() {
        @Override
        public Long apply(Double aDouble) {
            return Math.round(aDouble);
        }
    };

    Function<Double, Long> function2 = a -> Math.round(a);

    Supplier<Integer> supplier1 = new Supplier<Integer>() {
        @Override
        public Integer get() {
            return (int) (Math.random() * 100);
        }
    };

    Supplier<Integer> supplier2 = () -> (int) (Math.random() * 100);

    public static <T, U> Function<T, U> ternaryOperator(
            Predicate<? super T> condition,
            Function<? super T, ? extends U> ifTrue,
            Function<? super T, ? extends U> ifFalse) {
        return a -> condition.test(a) ? ifTrue.apply(a) : ifFalse.apply(a);
    }

}