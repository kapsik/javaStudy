package typeCasting;

import superEx.Point;
import superEx.Point3D;
import superEx.Point4D;

public class typeCastingEx {
	public static void main(String[] args) {
		Point p = new Point();
		//1. case Point3D
		Point3D p3d = new Point3D();
		//2. case Point4D
		Point4D p4d = new Point4D();

		System.out.println(p instanceof Point3D);
		System.out.println(p3d instanceof Point4D);
		
		System.out.println(p3d instanceof Point);
		System.out.println(p3d instanceof Point3D);
		System.out.println(p3d instanceof Object);
		
		//test
		//castingTest(p4d);
	}
	public static void castingTest(Point p) {
		if(p instanceof Object) {
			System.out.println("Object is avalible");
		}else if(p instanceof Point3D) {
			System.out.println("Point3D is avalible");
		}
		
		
		else if(p instanceof Point4D){
			System.out.println("Point4D is avalible");
		}
	}
}