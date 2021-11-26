package entity;

import java.time.LocalDate;
import java.util.Objects;

public class FlightAttendant {
	private long attendantID;
	private String firstName;
	private String lastName;
	private LocalDate recruitmentDate;
	private LocalDate retirementDate;
	
	/**
	 * Constructor for an attendant that is currently employed
	 * @param attendantID
	 * @param firstName
	 * @param lastName
	 * @param recruitmentDate
	 */
	public FlightAttendant(long attendantID, String firstName, String lastName, LocalDate recruitmentDate) {
		super();
		this.attendantID = attendantID;
		this.firstName = firstName;
		this.lastName = lastName;
		this.recruitmentDate = recruitmentDate;
	}

	/**
	 * Constructor for a retired attendant
	 * @param attendantID
	 * @param firstName
	 * @param lastName
	 * @param recruitmentDate
	 * @param retirementDate
	 */
	public FlightAttendant(long attendantID, String firstName, String lastName, LocalDate recruitmentDate,
			LocalDate retirementDate) {
		super();
		this.attendantID = attendantID;
		this.firstName = firstName;
		this.lastName = lastName;
		this.recruitmentDate = recruitmentDate;
		this.retirementDate = retirementDate;
	}

	/**
	 * @return the attendantID
	 */
	public long getAttendantID() {
		return attendantID;
	}

	/**
	 * @param The attendantID to set
	 */
	public void setAttendantID(long attendantID) {
		this.attendantID = attendantID;
	}

	/**
	 * @return the firstName
	 */
	public String getFirstName() {
		return firstName;
	}

	/**
	 * @param The firstName to set
	 */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	/**
	 * @return the lastName
	 */
	public String getLastName() {
		return lastName;
	}

	/**
	 * @param The lastName to set
	 */
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	/**
	 * @return the recruitmentDate
	 */
	public LocalDate getRecruitmentDate() {
		return recruitmentDate;
	}

	/**
	 * @param The recruitmentDate to set
	 */
	public void setRecruitmentDate(LocalDate recruitmentDate) {
		this.recruitmentDate = recruitmentDate;
	}

	/**
	 * @return the retirementDate
	 */
	public LocalDate getRetirementDate() {
		return retirementDate;
	}

	/**
	 * @param The retirementDate to set
	 */
	public void setRetirementDate(LocalDate retirementDate) {
		this.retirementDate = retirementDate;
	}

	@Override
	public int hashCode() {
		return Objects.hash(attendantID, firstName, lastName, recruitmentDate, retirementDate);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		FlightAttendant other = (FlightAttendant) obj;
		return attendantID == other.attendantID && Objects.equals(firstName, other.firstName)
				&& Objects.equals(lastName, other.lastName) && Objects.equals(recruitmentDate, other.recruitmentDate)
				&& Objects.equals(retirementDate, other.retirementDate);
	}

	@Override
	public String toString() {
		return "FlightAttendant [attendantID=" + attendantID + ", firstName=" + firstName + ", lastName=" + lastName
				+ ", recruitmentDate=" + recruitmentDate + ", retirementDate=" + retirementDate + "]";
	}
	
	

}
