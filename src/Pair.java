public class Pair<T1, T2> {
    private T1 val1;
    private T2 val2;

    public Pair (T1 initVal1, T2 initVal2) {
        val1 = initVal1;
        val2 = initVal2;
    }

    public T1 getFirst() {
        return val1;
    }

    public T2 getSecond() {
        return val2;
    }

    public void setFirst(T1 newVal1) {
        val1 = newVal1;
    }

    public void setSecond(T2 newVal2) {
        val2 = newVal2;
    }

    public static void main(String[] args) {
        Pair<Integer, Integer> intPair = new Pair<Integer, Integer>(132, 232);
        Pair<Double, String> mixPair = new Pair<Double, String>(2.11, "DiscreteMath");
        Pair<Pair<Integer, Integer>, Pair<Double, String>> pairPair = new Pair<Pair<Integer, Integer>, Pair<Double, String>>(intPair, mixPair);
    }
}