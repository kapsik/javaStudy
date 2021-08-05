package abstractClass;

class Dropship extends AbstractUnit{
	/*load*/
	void load() {System.out.println("loaded");}
	/*unload*/
	void unload() {System.out.println("unloaded");}
	@Override
	void move(int x, int y) {
		System.out.println(name+" moved "+x+" and "+y);
	};
}
