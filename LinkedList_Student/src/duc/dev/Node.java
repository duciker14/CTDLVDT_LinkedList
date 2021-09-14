package duc.dev;
/**
 * Danh sach Student
 * @author Duc Nguyen
 *
 */

public class Node {
	public String hoten;
	public byte tuoi;
	public double dtb;
	public Node next;
	
	
	public Node(String hoten, byte tuoi, double dtb) {
		this.hoten = hoten;
		this.tuoi = tuoi;
		this.dtb = dtb;
	}

	public void printNode() {
		System.out.printf("Ho va ten: %s, Tuoi: %d, DTB: %f\n",hoten,tuoi,dtb);
	}
}
