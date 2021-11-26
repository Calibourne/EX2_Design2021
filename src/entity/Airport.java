package entity;

import java.util.Objects;

public class Airport {
	private long airportID;
	private String country;
	private String city;
	private int timezone;

	public Airport(long airportID, String country, String city, int timezone) {
		super();
		this.airportID = airportID;
		this.country = country;
		this.city = city;
		this.timezone = timezone;
	}

	public long getAirportID() {
		return airportID;
	}

	public void setAirportID(long airportID) {
		this.airportID = airportID;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public int getTimezone() {
		return timezone;
	}

	public void setTimezone(int timezone) {
		this.timezone = timezone;
	}

	@Override
	public int hashCode() {
		return Objects.hash(airportID, city, country, timezone);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Airport other = (Airport) obj;
		return airportID == other.airportID && Objects.equals(city, other.city)
				&& Objects.equals(country, other.country) && timezone == other.timezone;
	}

	@Override
	public String toString() {
		return "Airport [airportID=" + airportID + ", country=" + country + ", city=" + city + ", timezone=" + timezone
				+ "]";
	}

}
