package interm;

public class Addition {

	void add(int x, int y) {

		int sum;
		sum = x + y;

		System.out.println(sum);

	}

	double add(double x, double y) {
		double sum;//local variable
		sum = x + y;

		return sum;
	}

	public static void main(String[] args) {
		Addition a1 = new Addition();
		a1.add(10, 20);//call a method
		a1.add(20, 6700);
		System.out.println(a1.add(56.00, 87.99));
		double s1 = a1.add(10.99, 90.77);
		System.out.println(s1);
	}

}
