<Tester.java>
package L10Q4;

/* Date Format = "ddMMyyyy:hh" */

public class Tester {

    public static void main(String[] args) {

        Appointment apmt = new Appointment();
        apmt.book("05122022:21", "11122022:20");
    }
}

<Appointment.java>
package L10Q4;

import java.io.*;
import java.time.LocalDateTime;

public class Appointment implements Searchable {

    // Methods
    public void book(String dateStartTime, String dateEndTime) {
        try {
            FileWriter file = new FileWriter("./L10Q4/io_files/appointment.txt", true);
            String appointment = String.format("%s,%s\n", dateStartTime, dateEndTime);
            if (this.search(dateStartTime, dateEndTime)) {
                file.write(appointment);
                System.out.println("Appointment Booked!");
            }
            else {
                System.out.println("There are other appointments already!");
            }
            file.close();
        }
        catch (IOException e) { System.out.printf("IO Exception: %s\n", e); }
    }
    @Override
    public boolean search(String dateStartTime, String dateEndTime) {
        boolean isAvailable = true;
        try {
            BufferedReader file = new BufferedReader(new FileReader("./L10Q4/io_files/appointment.txt"));
            String thisLine;
            while ((thisLine = file.readLine()) != null) {
                if (!this.noCrash(dateStartTime, dateEndTime, thisLine)) { isAvailable = false; break; }
            }
            file.close();
        }
        catch (FileNotFoundException e) { System.out.println("File Not Found!"); }
        catch (IOException e) { System.out.printf("IO Exception: %s\n", e); }
        return isAvailable;
    }

    private boolean noCrash(String dateStartTime, String dateEndTime, String fileTime) {
        String start = fileTime.split(",")[0], end = fileTime.split(",")[1];
        LocalDateTime date_start = LocalDateTime.of(
                Integer.parseInt(dateStartTime.substring(4, 8)), Integer.parseInt(dateStartTime.substring(2, 4)), Integer.parseInt(dateStartTime.substring(0, 2)),
                Integer.parseInt(dateStartTime.substring(9)), 0, 0
        );
        LocalDateTime date_end = LocalDateTime.of(
                Integer.parseInt(dateEndTime.substring(4, 8)), Integer.parseInt(dateEndTime.substring(2, 4)), Integer.parseInt(dateEndTime.substring(0, 2)),
                Integer.parseInt(dateEndTime.substring(9)), 0, 0
        );
        LocalDateTime line_start = LocalDateTime.of(
                Integer.parseInt(start.substring(4, 8)), Integer.parseInt(start.substring(2, 4)), Integer.parseInt(start.substring(0, 2)),
                Integer.parseInt(start.substring(9)), 0, 0
        );
        LocalDateTime line_end = LocalDateTime.of(
                Integer.parseInt(end.substring(4, 8)), Integer.parseInt(end.substring(2, 4)), Integer.parseInt(end.substring(0, 2)),
                Integer.parseInt(end.substring(9)), 0, 0
        );
        return date_end.isBefore(line_start) || date_start.isAfter(line_end);
    }
}

<Searchable.java>
package L10Q4;

public interface Searchable {
    public boolean search(String dateStartTime, String dateEndTime);
}
