package abstractClass;

class Marine extends AbstractUnit{
	public Marine() {
	}
	@Override
	void move(int x, int y) {
		System.out.println(name+" moved "+x+" and "+y);
	}
	
	
}
