package timeofday;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TimeOfDayTest {
	
	@Test
	void test() {
		TimeOfDay myTimeOfDay = new TimeOfDay();
		assert TimeOfDay.getHours(myTimeOfDay) == 0;
		assert TimeOfDay.getMinutes(myTimeOfDay) == 0;
		TimeOfDay.setHours(myTimeOfDay, 12);
		TimeOfDay.setMinutes(myTimeOfDay, 45);
		assert TimeOfDay.getHours(myTimeOfDay) == 12;
		assert TimeOfDay.getMinutes(myTimeOfDay) == 45;
	}

}
