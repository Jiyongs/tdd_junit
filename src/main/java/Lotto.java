import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class Lotto {

    public List<Integer> generate(final int money) {
        if (!isValidPrice(money)) {
            throw new RuntimeException("1000원만 지불해주세요.");
        }
        return generate();
    }

    private boolean isValidPrice(final int money) {
        return money == 1000;
    }

    private List<Integer> generate() {
        return new Random().
                ints(1, 46).
                distinct().
                limit(6).
                boxed(). // IntStream -> Stream<Integer>
                collect(Collectors.toList()); // Stream<Integer> -> List<Integer>
    }
}
