import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class BrandASmartBulb extends SmartBulb {
    @Override
    public void setPowerUsage() {
        // file path and name
        String file_path = "src/Database.txt";

        try (BufferedReader reader = new BufferedReader(new FileReader(file_path))) {
            String line; // string containing the line read from file
            while ((line = reader.readLine()) != null) {
                // process each line here
                if(line.contains("BrandAPowerUsage")) {
                    String[] line_index = line.split(" "); // split number and descriptor
                    this.power_usage = Double.parseDouble(line_index[1]);
                    System.out.println("Found data in database.");
                    System.out.println("Setting power usage to: " + this.power_usage);
                }
            }
        } catch (IOException e) {
            System.err.println("Error reading file: " + e.getMessage());
        }
    }
}
