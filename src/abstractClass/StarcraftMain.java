package abstractClass;

import java.util.Locale;
import java.util.TimeZone;

public class StarcraftMain {
	public static void main(String[] args) {
		//create Arrays and put each Object from their constructor
		AbstractUnit[] unitGroup = {new Dropship(), new Marine(), new Tank()};
		//move all units as a group
		for(int i = 0;i < unitGroup.length; i++) {
			unitGroup[i].move(10, 10);
		}
		
		System.out.println(TimeZone.getDefault().getID());
	}
}
