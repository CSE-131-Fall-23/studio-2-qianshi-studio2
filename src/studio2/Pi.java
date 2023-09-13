package studio2;

public class Pi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double totalthrows = 1000.0;
		int numinside = 0;
		
		for (int count = 0; count <= totalthrows; count++) {
		
			double x = Math.random();
			double y = Math.random();
			
			if (Math.sqrt(x*x + y*y) <= 1.0)
			{
				numinside++;
			}
			
		}
		
		double estimatedpi = numinside / totalthrows * 4.0;
		
		System.out.println("Pi: " + estimatedpi);

	}

}
