package lecture11.task04;

public class Main {
    public static void main(String[] args) {
        BlackBox blackBox = new BlackBox();
        blackBox.add(8);
        blackBox.add(5);
        blackBox.add(6);
        blackBox.add(4);
        blackBox.add(3);
        blackBox.add(1);
        blackBox.add(2);

        System.out.println(blackBox.getMax(3));
        System.out.println(blackBox.getMin(3));

    }
}
