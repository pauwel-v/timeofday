package timeofday;

/**
 * Instances of this class store a time of day
 * 
 * @invar The hours are between 0 and 23
 * 		| 0 <= getHours() && getHours <= 23
 * 
 * @invar The minutes are between 0 and 59
 * 		| 0 <= getMinutes() && getMinutes() <= 59
 * 
 *
 */
public class TimeOfDay {
	
	/**
	 * @invar minutesSinceMidnight is between 0 (inclusive) and 24*60 (exclusive)
	 * 		| 0 <= minutesSinceMidnight && minutesSinceMidnight < 24*60
	 */
	private int minutesSinceMidnight;
	
	public int getHours() { 
		return minutesSinceMidnight / 60; 
	}
	
	public int getMinutes() { 
		return minutesSinceMidnight % 60; 
	}
	
	/**
	 * Sets this object's hours.
	 * 
	 * @pre The given hours are between 0 and 23
	 * 		| 0 <= hours && hours <= 23
	 * @post This object's hours are equal to the given hours
	 * 		| getHours() == hours
	 * @post This object's minutes have remained unchanged
	 * 		| getMinutes() == old(getMinutes())
	 */
	public void setHours(int hours) {
		minutesSinceMidnight = hours*60 + getMinutes(); 
	}
	
	/**
	 * Sets this object's minutes
	 *
	 *@pre The given minutes are between 0 and 59
	 *		| 0 <= minutes  && minutes <= 59
	 *@post This object's minutes are equal the given minutes
	 *		| getMinutes() == minutes
	 *@post This object's hours have remained unchanged
	 *		| getHours() == old(getHours())
	 */
	public void setMinutes(int minutes) {
		minutesSinceMidnight = getHours() * 60 + minutes; 
	}
	
	/**
	 * Initializes this instance with the given hours and minutes.
	 * 
	 * @pre The given hours are between 0 and 23
	 * 		| 0 <= hours && hours <= 23
	 * @pre The given minutes are between 0 and 59
	 * 		| 0 <= minutes && minutes <= 59
	 * 
	 * @post This instance's hours are equal to the given hours
	 * 		| getHours() == hours
	 * 
	 * @post This instance's minutes are equal to the given minutes
	 * 		|getMinutes() == minutes
	 * 
	 */
	public TimeOfDay(int hours, int minutes) {
		minutesSinceMidnight = hours * 60 + minutes;
	}
}
