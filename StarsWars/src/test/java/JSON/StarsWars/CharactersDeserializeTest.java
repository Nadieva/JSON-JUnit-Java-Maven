package JSON.StarsWars;
import java.util.logging.Logger;

import javax.json.bind.Jsonb;
import javax.json.bind.JsonbBuilder;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.junit.jupiter.api.Test;

import JSON.StarsWars.Character;

public class CharactersDeserializeTest {
    private final static Logger LOGGER = Logger.getLogger(
           CharactersDeserializeTest.class.getName());
	String JSONfile = System.getProperty("user.dir") + "\\input.json";

    @Test
    public void testSetCharacterSimple() {
        String json = "{\"name\":\"Anakin Skywalker\","
                + "\"id\":\"123\","
                + "\"birthYear\":\"41.9BBY\","
                + "\"height\":\"188\","
               	+ "\"gender\":\"male\"}";
               	
        Jsonb jsonb = JsonbBuilder.create();
        Character character = jsonb.fromJson(json, Character.class);
        LOGGER.info("Character: " + character);
	     
    }
}