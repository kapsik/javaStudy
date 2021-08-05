package superEx;

public class Point4D extends Point3D{
	int t;
	
	public Point4D() {
	}
	
	public Point4D(int x, int y, int z, int t) {
		super(x, y, z);
		this.t = t;
	}
}
