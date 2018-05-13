package src;

public class Main {
	
	
	public static void main(String[] args) {
		BezierCurve m_testCurve = new BezierCurve(0, 0, 5, 5, 5, 5, 10, 10, 100);
		m_testCurve.generateCurve();
		double x = m_testCurve.getLastX();
		double y = m_testCurve.getLastY();
		System.out.println(x);
		System.out.println(y);
		

		
	}

}
