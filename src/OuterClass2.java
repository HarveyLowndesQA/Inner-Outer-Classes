
public class OuterClass2 {

	public static void main(String[] args) {
		OuterClass2 oc = new OuterClass2();
		OuterClass2.NestedClass.print();
		OuterClass2.Hello2 h2 = oc.new Hello2();
		h2.print();
	}
	
	interface Printable {
		void print();
	}
	
	static class NestedClass implements Printable {
		
		public void print() {
			System.out.println("Nested!");
		}
		
	}
	
	class Hello2 implements Printable {
		
		public void print() {
			System.out.println("Hello!");
		}
		
	}
	
}

static class Hello {
	
}

class Hello2 {
	
}