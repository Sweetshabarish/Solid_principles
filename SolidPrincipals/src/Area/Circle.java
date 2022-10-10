package Area;

import java.util.Collection;

public class Circle implements ShapeCLass,ManageShapeInterface{
    public int length;
    
     public Circle(int length) {
    	 this.length=length;
    	 
     }
     @Override
	public Object Volume() {
		return ((4/3)*this.length);
		
	}
	@Override
	public Object Area() {
		return (this.length*this.length);
		
	}

	@Override
	public void calculate() {
		System.out.println("Circle  " +"Area:"+this.Area()+" "+"Volume:"+this.Volume());
		
		
	}
//	  @Override
//		public void Volume() {
//			 ((4/3)*this.length);
//			
//		}
//		@Override
//		public Object Area() {
//			return (this.length*this.length);
//			
//		}
//
//		@Override
//		public Object calculate() {
//			return this.Area()+" "+this.Volume();
//			
//			
//		}
}
