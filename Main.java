import java.util.stream.*;
import java.util.Optional;

public class Main
{
    public static void main(String[] args)
    {
        Stream<Integer> s = Stream.of(1,2,3);

        /*s.flatMap(Main::f_opt)
            .forEach(v -> System.out.println(v));*/

        /*s.map(Main::f_opt)
            .filter(Optional::isPresent)
            .map(Optional::get)
            .forEach(v -> System.out.println(v));*/

        /*s.map(Main::f)
            .filter(n -> n != null)
            .forEach(v -> System.out.println(v));*/

        s.flatMap(Main::f_str)
            .forEach(v -> System.out.println(v));
    }

    private static Integer f(Integer n)
    {
        return (n == 2) ? null : n;
    }
    private static Optional<Integer> f_opt(Integer n)
    {
        return (n == 2) ? Optional.empty() : Optional.of(n);
    }
    private static Stream<Integer> f_str(Integer n)
    {
        return (n == 2) ? Stream.empty() : Stream.of(n);
    }
}
