import java.util.Iterator;

public class FiboIterator implements Iterator<Integer> {
	  private int borne;
	    private int precedent , actuel;

	    private int rang;

	    /**
	     *
	     *
	     */
	    public FiboIterator(int i ){
	        this.borne=i;
	        this.precedent =0;
	        this.actuel = 1;
	        this.rang=0;
	    }
	    @Override
	    public boolean hasNext() {
	        return rang< borne;
	    }

	    @Override
	    public Integer next() {
	        int resultat;
	        if(rang == 0) {
	            resultat = 1;
	        } else if (rang == 1) {
	            resultat = 1;
	        } else {
	            resultat = precedent + actuel;
	            precedent = actuel;
	            actuel = resultat;
	        }
	        rang++;
	        return resultat;
	    }
}
