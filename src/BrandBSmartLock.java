import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class BrandBSmartLock extends SmartLock {
    @Override
    public void setBatteryConsumption() {
        // file path and name
        String file_path = "src/Database.txt";

        try (BufferedReader reader = new BufferedReader(new FileReader(file_path))) {
            String line; // string containing the line read from file
            while ((line = reader.readLine()) != null) {
                // process each line here
                if(line.contains("BrandBBatteryConsumption")) {
                    String[] line_index = line.split(" "); // split number and descriptor
                    this.battery_consumption = Double.parseDouble(line_index[1]);
                    System.out.println("Found data in database.");
                    System.out.println("Setting battery consumption to: " + this.battery_consumption);
                }
            }
        } catch (IOException e) {
            System.err.println("Error reading file: " + e.getMessage());
        }
    }
}
