package Area;

import java.util.ArrayList;
import java.util.LinkedList;

public class ObjectClcass {
	
	Square obje=new Square(10);
	Circle s=new Circle(12);
	static ArrayList<Object> object=new ArrayList<>();
	
	public ArrayList<Object> addlist() {
	    object.add(obje);
	    
		object.add(s);
		return object;
		
		}
	

	
	

}
