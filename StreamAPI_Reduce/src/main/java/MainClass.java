import java.util.List;

public class MainClass {
    public static void main(String[] args) {
        RandomList rl = RandomList.getInstance();
        List<Integer> integerList = rl.getRandomList(10, 0,50);

        integerList.stream().forEach(System.out::println);

        System.out.println("Sum elements of list is " + rl.getSumList(integerList));

        Integer count = 0;
        integerList.stream().reduce((x, y) -> { return x+y; });
        System.out.println(count);
    }
}
