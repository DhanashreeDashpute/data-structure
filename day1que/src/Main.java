public class Main {
    public static void main(String[] args) {

        LinkedList l1 = new LinkedList();

        l1.insert(8);
        l1.insert(1);
        l1.insert(2);
        l1.insert(5);
        l1.insert(7);
        l1.insert(4);
        //l1.insert(null);
        l1.display();

        l1.displayMax();
        l1.findElement(100);
        l1.sumOfEven();
    }
}
