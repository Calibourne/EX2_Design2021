package entity;

import java.util.Objects;

public class Plane {
	private long tailNumber;
	private int numOfFlightAttendants;
	

	public Plane(long tailNumber, int numOfFlightAttendants) {
		super();
		this.tailNumber = tailNumber;
		this.numOfFlightAttendants = numOfFlightAttendants;
	}

	public Plane(long tailNumber) {
		super();
		this.tailNumber = tailNumber;
	}

	public long getTailNumber() {
		return tailNumber;
	}

	public void setTailNumber(long tailNumber) {
		this.tailNumber = tailNumber;
	}

	public int getNumOfFlightAttendants() {
		return numOfFlightAttendants;
	}

	public void setNumOfFlightAttendants(int numOfFlightAttendants) {
		this.numOfFlightAttendants = numOfFlightAttendants;
	}

	@Override
	public int hashCode() {
		return Objects.hash(numOfFlightAttendants, tailNumber);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Plane other = (Plane) obj;
		return numOfFlightAttendants == other.numOfFlightAttendants && tailNumber == other.tailNumber;
	}

	@Override
	public String toString() {
		return "Plane [tailNumber=" + tailNumber + ", numOfFlightAttendants=" + numOfFlightAttendants + "]";
	}
    
}
