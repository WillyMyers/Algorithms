package unionfind;

import java.util.ArrayList;
import java.util.List;

public class UF {
	private int[] id;    // id[i] = parent of i
    private int[] sz;    // sz[i] = number of objects in subtree rooted at i
    private int count;   // number of components

    /**
     * Initializes an empty union-find data structure with N isolated components 0 through N-1.
     * @throws java.lang.IllegalArgumentException if N < 0
     * @param N the number of objects
     */
    public UF(int N) {
        count = N;
        id = new int[N];
        sz = new int[N];
        for (int i = 0; i < N; i++) {
            id[i] = i;
            sz[i] = 1;
        }
    }

    /**
     * Returns the number of components.
     * @return the number of components (between 1 and N)
     */
    public int count() {
        return count;
    }

    /**
     * Returns the component identifier for the component containing site <tt>p</tt>.
     * @param p the integer representing one site
     * @return the component identifier for the component containing site <tt>p</tt>
     * @throws java.lang.IndexOutOfBoundsException unless 0 <= p < N
     */
    public int find(int p) {
        while (p != id[p])
            p = id[p];
        return p;
    }

    /**
     * Are the two sites <tt>p</tt> and <tt>q</tt> in the same component?
     * @param p the integer representing one site
     * @param q the integer representing the other site
     * @return <tt>true</tt> if the two sites <tt>p</tt> and <tt>q</tt>
     *    are in the same component, and <tt>false</tt> otherwise
     * @throws java.lang.IndexOutOfBoundsException unless both 0 <= p < N and 0 <= q < N
     */
    public boolean connected(int p, int q) {
        return find(p) == find(q);
    }

  
    /**
     * Merges the component containing site<tt>p</tt> with the component
     * containing site <tt>q</tt>.
     * @param p the integer representing one site
     * @param q the integer representing the other site
     * @throws java.lang.IndexOutOfBoundsException unless both 0 <= p < N and 0 <= q < N
     */
    public void union(int p, int q) {
        int rootP = find(p);
        int rootQ = find(q);
        if (rootP == rootQ) return;

        // make smaller root point to larger one
        if   (sz[rootP] < sz[rootQ]) { id[rootP] = rootQ; sz[rootQ] += sz[rootP]; }
        else                         { id[rootQ] = rootP; sz[rootP] += sz[rootQ]; }
        count--;
    }

	/**
	 * Reads in a an integer <tt>N</tt> and a sequence of pairs of integers
	 * (between <tt>0</tt> and <tt>N-1</tt>) from standard input, where each
	 * integer in the pair represents some site; if the sites are in different
	 * components, merge the two components and print the pair to standard
	 * output.
	 */
	public static void main(String[] args) {
		int N = 10;
		UF uf = new UF(N);
		List<Integer[]> nos = new ArrayList<Integer[]>();
		// 4-3 7-4 4-6 9-7 2-0 1-5 0-1 3-0 9-8
		nos.add(new Integer[] { 4, 3 });
		nos.add(new Integer[] { 7, 4 });
		nos.add(new Integer[] { 4, 6 });
		nos.add(new Integer[] { 9, 7 });
		nos.add(new Integer[] { 2, 0 });
		nos.add(new Integer[] { 1, 5 });
		nos.add(new Integer[] { 0, 1 });
		nos.add(new Integer[] { 3, 0 });
		nos.add(new Integer[] { 9, 8 });
		for (Integer[] integers : nos) {

			int p = integers[0];
			int q = integers[1];
			if (uf.connected(p, q))
				continue;
			uf.union(p, q);
			System.out.println(p + " " + q);
		}
		System.out.println(uf.count() + " components");
	}
}
