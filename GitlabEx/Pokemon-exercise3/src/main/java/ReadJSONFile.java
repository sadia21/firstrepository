import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Iterator;

public class ReadJSONFile {

    //constructor
    ReadJSONFile() throws FileNotFoundException, ParseException, IOException {

    }
    public void printFIleJS() throws IOException, ParseException {
        JSONParser parser = new JSONParser();
        // Reading example Json file
        FileReader reader = new FileReader("example-member-list.json");
        // Parsing the data
        Object obj = parser.parse(reader);
        // A JSON object. Key value pairs are unordered. JSONObject supports java.util.Map interface.
        JSONObject jsonObject = (JSONObject) obj;
        // A JSON array. JSONObject supports java.util.List interface.
        JSONArray membersArray = (JSONArray) jsonObject.get("members");
        // Members element has array of names and ids.. printing Array key and value.
        System.out.println("---------------------------------  Members are : -------------------------------------");
        for (int i = 0; i < membersArray.size(); i++) {
            JSONObject members = (JSONObject) membersArray.get(i);
            String name = (String) members.get("name");
            String id = (String) members.get("id");
            System.out.println("name: "+ name+", id: "+ id);


        }
    }
}
