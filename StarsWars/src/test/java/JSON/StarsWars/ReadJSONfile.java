package JSON.StarsWars;
import java.io.FileNotFoundException;
import org.junit.jupiter.api.Test;

import java.io.FileReader;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

public class ReadJSONfile {  
        
        String JSONfile = System.getProperty("user.dir") + "\\input.json";
        
        @Test
        public void testReader() {
        try
        { 
        	JSONParser parser = new JSONParser();
            Object object = parser.parse(new FileReader(JSONfile));
            
            //convert Object to JSONObject
            //JSONObject jsonObject = (JSONObject)object;
            JSONArray list= (JSONArray)object;     

            
            //Printing all the values
            for(Object o : list)
            {
            	JSONObject jsonObject = (JSONObject) o;
            	//Reading the String
                Long id = (Long) jsonObject.get("id");
                String name =  (String) jsonObject.get("name");
                Long height = (Long) jsonObject.get("height");
                String birth_year = (String) jsonObject.get("birthYear");
                String gender = (String) jsonObject.get("gender");
                //Print the values         
                System.out.println("Id: " + id);
                System.out.println("Name: " + name);
                System.out.println("Height: " + height);
                System.out.println("Birth year: " + birth_year);
                System.out.println("Gender: " + gender);
                System.out.println("\n");
            }
            
        }
        catch(FileNotFoundException fe)
        {
            fe.printStackTrace();
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }
}