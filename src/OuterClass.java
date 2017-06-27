
public class OuterClass {
	
	private int x = 1;
	
	static class InnerClass {
		 int x = 5;
		
		 class InnerInnerClass {
			 
			 public void test() {
				 InnerInnerClass iic = new InnerInnerClass() {
					 
				 };
			 }
			 
			 
		 }

		 static class NestedInnerClass {
			 
			 static void printNestedInnerClass() {
				 System.out.println("Nested Inner Class");
				 int x = 0;
			 }
			 
		 }
		 
		InnerInnerClass iic = new InnerInnerClass();
		
		public void print() {
			iic.printInnerInnerClass();
			NestedInnerClass.printNestedInnerClass();
		}
		 
	}

}
