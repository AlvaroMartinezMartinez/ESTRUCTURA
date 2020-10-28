public class Main {
    public static void main(String[] args) {
        Box<Integer> integerBox = new Box<Integer>();
        
        integerBox.setT(10);
        integerBox.inspect(15);
        Pair<Integer, String> p1 = new OrderedPair<>(1, "apple");
        Pair<Integer, String> p2 = new OrderedPair<>(1, "orange");
        boolean same = Method.compare(p1, p2);
        System.out.println(same);
    }
    
}