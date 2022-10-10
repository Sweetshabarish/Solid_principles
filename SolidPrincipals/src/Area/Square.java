package Area;

public class Square implements ShapeCLass,ManageShapeInterface{
	public int radius;
    
    public Square(int radius) {
   	 this.radius=radius;
   	 
    }
   
	@Override
	public Object Volume() {
		
		
		return (4/3)*this.radius;
	}
	@Override
	public Object Area() {
		
		return this.radius*this.radius;
		
	}

	@Override
	public void  calculate() {
		System.out.println("Square  " +"Area:"+this.Area()+" "+"Volume:"+this.Volume());
	}

	


}
