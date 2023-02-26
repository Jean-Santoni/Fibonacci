import java.util.Iterator;

public class FiboIterator implements Iterator<Integer> {
	  private int borne;
	    private int precendent , actuel;

	    private int rang;

	    /**
	     *
	     *
	     */
	    public FiboIterator(int i ){
	        this.borne=i;
	        this.precendent =0;
	        this.actuel = 1;
	        this.rang=0;
	    }
	    @Override
	    public boolean hasNext() {
	        return rang< borne;
	    }

	    @Override
	    public Integer next() {
	        int resultat = precendent+actuel;
	        precendent = actuel;
	        actuel=resultat;
	        return resultat;
	    }
}
