import java.lang.*;
import java.time.*;
import java.util.*;
import java.io.*;

// idk if we need these in this file or if we need to have a separate JavaFX application file
//import javafx.application.Application;
//import javafx.stage.Stage;

class Main {
	// main method
	public static void main(String[] args) {
		// main list of Patient objects to store all of our data
		ArrayList<Patient> patientList = new ArrayList<Patient>();
	}

	// other methods
	// IDK WHAT RETURN TYPE EACH HAS, WE CAN CHANGE IF NEED BE
	public void loadData() {
		BufferedReader read = null;
	
		try {   
			// Create Buffer reader object to read cvs file 
			read = new BufferedReader(new FileReader("input.cvs"));
			String readlines;
			while ((readlines = read.readLine()) != null) {
				readlines = read.readLine();
				if (readlines == null) {
					break;
				}
				//Read from cvs file 
				String[] lineValues = readlines.split(","); //split the string on this value into array
				String idInt = lineValues[0];
				String lastName = lineValues[1];
				String firstName = lineValues[2];
				String type = lineValues[3];
				String date = lineValues[4];
				String country = lineValues[5];

				//Convert ID to int 
				int ID = Integer.parseInt(idInt);
				//Check this because it might be becasue it is LocalDate type
				//Patient patient = new Patient(ID, firstName, lastName, type, date, country);
			}
		}
			
			catch (FileNotFoundException e) {
			e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			} finally {
				if (read != null) {
					try {
						read.close();
					} catch (IOException e) {
						e.printStackTrace();
					}
				}
			}
	}

	public void addData(ArrayList<Patient> patientList) {

	}

	public void saveData(ArrayList<Patient> patientList) {

	}

	public void visualizeData(ArrayList<Patient> patientList) {

	}
}
