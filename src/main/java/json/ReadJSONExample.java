package json;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class ReadJSONExample {
  @SuppressWarnings("unchecked")
  public static void main(String[] args) {
    JSONParser jsonParser = new JSONParser();

    try (FileReader file = new FileReader("employees.json")) {
      // Read json file
      Object obj = jsonParser.parse(file);
      JSONArray jsonArray = (JSONArray) obj;
      System.out.println(jsonArray);

      jsonArray.forEach(e -> {
        parseEmployeeObject((JSONObject) e);
        System.out.println();
      });


    } catch (FileNotFoundException e) {
      e.printStackTrace();
    } catch (IOException e) {
      e.printStackTrace();
    } catch (ParseException e) {
      e.printStackTrace();
    }
  }

  public static void parseEmployeeObject(JSONObject employee) {
    JSONObject employeeObject = (JSONObject) employee.get("employee");

    // Get employee first name
    String firstName = (String) employeeObject.get("firstName");
    System.out.println(firstName);

    // Get employee last name
    String lastName = (String) employeeObject.get("lastName");
    System.out.println(lastName);

    // Get employee website name
    String website = (String) employeeObject.get("website");
    System.out.println(website);
  }
}


