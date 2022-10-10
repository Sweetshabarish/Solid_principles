package Dedpendency;

public interface Product {
	void readproduct();
	void buyproduct();
}

class book implements Product{

	@Override
	public void readproduct() {
		System.out.println("Read the book as per th rules");
	}

	@Override
	public void buyproduct() {
		// TODO Auto-generated method stub
		System.out.println("You can buy the product the book aas per the rules");
		
	}
	
}
class texbook implements Product{

	@Override
	public void readproduct() {
		// TODO Auto-generated method stub
		System.out.println("Read the tex book as per the rules");
		
	}

	@Override
	public void buyproduct() {
		// TODO Auto-generated method stub
		System.out.println("buy the textbook as per the rules");
		
	}
	
}