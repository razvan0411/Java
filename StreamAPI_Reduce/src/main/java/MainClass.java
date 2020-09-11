import java.util.List;

public class MainClass {
    public static void main(String[] args) {
        RandomList rl = RandomList.getInstance();
        List<Integer> integerList = rl.getRandomList(10, 0,50);

        integerList.stream().forEach(System.out::println);
    }
}
