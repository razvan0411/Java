import java.util.List;

public class MainClass {
    public static void main(String[] args) {
        RandomList rl = RandomList.getInstance();
        List<Integer> integerList = rl.getRandomList(10, 0,50);

        integerList.stream().forEach(System.out::println);

        System.out.println("Sum elements of list is " + rl.getSumList(integerList));

        System.out.println("Average elements of list is " + rl.getAverageList(integerList));

        System.out.println("Mean deviation of list is " + rl.getMeanDeviationList(integerList));
    }
}
