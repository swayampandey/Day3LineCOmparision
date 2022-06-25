
public class UC1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Welcome to line comparision computation");
		System.out.println();
		int x1=5;
		int x2=7;
		int y1=6;
		int y2=8;
		double distance =  Math.sqrt((x2-x1)*(x2-x1) + (y2-y1)*(y2-y1));
		System.out.println("Two points are (x1,y1) = (5,6) and (x2,y2) = (7,8)");
		System.out.println();
		System.out.println("Length of the line (5,6)(7,8) is  " +distance);

	}

}
