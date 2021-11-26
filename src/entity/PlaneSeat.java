/**
 * 
 */
package entity;

import java.util.Objects;

/**
 * @author Daniel
 *
 */
public class PlaneSeat {
	private Plane planeTailNum;
	private String locationInRow;
	private int rowNumber;
	private SeatClass seatClass;
	/**
	 * @param planeTailNum
	 * @param locationInRow
	 * @param rowNumber
	 * @param seatClass
	 */
	public PlaneSeat(Plane planeTailNum, String locationInRow, int rowNumber, SeatClass seatClass) {
		super();
		this.planeTailNum = planeTailNum;
		this.locationInRow = locationInRow;
		this.rowNumber = rowNumber;
		this.seatClass = seatClass;
	}
	/**
	 * @return the planeTailNum
	 */
	public Plane getPlaneTailNum() {
		return planeTailNum;
	}
	/**
	 * @param The planeTailNum to set
	 */
	public void setPlaneTailNum(Plane planeTailNum) {
		this.planeTailNum = planeTailNum;
	}
	/**
	 * @return the locationInRow
	 */
	public String getLocationInRow() {
		return locationInRow;
	}
	/**
	 * @param The locationInRow to set
	 */
	public void setLocationInRow(String locationInRow) {
		this.locationInRow = locationInRow;
	}
	/**
	 * @return the rowNumber
	 */
	public int getRowNumber() {
		return rowNumber;
	}
	/**
	 * @param The rowNumber to set
	 */
	public void setRowNumber(int rowNumber) {
		this.rowNumber = rowNumber;
	}
	/**
	 * @return the seatClass
	 */
	public SeatClass getSeatClass() {
		return seatClass;
	}
	/**
	 * @param The seatClass to set
	 */
	public void setSeatClass(SeatClass seatClass) {
		this.seatClass = seatClass;
	}
	@Override
	public int hashCode() {
		return Objects.hash(locationInRow, planeTailNum, rowNumber, seatClass);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		PlaneSeat other = (PlaneSeat) obj;
		return Objects.equals(locationInRow, other.locationInRow) && Objects.equals(planeTailNum, other.planeTailNum)
				&& rowNumber == other.rowNumber && seatClass == other.seatClass;
	}
	@Override
	public String toString() {
		return "PlaneSeat [planeTailNum=" + planeTailNum + ", locationInRow=" + locationInRow + ", rowNumber="
				+ rowNumber + ", seatClass=" + seatClass + "]";
	}

}
