package abstractClass;

class Tank extends AbstractUnit{
	/*changeMode*/
	void changeMode() {System.out.println("changed mode");}
	@Override
	public void move(int x, int y) {
		System.out.println(name+" moved "+x+" and "+y);
	}
}
