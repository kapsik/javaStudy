package superEx;

public class Point3D extends Point{
	int z;
	
	public Point3D() {}
	public Point3D(int x, int y, int z) {
//		this.x = x;
//		this.y = y;
		super(x, y);
		this.z = z;
	}
	
	@Override
	public String toString() {
		return this.x+" "+this.y+" "+this.z;
	}
}
