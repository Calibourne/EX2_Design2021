package entity;

import java.time.LocalDate;
import java.util.Objects;

public class Pilot {
	private long pilotID;
	private String firstName;
	private String lastName;
	private LocalDate recruitmentDate;
	private LocalDate retirementDate;
	private long licenseNum;
	private LocalDate licenseIssueDate;
	
	/**
	 * Constructor that includes a retirement date (full constructor)
	 * @param pilotID
	 * @param firstName
	 * @param lastName
	 * @param recruitmentDate
	 * @param retirementDate
	 * @param licenseNum
	 * @param licenseIssueDate
	 */
	public Pilot(long pilotID, String firstName, String lastName, LocalDate recruitmentDate, LocalDate retirementDate,
			long licenseNum, LocalDate licenseIssueDate) {
		super();
		this.pilotID = pilotID;
		this.firstName = firstName;
		this.lastName = lastName;
		this.recruitmentDate = recruitmentDate;
		this.retirementDate = retirementDate;
		this.licenseNum = licenseNum;
		this.licenseIssueDate = licenseIssueDate;
	}

	/**
	 * Constructor for a currently employed pilot
	 * @param pilotID
	 * @param firstName
	 * @param lastName
	 * @param recruitmentDate
	 * @param licenseNum
	 * @param licenseIssueDate
	 */
	public Pilot(long pilotID, String firstName, String lastName, LocalDate recruitmentDate, long licenseNum,
			LocalDate licenseIssueDate) {
		super();
		this.pilotID = pilotID;
		this.firstName = firstName;
		this.lastName = lastName;
		this.recruitmentDate = recruitmentDate;
		this.licenseNum = licenseNum;
		this.licenseIssueDate = licenseIssueDate;
	}

	/**
	 * @return the pilotID
	 */
	public long getPilotID() {
		return pilotID;
	}

	/**
	 * @param pilotID the pilotID to set
	 */
	public void setPilotID(long pilotID) {
		this.pilotID = pilotID;
	}

	/**
	 * @return the firstName
	 */
	public String getFirstName() {
		return firstName;
	}

	/**
	 * @param firstName the firstName to set
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
	 * @param lastName the lastName to set
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
	 * @param recruitmentDate the recruitmentDate to set
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
	 * @param retirementDate the retirementDate to set
	 */
	public void setRetirementDate(LocalDate retirementDate) {
		this.retirementDate = retirementDate;
	}

	/**
	 * @return the licenseNum
	 */
	public long getLicenseNum() {
		return licenseNum;
	}

	/**
	 * @param licenseNum the licenseNum to set
	 */
	public void setLicenseNum(long licenseNum) {
		this.licenseNum = licenseNum;
	}

	/**
	 * @return the licenseIssueDate
	 */
	public LocalDate getLicenseIssueDate() {
		return licenseIssueDate;
	}

	/**
	 * @param licenseIssueDate the licenseIssueDate to set
	 */
	public void setLicenseIssueDate(LocalDate licenseIssueDate) {
		this.licenseIssueDate = licenseIssueDate;
	}

	@Override
	public int hashCode() {
		return Objects.hash(firstName, lastName, licenseIssueDate, licenseNum, pilotID, recruitmentDate,
				retirementDate);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Pilot other = (Pilot) obj;
		return Objects.equals(firstName, other.firstName) && Objects.equals(lastName, other.lastName)
				&& Objects.equals(licenseIssueDate, other.licenseIssueDate) && licenseNum == other.licenseNum
				&& pilotID == other.pilotID && Objects.equals(recruitmentDate, other.recruitmentDate)
				&& Objects.equals(retirementDate, other.retirementDate);
	}

	@Override
	public String toString() {
		return "Pilot [pilotID=" + pilotID + ", firstName=" + firstName + ", lastName=" + lastName
				+ ", recruitmentDate=" + recruitmentDate + ", retirementDate=" + retirementDate + ", licenseNum="
				+ licenseNum + ", licenseIssueDate=" + licenseIssueDate + "]";
	}

}
