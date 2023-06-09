package week3.day2;

public class OverloadingPloymophrism {

	 
		 
		
		public void add (int a,int b) { 
			
			int c=a+b ;
		System.out.println(c);
		} 
		public void add(int a,int b, int c) {
			int d= a+b+c;
			System.out.println(d);
			
		}
		public void multiple (double a, double b) {
        		double c= a*b;
		   System.out.println(c);
		


		}
		public void multiple (float a, float b) {
			float c= a*b;
			System.out.println(c);
		}
			
					
			
			
			
			
			
			
			public static void main(String[] args) {  
		
				OverloadingPloymophrism obj = new OverloadingPloymophrism();
				obj.add(5, 8);
				obj.add(2, 4, 6);
				obj.multiple(2.9, 3.6);
				obj.multiple(3.5f, 6.6f);
		 

	}

}
