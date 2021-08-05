package interfaceEx;


interface Inter{
	public abstract void method();
}

class A{
	public void method(Inter i) {
		i.method();
	}
}

class B implements Inter{

	@Override
	public void method() {
		System.out.println("i am B");
	}
	
}

class C implements Inter{
	@Override
	public void method() {
		System.out.println("i am C");
	}
}

public class InterfaceTest{
	public static void main(String[] args) {
		A a = new A();
		a.method(new C());
	}
}
