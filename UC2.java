
public class UC2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Welcome to Line Comparison computation");
		System.out.println();
		int x1 = 5;
		int x2 = 7;
		int y1 = 6;
		int y2 = 8;
		int a1 = 9;
		int a2 = 6;
		int b1 = 5;
		int b2 = 2;
	    double disOfFirstLine = Math.sqrt(((x2-x1)*(x2-x1)) + ((y2-y1)*(y2-y1)));
	    double disOfSecondLine = Math.sqrt(((a2-a1)*(a2-a1)) + (b2-b1)*(b2-b1));
	    System.out.println("Two points are (x1,y1) = (5,6) and (x2,y2) = (7,8)");
	    System.out.println();
	    System.out.println("Another Two points are (a1,b1) = (9,5) and (a2,b2) = (6,2)");
	    System.out.println();
	    System.out.println("Length of the first line (5,6) (7.8) is " + disOfFirstLine);
	    System.out.println();
	    System.out.println("Length of the second line (9,5) (6,2) is " + disOfSecondLine);
	    Integer obj1 = new Integer((int) disOfFirstLine);
	    Integer obj2 = new Integer((int) disOfSecondLine);
	    System.out.println();
	    System.out.println("these lines are equal :" + obj1.equals(obj2));

	}

}
