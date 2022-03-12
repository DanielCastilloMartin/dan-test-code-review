package es.daniel.test.etalentum.danijavatest.utils;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.util.List;

public class JsonUtils {

    private JsonUtils(){
        throw new IllegalStateException();
    }

    public static <T>List<T> convertFromJsonToList(String json, TypeReference<List<T>> listObject) throws IOException{
        return getObjectMapper().readValue(json, listObject);

    }

    public static <T> T covertFromJsonToObject(String json, Class<T> object) throws IOException{
        return getObjectMapper().readValue(json, object);

    }

    public static String convertFromObjectToJson(Object object) throws JsonProcessingException{
        return getObjectMapper().writeValueAsString(object);
        
    }

    private static ObjectMapper getObjectMapper(){
        ObjectMapper objectMapper = new ObjectMapper();
        objectMapper.disable(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES);
        return objectMapper;

    }

}
