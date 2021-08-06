package innerClassEx;

//A is a outer class of B
class A{
	int i=100;
	B b = new B();
	//B is a inner class of A
	class B{
		public void method() {
//			A a = new A();
//			System.out.println(a.i);
			System.out.println(i);//without create Object A, we can use i variable
		}
	}
}

class C{
	A a = new A();
//	we can't create inner B class 
//	B b = new B();
}

class outerClass{
	int iv=0;
	static int cv=0;
	public void myMethod() {
		int lv=0;
	}
}




public class innerClassEx1 {
	A a = new A();
	
}
