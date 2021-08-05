package interfaceEx;

/*Unit Abstract class*/
abstract class Unit{
	String name = this.getClass().getSimpleName();
	public abstract void move();
}

/*Repairable interface*/
interface Repairable{
	public abstract void repair();
}

/*rideable Unit*/
interface Rideable{
	public abstract void gotOn();
	public abstract void gotOff();
}

//Marine
class Marine extends Unit implements Rideable{
	public Marine() {
	}
	@Override
	public void move() {
		System.out.println(name+" move");
	}
	
	@Override
	public void gotOn() {
		System.out.println(name+" gotOn");
	}
	
	@Override
	public void gotOff() {
		System.out.println(name+" gotOff");
	}
}

//Tank
class Tank extends Unit implements Repairable, Rideable{
	@Override
	public void move() {
		System.out.println(name+" move");
	}
	
	@Override
	public void repair() {
		System.out.println(name+" repaired");
	}
	
	@Override
	public void gotOn() {
		System.out.println(name+" gotOn");
	}
	
	@Override
	public void gotOff() {
		System.out.println(name+" gotOff");
	}
}

//Dropship
class Dropship extends Unit implements Repairable{
	@Override
	public void move() {
		System.out.println(name+" move");
	}
	
	@Override
	public void repair() {
		System.out.println(name+" repaired");
	}
	
	public void drop(Rideable ride) {
		Rideable ridable =(Rideable) checkUnit(ride);
		ridable.gotOff();
	}
	
	public void pick(Rideable ride) {
		
	}
	
	public Unit checkUnit(Rideable ride) {
		if(ride instanceof Marine) {
			Marine marine = (Marine) ride;
			return marine;
		}else {
			Tank tank = (Tank) ride;
			return tank;
		}
		
		
	}
}


public class InterfaceTest2{
	public static void main(String[] args) {
		
		//move all unit
		Unit[] units = {new Marine(), new Tank(), new Dropship()};
		for(int i = 0;i < units.length; i++) {
			units[i].move();
		}
		
		//repair all machine
		Repairable[] repair = {new Tank(), new Dropship()};
		for(int i = 0;i < repair.length; i++) {
			repair[i].repair();
		}
		
		//get on the Dropship
		Dropship dropship = new Dropship();
		dropship.drop(new Marine());
		
	}
}