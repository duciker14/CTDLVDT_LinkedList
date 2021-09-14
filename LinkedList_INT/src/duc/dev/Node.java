package duc.dev;
/**
 * Khoi tao Node
 * @param nd
 */

public class Node {
	public int noidung;
	public Node next;
	
	public Node(int nd) { 
		noidung = nd;
	}
	
	public void printNode() {
		System.out.printf("%d\t",noidung);
	}
	
	
}
