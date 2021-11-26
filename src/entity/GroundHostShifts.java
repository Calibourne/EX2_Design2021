package entity;

import java.time.LocalDate;
import java.util.Objects;

public class GroundHostShifts {
	private LocalDate shiftStartTime;
	private LocalDate shiftEndTime;
	/**
	 * @param shiftStartTime
	 * @param shiftEndTime
	 */
	public GroundHostShifts(LocalDate shiftStartTime, LocalDate shiftEndTime) {
		super();
		this.shiftStartTime = shiftStartTime;
		this.shiftEndTime = shiftEndTime;
	}
	/**
	 * @return the shiftStartTime
	 */
	public LocalDate getShiftStartTime() {
		return shiftStartTime;
	}
	/**
	 * @param The shiftStartTime to set
	 */
	public void setShiftStartTime(LocalDate shiftStartTime) {
		this.shiftStartTime = shiftStartTime;
	}
	/**
	 * @return the shiftEndTime
	 */
	public LocalDate getShiftEndTime() {
		return shiftEndTime;
	}
	/**
	 * @param The shiftEndTime to set
	 */
	public void setShiftEndTime(LocalDate shiftEndTime) {
		this.shiftEndTime = shiftEndTime;
	}
	@Override
	public int hashCode() {
		return Objects.hash(shiftEndTime, shiftStartTime);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		GroundHostShifts other = (GroundHostShifts) obj;
		return Objects.equals(shiftEndTime, other.shiftEndTime) && Objects.equals(shiftStartTime, other.shiftStartTime);
	}
	@Override
	public String toString() {
		return "GroundHostShifts [shiftStartTime=" + shiftStartTime + ", shiftEndTime=" + shiftEndTime + "]";
	}
	
	

}
