package entity;

import java.time.LocalDate;
import java.util.Objects;

public class Flight {
	private long flightID;
	private LocalDate timeOfDeparture;
	private LocalDate timeOfArrival;
	private Airport originAirport;
	private Airport destinationAirport;
	private Pilot captain;
	private Pilot co_pilot;
	
	public Flight(long flightID, LocalDate timeOfDeparture, LocalDate timeOfArrival, Airport originAirport,
			Airport destinationAirport, Pilot captain, Pilot co_pilot) {
		super();
		this.flightID = flightID;
		this.timeOfDeparture = timeOfDeparture;
		this.timeOfArrival = timeOfArrival;
		this.originAirport = originAirport;
		this.destinationAirport = destinationAirport;
		this.captain = captain;
		this.co_pilot = co_pilot;
	}

	public long getFlightID() {
		return flightID;
	}

	public void setFlightID(long flightID) {
		this.flightID = flightID;
	}

	public LocalDate getTimeOfDeparture() {
		return timeOfDeparture;
	}

	public void setTimeOfDeparture(LocalDate timeOfDeparture) {
		this.timeOfDeparture = timeOfDeparture;
	}

	public LocalDate getTimeOfArrival() {
		return timeOfArrival;
	}

	public void setTimeOfArrival(LocalDate timeOfArrival) {
		this.timeOfArrival = timeOfArrival;
	}

	public Airport getOriginAirport() {
		return originAirport;
	}

	public void setOriginAirport(Airport originAirport) {
		this.originAirport = originAirport;
	}

	public Airport getDestinationAirport() {
		return destinationAirport;
	}

	public void setDestinationAirport(Airport destinationAirport) {
		this.destinationAirport = destinationAirport;
	}

	public Pilot getCaptain() {
		return captain;
	}

	public void setCaptain(Pilot captain) {
		this.captain = captain;
	}

	public Pilot getCo_pilot() {
		return co_pilot;
	}

	public void setCo_pilot(Pilot co_pilot) {
		this.co_pilot = co_pilot;
	}

	@Override
	public int hashCode() {
		return Objects.hash(captain, co_pilot, destinationAirport, flightID, originAirport, timeOfArrival,
				timeOfDeparture);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Flight other = (Flight) obj;
		return Objects.equals(captain, other.captain) && Objects.equals(co_pilot, other.co_pilot)
				&& Objects.equals(destinationAirport, other.destinationAirport) && flightID == other.flightID
				&& Objects.equals(originAirport, other.originAirport)
				&& Objects.equals(timeOfArrival, other.timeOfArrival)
				&& Objects.equals(timeOfDeparture, other.timeOfDeparture);
	}

	@Override
	public String toString() {
		return "Flight [flightID=" + flightID + ", timeOfDeparture=" + timeOfDeparture + ", timeOfArrival="
				+ timeOfArrival + ", originAirport=" + originAirport + ", destinationAirport=" + destinationAirport
				+ ", captain=" + captain + ", co_pilot=" + co_pilot + "]";
	}

}
