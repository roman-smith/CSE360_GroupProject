import java.util.ArrayList;
import java.io.*;

public class saveData {
    ArrayList<Patient> patientList;

    public saveData(ArrayList<Patient> patientList) {
        this.patientList = patientList;
        saveMethod(patientList);
    }

    private void saveMethod(ArrayList<Patient> patientList) {
        //Name of Document
		String csvName = "data.csv";
		File csvFile = new File(csvName);
		//Create csv file
		try (PrintWriter csvWriter = new PrintWriter(new FileWriter(csvFile));){
            // write first line
            csvWriter.println("ID,Last Name,First Name,Vaccine Type,Vaccination Date,Vaccine Location");

            //Write in data items in patientList
			for(Patient patient : patientList){
                csvWriter.print(patient.getID() + ","
                                + patient.getFirstName() + ","
                                + patient.getLastName() + ","
                                + patient.getType() + ","
                                + patient.getDate() + ","
                                + patient.getCountry() + '\n');
			}
		} catch (IOException e) {
			//Handle exception
			e.printStackTrace();
		}
    }
}
