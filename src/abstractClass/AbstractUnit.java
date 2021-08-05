package abstractClass;

abstract class AbstractUnit {
	/*name*/
	final String name = this.getClass().getSimpleName();
	/*location*/
	int x,y;
	/*move*/
	//there is no implements, this is why it's abstract method in abstract class
	abstract void move(int x, int y);
	/*stop*/
	void stop() {};
}
