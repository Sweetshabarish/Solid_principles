package Area;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.function.Function;

public class AreaMain {
	
	public static void main(String[] args) {
		
	Scanner s=new Scanner(System.in);
	
	
	
	ObjectClcass p= new ObjectClcass();
	
	ArrayList<Object> Arrayobject = p.addlist();
	 
   for(Object object:Arrayobject) {
	   if(object instanceof ManageShapeInterface) {
		  ((ManageShapeInterface) object).calculate();
	   }
   }
   
        
//	for(Object abc:object1) {
//		if(Square.class.isInstance(abc))
//		{
//		    ((ManageShapeInterface) abc).calculate();
////			((ShapeCLass) abc).Area();
////			((ShapeCLass)abc).Volume();
//		}
//		else if(Circle.class.isInstance(abc))
//		{
//			 ((ManageShapeInterface) abc).calculate();
////			
//
//		}
//			
//	}

//	if(inputreader.equals("Circle")) {
//     p.Circle(10);
//	} if(inputreader.equals("Sqaure")) {
//		ObjectClcass.Sqaure(11);
//	}

}

	
}
