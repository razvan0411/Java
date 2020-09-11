import java.security.SecureRandom;
import java.util.List;
import java.util.Random;
import java.util.concurrent.atomic.AtomicReference;
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

    public Integer getSumList(List<Integer> l){
        return l.stream().reduce(Integer::sum).orElse(0);
    }

    public Float getAverageList(List<Integer> l){
        AtomicReference<Integer> count = new AtomicReference<>(0);
        Integer sumList = l.stream().reduce(0, (subtotal, element) -> {
            count.set(count.get() + 1);
            return subtotal+element;
        });
        return Float.valueOf(sumList)/count.get();
    }

    public Float getMeanDeviationList(List<Integer> l){
        Float averageList = this.getAverageList(l);
        AtomicReference<Integer> count = new AtomicReference<>(0);
        Double partialSumList = l.stream()
                .mapToDouble(d->d)
                .reduce(0.0d,
                        (subtotal, element) -> {
                                count.set(count.get() + 1);
                                return subtotal+ Math.pow((element - averageList), 2);
        });
        return (float) (partialSumList/count.get());
    }
}
