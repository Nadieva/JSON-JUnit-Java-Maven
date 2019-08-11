package JSON.StarsWars;
import static org.junit.Assert.assertNotNull;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

import javax.json.bind.Jsonb;
import javax.json.bind.JsonbBuilder;
import javax.json.bind.JsonbConfig;

//import org.eclipse.yasson.internal.serializer.JsonObjectSerializer;
import org.junit.jupiter.api.Test;
import JSON.StarsWars.Character;

public class CharactersSerializeTest {
    private final static Logger LOGGER = Logger.getLogger(
            CharactersSerializeTest.class.getName());
    String JSONfile = System.getProperty("user.dir") + "\\output.json";
    
    @Test
    public void testSerialize() {
        
        
        try {
        	List<Character> character = new ArrayList<>();

            Character character1 = new Character();
            character1.setId(123L);
            character1.setName("Anakin Skywalker");
            character1.setHeight(188);
            character1.setBirthYear("41.9BBY");
            character1.setGender("male");
            character.add(character1);

            Character character2 = new Character();
            character2.setId(456L);
            character2.setName("Wilhuff Tarkin");
            character2.setHeight(180);
            character2.setBirthYear("64BBY");
            character2.setGender("male");
            character.add(character2);

            Character character3 = new Character();
            character3.setId(789L);
            character3.setName("Chewbacca");
            character3.setHeight(228);
            character3.setBirthYear("200BBY");
            character3.setGender("male");
            character.add(character3);

            Character character4 = new Character();
            character4.setId(111L);
            character4.setName("Greedo");
            character4.setBirthYear("44BBY");
            character4.setGender("male");
            character.add(character4);        

            JsonbConfig jsonbConfig = new JsonbConfig();
            jsonbConfig.withFormatting(true);

            Jsonb jsonb = JsonbBuilder.create(jsonbConfig);
            String json = jsonb.toJson(character);
            assertNotNull(json);
            LOGGER.info("Json-Dokument: " + json);

            //jsonb.fromJson(json, ArrayList.class).stream().forEach(System.out::println);

            character = jsonb.fromJson(json,
                    new ArrayList<Character>() {

    					/**
    					 * 
    					 */
    					private static final long serialVersionUID = 2162290488619722640L;
                    }.getClass().getGenericSuperclass());
            LOGGER.info("Character(s): " + character);
            
            FileWriter file = new FileWriter(JSONfile);
            file.write(json);
            file.close();
         } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
         }
    }
}