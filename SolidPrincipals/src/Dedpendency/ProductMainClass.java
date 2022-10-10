package Dedpendency;

public class ProductMainClass {
	Product product;
	 void add (Product product) {
		this.product=product;
	}
		public static void main(String[] args) {
		ProductMainClass s=new ProductMainClass();
		Product book = null;
		s.add(book);
		}

}
