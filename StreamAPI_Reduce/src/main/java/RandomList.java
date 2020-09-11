import java.security.SecureRandom;
import java.util.*;
import java.util.stream.Collectors;

public class RandomList {
    private static RandomList rl;

    private RandomList() {
    }

    public static synchronized RandomList getInstance() {
        if (rl == null) {
            rl = new RandomList();
        }
        return rl;
    }

    public List<Integer> getRandomList(int listSize, int min, int max){
        Random random = new SecureRandom();
        return random.ints(listSize, min,max+1).boxed().collect(Collectors.toList());
    }
}
