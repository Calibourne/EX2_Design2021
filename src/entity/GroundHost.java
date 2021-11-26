package entity;

import java.time.LocalDate;

public class GroundHost {
	private long groundHostID;
	private String firstName;
	private String lastName;
	private LocalDate recruitmentDate;
	private LocalDate retirementDate;
	
	/**
	 * Constructor for a ground host which is currently employed
	 * @param groundHostID
	 * @param firstName
	 * @param lastName
	 * @param recruitmentDate
	 */
	public GroundHost(long groundHostID, String firstName, String lastName, LocalDate recruitmentDate) {
		super();
		this.groundHostID = groundHostID;
		this.firstName = firstName;
		this.lastName = lastName;
		this.recruitmentDate = recruitmentDate;
	}
	/**
	 * Constructor for a ground host which is retired
	 * @param groundHostID
	 * @param firstName
	 * @param lastName
	 * @param recruitmentDate
	 * @param retirementDate
	 */
	public GroundHost(long groundHostID, String firstName, String lastName, LocalDate recruitmentDate,
			LocalDate retirementDate) {
		super();
		this.groundHostID = groundHostID;
		this.firstName = firstName;
		this.lastName = lastName;
		this.recruitmentDate = recruitmentDate;
		this.retirementDate = retirementDate;
	}
	/**
	 * @return the groundHostID
	 */
	public long getGroundHostID() {
		return groundHostID;
	}
	/**
	 * @param The groundHostID to set
	 */
	public void setGroundHostID(long groundHostID) {
		this.groundHostID = groundHostID;
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

	
}
