public class CS232ArrayStack<E> implements CS232Stack<E> {
    private CS232ArrayList<E> arr;

    public CS232ArrayStack() {
        arr = new CS232ArrayList<>();
    }

    public boolean isEmpty() {
        return (arr.size() == 0);
    }

    @Override
    public void push(E obj) {
        arr.add(obj);
    }

    @Override
    public E pop() {
        if (isEmpty()) {
            return null;
        } else {
            return arr.remove(arr.size() - 1);
        }
    }

    @Override
    public E peek() {
        if (isEmpty()) {
            return null;
        } else {
            return arr.get(arr.size() - 1);
        }
    }

    @Override
    public int size() {
        return arr.size();
    }
    
}
