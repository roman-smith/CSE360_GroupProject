import java.lang.*;
import java.time.*;
import java.util.*;

public class Patient {
	private int ID;
	private String firstName;
	private String lastName;
	private String type; // MIGHT want to convert this to enum but I don't think so as of rn
	private LocalDate date; // using the java.time.LocalDate class -- can probably just use string if you prefer
	private String country; // is called 'location' in the slides but country is more specific

	// unparameterized constructor
	public Patient() {
		this.ID = -1;
		this.firstName = "";
		this.lastName = "";
		this.type = "";
		this.date = null;
		this.country = "";
	}

	// parameterized constructor
	public Patient(int ID, String firstName, String lastName, String type, LocalDate date, String country) {
		this.ID = ID;
		this.firstName = firstName;
		this.lastName = lastName;
		this.type = type;
		this.date = date;
		this.country = country;
	}

	public int getID() {
		return ID;
	}

	public void setID(int ID) {
		this.ID = ID;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public LocalDate getDate() {
		return date;
	}

	public void setDate(LocalDate date) {
		this.date = date;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}
}