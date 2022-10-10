package Area;

abstract class parents{
	abstract void prof();
}
class Father extends parents{

	@Override
	void prof() {
		System.out.println("Farmer");
		
	}
	
  
}
class Child extends parents{

	@Override
	void prof() {
		System.out.println("Doctor");
		
	}
  
}

public class Prent {
	
	

public static void main(String[] args) {
	parents parentobject =new Father();
	parentobject.prof();
	parentobject=new Child();
	parentobject.prof();
	
}
}
