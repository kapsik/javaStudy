package stringBufferEx;

public class StringBufferTest1 {

	public static void main(String[] args) {
		double sum = 0;
		double sum1 = 0;
		double sum2 = 0;
		
		for(double d = 1.5; d <= 10.5; d++) {
			double d1 = Math.round(d);
			double d2 = Math.rint(d);
			
			System.out.printf("%4.1f %4.1f %4.1f%n", d, d1, d2);
			
			sum += d;
			sum1 += d1;
			sum2 += d2;
			
		}
		
		System.out.println("----------------------");
		System.out.printf("%4.1f %4.1f %4.1f%n", sum, sum1, sum2);
		
		
		double a = 1.235; 
		double b = (Math.round(a*100)/100.0);
		System.out.println(b);
		
		Long rong = new Long("10000");
		Long rong1 = new Long(100000);
		long l = rong.longValue();
		long r = rong1.longValue();
		
		
		System.out.println("l : "+l);
		System.out.println("r : "+r);
		System.out.println(r==l);
		
		
		
	}

}
