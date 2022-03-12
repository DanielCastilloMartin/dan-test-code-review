package es.daniel.test.etalentum.danijavatest.utils;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.util.List;

public class JsonUtils {

    public static <T>List<T> convertFromJsonToList(String json, TypeReference<List<T>> listObject) throws JsonParseException, JsonMappingException, IOException{
        return getObjectMapper().readValue(json, listObject);
    }

    public static <T> T covertFromJsonToObject(String json, Class<T> object) throws IOException{
        return getObjectMapper().readValue(json, object);

    }

    public static String convertFromObjectToJson(Object object) throws JsonProcessingException{
        return getObjectMapper().writeValueAsString(object);
        
    }

    private static ObjectMapper getObjectMapper(){
        return new ObjectMapper();

    }

}
