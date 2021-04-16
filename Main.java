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
	public static void loadData(ArrayList<Patient> patientList) {
		// console scanner
		Scanner in = new Scanner(System.in);

		System.out.println("Enter filepath to CSV file:");

		try {
			File myFile = new File(in.nextLine());
			Scanner fileInput = new Scanner(myFile);

			// the first line of the file is just the title of each column
			String line = fileInput.nextLine();

			while (fileInput.hasNextLine()) {
				Patient newPatient = new Patient();

				line = fileInput.nextLine();

				Scanner lineScanner = new Scanner(line);

				lineScanner.useDelimiter(",");
				newPatient.setID(lineScanner.nextInt());
				newPatient.setFirstName(lineScanner.next());
				newPatient.setLastName(lineScanner.next());
				newPatient.setType(lineScanner.next());
				newPatient.setDate(lineScanner.next());
				newPatient.setCountry(lineScanner.next());

				patientList.add(newPatient);
			}
		} catch (FileNotFoundException e) {
			System.out.println("That file does not exist.");
		}

		for (Patient patient : patientList) {
			System.out.printf("%d,%s,%s,%s,%s,%s%n", patient.getID(), patient.getFirstName(), patient.getLastName(), patient.getType(), patient.getDate(), patient.getCountry());
		}

	}

	public void addData(ArrayList<Patient> patientList) {

	}

	// saveData: Save all the information in the application table to a cvs file
	// Right now it doesn't have the button jet, only creates a csv file 
	public static void saveData(ArrayList<Patient> patientList) {
		//Name of Document
		String csvName = "data.txt";
		File csvFile = new File(csvName);
		//Create csv file 
		try (PrintWriter csvWriter = new PrintWriter(new FileWriter(csvFile));){
		//Write in data items in patientList
		for(Patient items : patientList){
			csvWriter.println(items);
		}
		} catch (IOException e) {
			//Handle exception
			e.printStackTrace();
		}
	}

	public void visualizeData(ArrayList<Patient> patientList) {

	}
}
