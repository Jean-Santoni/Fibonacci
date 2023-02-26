import java.util.ArrayList;
import java.util.Iterator;

public class Fibonacci implements Iterable<Integer>{
    private int nbIteration;
    public Fibonacci(int i ){
        this.nbIteration = i;
    }
    @Override
    public Iterator<Integer> iterator() {
        return new FiboIterator(this.nbIteration);
    }

    public static void main(String[] args) {
    	for (Integer x : new Fibonacci(20))
    		System.out.println(x);
    }
}
