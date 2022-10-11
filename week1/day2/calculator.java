package week1.day2;

public class calculator {

	public void additiontwoNumbers(int a,int b)
	{
		int c = a+b;
		System.out.println(c);

		}

		public void subractiontwoNumber(int e,int f) 
		{
			int d = e- f;
			System.out.println(d);

		}
		public void multipletwoNumbers(double i,double j)
		{
			double e = i*j;
			System.out.println(e);
		}
		public void dividetwoNumbers(float x,float y)
		{	
				float f= x/y;
			System.out.println(f);
		}
		public static void main(String[] args) {
			calculator calc = new calculator();
			calc.additiontwoNumbers(35, 56);
			calc.subractiontwoNumber(45, 88);
			calc.multipletwoNumbers(35.5445, 32.49245996);
			calc.dividetwoNumbers(4556f, 62f);
		}
	}
